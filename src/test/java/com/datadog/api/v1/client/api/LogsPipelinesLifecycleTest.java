/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */


package com.datadog.api.v1.client.api;


import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * API tests for LogsPipelinesApi
 */
public class LogsPipelinesLifecycleTest extends V1ApiTest {
    private static LogsPipelinesApi api;
    private static List<String> pipelinesToDelete;

    @Before
    public void init() {
        api = new LogsPipelinesApi(generalApiClient);
        pipelinesToDelete = new ArrayList<>();
    }

    @After
    public void deletePipelines() {
        for (String pipelineID: pipelinesToDelete) {
            try {
                api.deleteLogsPipeline(pipelineID).execute();
            } catch(ApiException e) {}
        }
    }

    @Test
    public void pipelineLifecycleTest() throws ApiException {
        long nowMillis = now.toInstant().toEpochMilli();
        api = new LogsPipelinesApi(generalApiClient);

        // Create a pipeline
        LogsProcessor grokParser = new LogsGrokParser()
                .source("src")
                .addSamplesItem("sample")
                .grok(new LogsGrokParserRules().matchRules("rule1 foo\nrule2 bar").supportRules("support baz"))
                .name("grok parser");
        LogsProcessor logDateRemapper = new LogsDateRemapper()
                .addSourcesItem("source")
                .name("log date remapper");
        LogsProcessor logStatusRemapper = new LogsStatusRemapper()
                .addSourcesItem("source")
                .name("log status remapper");
        LogsProcessor serviceRemapper = new LogsServiceRemapper()
                .addSourcesItem("source")
                .name("service remapper");
        LogsProcessor logMessageRemapper = new LogsMessageRemapper()
                .addSourcesItem("source")
                .name("log message remapper");
        LogsProcessor remapper = new LogsAttributeRemapper()
                .addSourcesItem("source")
                .sourceType("tag")
                .target("target")
                .targetType("tag")
                .preserveSource(true)
                .overrideOnConflict(true)
                .name("log message remapper");
        LogsProcessor urlParser = new LogsURLParser()
                .addSourcesItem("source")
                .target("target")
                .name("URL parser");
        LogsProcessor userAgentParser = new LogsUserAgentParser()
                .addSourcesItem("source")
                .target("target")
                .isEncoded(true)
                .name("user agent parser");
        LogsProcessor categoryProcessor = new LogsCategoryProcessor()
                .addCategoriesItem(
                        new LogsCategoryProcessorCategories()
                            .name("category")
                            .filter(new LogsFilter().query("query"))
                )
                .target("target")
                .name("category processor");
        LogsProcessor arithmeticProcessor = new LogsArithmeticProcessor()
                .expression("foo + bar")
                .target("target")
                .isReplaceMissing(true)
                .name("arithmetic processor");
        LogsProcessor stringBuilderProcessor = new LogsStringBuilderProcessor()
                .template("template")
                .target("target")
                .isReplaceMissing(true)
                .name("string builder processor");
        LogsProcessor geoIPParser = new LogsGeoIPParser()
                .addSourcesItem("source")
                .target("target")
                .name("geo IP parser");
        LogsProcessor lookupProcessor = new LogsLookupProcessor()
                .source("source")
                .target("target")
                .addLookupTableItem("key,value")
                .defaultLookup("default_lookup")
                .name("lookup processor");
        LogsProcessor traceRemapper = new LogsTraceRemapper()
                .addSourcesItem("source")
                .name("trace remapper");
        LogsProcessor pipelineProcessor = new LogsPipelineProcessor()
                .name("pipeline processor")
                .filter(new LogsFilter().query("query"))
                .addProcessorsItem(grokParser)
                .addProcessorsItem(logDateRemapper);
        LogsPipeline pipeline = new LogsPipeline()
                .isEnabled(true)
                .filter(new LogsFilter().query("query"))
                .addProcessorsItem(grokParser)
                .addProcessorsItem(logDateRemapper)
                .addProcessorsItem(logStatusRemapper)
                .addProcessorsItem(serviceRemapper)
                .addProcessorsItem(logMessageRemapper)
                .addProcessorsItem(remapper)
                .addProcessorsItem(urlParser)
                .addProcessorsItem(userAgentParser)
                .addProcessorsItem(categoryProcessor)
                .addProcessorsItem(arithmeticProcessor)
                .addProcessorsItem(stringBuilderProcessor)
                .addProcessorsItem(geoIPParser)
                .addProcessorsItem(lookupProcessor)
                .addProcessorsItem(traceRemapper)
                .addProcessorsItem(pipelineProcessor)
                .name("java-client-test-pipeline-" + nowMillis);
        LogsPipeline createdPipeline = api.createLogsPipeline().body(pipeline).execute();
        pipelinesToDelete.add(createdPipeline.getId());
        assertEquals("java-client-test-pipeline-" + nowMillis, createdPipeline.getName());
        assertTrue(createdPipeline.getIsEnabled());
        assertEquals("query", createdPipeline.getFilter().getQuery());
        assertEquals(grokParser, createdPipeline.getProcessors().get(0));
        assertEquals(logDateRemapper, createdPipeline.getProcessors().get(1));
        assertEquals(logStatusRemapper, createdPipeline.getProcessors().get(2));
        assertEquals(serviceRemapper, createdPipeline.getProcessors().get(3));
        assertEquals(logMessageRemapper, createdPipeline.getProcessors().get(4));
        assertEquals(remapper, createdPipeline.getProcessors().get(5));
        assertEquals(urlParser, createdPipeline.getProcessors().get(6));
        assertEquals(userAgentParser, createdPipeline.getProcessors().get(7));
        assertEquals(categoryProcessor, createdPipeline.getProcessors().get(8));
        assertEquals(arithmeticProcessor, createdPipeline.getProcessors().get(9));
        assertEquals(stringBuilderProcessor, createdPipeline.getProcessors().get(10));
        assertEquals(geoIPParser, createdPipeline.getProcessors().get(11));
        assertEquals(lookupProcessor, createdPipeline.getProcessors().get(12));
        assertEquals(traceRemapper, createdPipeline.getProcessors().get(13));
        assertEquals(pipelineProcessor, createdPipeline.getProcessors().get(14));

        // Nested Pipeline Assertions
        LogsPipelineProcessor nestedPipelineProcessor = (LogsPipelineProcessor) createdPipeline.getProcessors().get(14);
        assertEquals("query", nestedPipelineProcessor.getFilter().getQuery());
        assertEquals(grokParser, nestedPipelineProcessor.getProcessors().get(0));
        assertEquals(logDateRemapper, nestedPipelineProcessor.getProcessors().get(1));

        // Get all pipelines and assert our freshly created one is part of the result
        List<LogsPipeline> pipelines = api.listLogsPipelines().execute();
        boolean asserted = false;
        for(LogsPipeline pipe: pipelines) {
            if(pipe.equals(createdPipeline)){
                asserted = true;
                break;
            }
        }
        assertTrue(asserted);

        // Get the freshly created pipeline
        LogsPipeline pipe = api.getLogsPipeline(createdPipeline.getId()).execute();
        assertEquals(createdPipeline, pipe);

        // Update the pipeline
        pipeline.addProcessorsItem(pipeline.getProcessors().get(0));
        pipeline.getProcessors().remove(0);
        pipeline.setIsEnabled(false);
        pipeline.setFilter(new LogsFilter().query("updated query"));
        pipeline.setName(pipeline.getName() + "-updated");
        LogsPipeline updatedPipeline = api.updateLogsPipeline(createdPipeline.getId()).body(pipeline).execute();
        assertEquals("java-client-test-pipeline-" + nowMillis + "-updated", updatedPipeline.getName());
        assertFalse(updatedPipeline.getIsEnabled());
        assertEquals("updated query", updatedPipeline.getFilter().getQuery());
        assertEquals(grokParser, updatedPipeline.getProcessors().get(14));
        assertEquals(pipelineProcessor, updatedPipeline.getProcessors().get(13));
        assertEquals(logDateRemapper, updatedPipeline.getProcessors().get(0));
        assertEquals(logStatusRemapper, updatedPipeline.getProcessors().get(1));
        assertEquals(serviceRemapper, updatedPipeline.getProcessors().get(2));
        assertEquals(logMessageRemapper, updatedPipeline.getProcessors().get(3));
        assertEquals(remapper, updatedPipeline.getProcessors().get(4));
        assertEquals(urlParser, updatedPipeline.getProcessors().get(5));
        assertEquals(userAgentParser, updatedPipeline.getProcessors().get(6));
        assertEquals(categoryProcessor, updatedPipeline.getProcessors().get(7));
        assertEquals(arithmeticProcessor, updatedPipeline.getProcessors().get(8));
        assertEquals(stringBuilderProcessor, updatedPipeline.getProcessors().get(9));
        assertEquals(geoIPParser, updatedPipeline.getProcessors().get(10));
        assertEquals(lookupProcessor, updatedPipeline.getProcessors().get(11));
        assertEquals(traceRemapper, updatedPipeline.getProcessors().get(12));

        // Delete the pipeline
        api.deleteLogsPipeline(createdPipeline.getId()).execute();
    }
}
