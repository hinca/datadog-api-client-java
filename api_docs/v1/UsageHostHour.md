

# UsageHostHour

Number of hosts/containers recorded for each hour for a given organization.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentHostCount** | **Long** | Contains the total number of infrastructure hosts reporting during a given hour that were running the Datadog Agent. |  [optional]
**alibabaHostCount** | **Long** | Contains the total number of hosts that reported via Alibaba integration (and were NOT running the Datadog Agent). |  [optional]
**apmHostCount** | **Long** | Shows the total number of hosts using APM during the hour, these are counted as billable (except during trial periods). |  [optional]
**awsHostCount** | **Long** | Contains the total number of hosts that reported via the AWS integration (and were NOT running the Datadog Agent). |  [optional]
**azureHostCount** | **Long** | Contains the total number of hosts that reported via Azure integration (and were NOT running the Datadog Agent). |  [optional]
**containerCount** | **Long** | Contains the total number of billable infrastructure hosts reporting during a given hour. This is the sum of &#x60;agent_host_count&#x60;, &#x60;aws_host_count&#x60;, and &#x60;gcp_host_count&#x60;. |  [optional]
**gcpHostCount** | **Long** | Contains the total number of hosts that reported via the Google Cloud integration (and were NOT running the Datadog Agent). |  [optional]
**hostCount** | **Long** | Shows the total number of containers reporting via the Docker integration during the hour. |  [optional]
**hour** | [**OffsetDateTime**](OffsetDateTime.md) | The hour for the usage. |  [optional]



