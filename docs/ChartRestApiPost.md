# ChartRestApiPost

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cacheTimeout** | **Integer** | Duration (in seconds) of the caching timeout for this chart. Note this defaults to the datasource/table timeout if undefined. |  [optional]
**certificationDetails** | **String** | Details of the certification |  [optional]
**certifiedBy** | **String** | Person or group that has certified this chart |  [optional]
**dashboards** | **List&lt;Integer&gt;** |  |  [optional]
**datasourceId** | **Integer** | The id of the dataset/datasource this new chart will use. A complete datasource identification needs &#x60;datasouce_id&#x60; and &#x60;datasource_type&#x60;. | 
**datasourceName** | **String** | The datasource name. |  [optional]
**datasourceType** | [**DatasourceTypeEnum**](#DatasourceTypeEnum) | The type of dataset/datasource identified on &#x60;datasource_id&#x60;. | 
**description** | **String** | A description of the chart propose. |  [optional]
**externalUrl** | **String** |  |  [optional]
**isManagedExternally** | **Boolean** |  |  [optional]
**owners** | **List&lt;Integer&gt;** |  |  [optional]
**params** | **String** | Parameters are generated dynamically when clicking the save or overwrite button in the explore view. This JSON object for power users who may want to alter specific parameters. |  [optional]
**queryContext** | **String** | The query context represents the queries that need to run in order to generate the data the visualization, and in what format the data should be returned. |  [optional]
**queryContextGeneration** | **Boolean** | The query context generation represents whether the query_contextis user generated or not so that it does not update user modfiedstate. |  [optional]
**sliceName** | **String** | The name of the chart. | 
**vizType** | **String** | The type of chart visualization used. |  [optional]

<a name="DatasourceTypeEnum"></a>
## Enum: DatasourceTypeEnum
Name | Value
---- | -----
SL_TABLE | &quot;sl_table&quot;
TABLE | &quot;table&quot;
DATASET | &quot;dataset&quot;
QUERY | &quot;query&quot;
SAVED_QUERY | &quot;saved_query&quot;
VIEW | &quot;view&quot;
