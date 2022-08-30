# ChartDataPostProcessingOperation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**OperationEnum**](#OperationEnum) | Post processing operation type | 
**options** | **Object** | Options specifying how to perform the operation. Please refer to the respective post processing operation option schemas. For example, &#x60;ChartDataPostProcessingOperationOptions&#x60; specifies the required options for the pivot operation. |  [optional]

<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
_FLATTEN_COLUMN_AFTER_PIVOT | &quot;_flatten_column_after_pivot&quot;
AGGREGATE | &quot;aggregate&quot;
BOXPLOT | &quot;boxplot&quot;
COMPARE | &quot;compare&quot;
CONTRIBUTION | &quot;contribution&quot;
CUM | &quot;cum&quot;
DIFF | &quot;diff&quot;
FLATTEN | &quot;flatten&quot;
GEODETIC_PARSE | &quot;geodetic_parse&quot;
GEOHASH_DECODE | &quot;geohash_decode&quot;
GEOHASH_ENCODE | &quot;geohash_encode&quot;
PIVOT | &quot;pivot&quot;
PROPHET | &quot;prophet&quot;
RENAME | &quot;rename&quot;
RESAMPLE | &quot;resample&quot;
ROLLING | &quot;rolling&quot;
SELECT | &quot;select&quot;
SORT | &quot;sort&quot;
