# FormDataPostSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chartId** | **Integer** | The chart ID |  [optional]
**datasourceId** | **Integer** | The datasource ID | 
**datasourceType** | [**DatasourceTypeEnum**](#DatasourceTypeEnum) | The datasource type | 
**formData** | **String** | Any type of JSON supported text. | 

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
