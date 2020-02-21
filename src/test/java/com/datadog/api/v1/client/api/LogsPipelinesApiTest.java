/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.LogsPipeline;
import com.datadog.api.v1.client.model.LogsPipelinesOrder;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for LogsPipelinesApi
 */
@Ignore
public class LogsPipelinesApiTest {

    private final LogsPipelinesApi api = new LogsPipelinesApi();


    /**
     * Create a pipeline in your organization.
     *
     * ## Overview Create a Pipeline in your organization. ## Arguments - **&#x60;name&#x60;** [*required*]: Your pipeline name. - **&#x60;is_enabled&#x60;** [*optional*, default&#x3D;&#x60;False&#x60;]: Boolean value to enable your pipeline. - **&#x60;filter.query&#x60;** [*optional*]: Defines your pipeline filter. Only logs that match the filter criteria are processed by this pipeline. - **&#x60;processors&#x60;** [*optional*]: Ordered array of processors or nested pipelines.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLogsPipelineTest() throws ApiException {
        LogsPipeline body = null;
        LogsPipeline response = api.createLogsPipeline()
                .body(body)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a given pipeline from your organization.
     *
     * ## Overview Delete a given pipeline from your organization. ## Arguments This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLogsPipelineTest() throws ApiException {
        String pipelineId = null;
        api.deleteLogsPipeline(pipelineId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get all pipelines from your organization.
     *
     * ## Overview Get all pipelines from your organization. ## Arguments This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllLogsPipelinesTest() throws ApiException {
        List<LogsPipeline> response = api.getAllLogsPipelines()
                .execute();
        // TODO: test validations
    }

    /**
     * Get a specific pipeline from your organization.
     *
     * ## Overview Get a specific pipeline from your organization. ## Arguments This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogsPipelineTest() throws ApiException {
        String pipelineId = null;
        LogsPipeline response = api.getLogsPipeline(pipelineId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get the current order of your pipelines.
     *
     * ## Overview Get the current order of your pipelines. ## Arguments This endpoint takes no JSON arguments.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLogsPipelineOrderTest() throws ApiException {
        LogsPipelinesOrder response = api.getLogsPipelineOrder()
                .execute();
        // TODO: test validations
    }

    /**
     * Update a pipeline in your organization.
     *
     * ## Overview Update a given pipeline configuration to change it’s processors or their order. ## Arguments **Note**: Using this method updates your pipeline configuration by **replacing** your current configuration with the new one sent to your Datadog organization. - **&#x60;name&#x60;** [*required*]: Your pipeline name. - **&#x60;is_enabled&#x60;** [*optional*, default&#x3D;&#x60;False&#x60;]: Boolean value to enable your pipeline. - **&#x60;filter.query&#x60;** [*optional*]: Defines your pipeline filter. Only logs that match the filter criteria are processed by this pipeline. - **&#x60;processors&#x60;** [*optional*]: Ordered array of processors or nested pipelines.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLogsPipelineTest() throws ApiException {
        String pipelineId = null;
        LogsPipeline body = null;
        LogsPipeline response = api.updateLogsPipeline(pipelineId)
                .body(body)
                .execute();
        // TODO: test validations
    }

    /**
     * Update the order of your pipelines.
     *
     * ## Overview Update the order of your pipelines. Since logs are processed sequentially, reordering a pipeline may change the structure and content of the data processed by other pipelines and their processors. **Note**: Using the PUT method updates your pipeline order by replacing your current order with the new one sent to your Datadog organization. ## Arguments - **&#x60;pipeline_ids&#x60;** [*required*]: Ordered Array of &lt;PIPELINE_ID&gt; strings, the order of pipeline IDs in the array define the overall Pipelines order for Datadog.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLogsPipelineOrderTest() throws ApiException {
        LogsPipelinesOrder body = null;
        LogsPipelinesOrder response = api.updateLogsPipelineOrder()
                .body(body)
                .execute();
        // TODO: test validations
    }

}