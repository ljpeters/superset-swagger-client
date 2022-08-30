# Datasource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**databaseName** | **String** | Datasource name |  [optional]
**datasourceName** | **String** | The datasource name. |  [optional]
**datasourceType** | [**DatasourceTypeEnum**](#DatasourceTypeEnum) | The type of dataset/datasource identified on &#x60;datasource_id&#x60;. | 
**schema** | **String** | Datasource schema |  [optional]

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
