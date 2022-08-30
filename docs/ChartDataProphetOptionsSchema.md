# ChartDataProphetOptionsSchema

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**confidenceInterval** | **Float** | Width of predicted confidence interval | 
**monthlySeasonality** | **Object** | Should monthly seasonality be applied. An integer value will specify Fourier order of seasonality, &#x60;None&#x60; will automatically detect seasonality. |  [optional]
**periods** | **Integer** |  | 
**timeGrain** | [**TimeGrainEnum**](#TimeGrainEnum) | Time grain used to specify time period increments in prediction. Supports [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Durations) durations. | 
**weeklySeasonality** | **Object** | Should weekly seasonality be applied. An integer value will specify Fourier order of seasonality, &#x60;None&#x60; will automatically detect seasonality. |  [optional]
**yearlySeasonality** | **Object** | Should yearly seasonality be applied. An integer value will specify Fourier order of seasonality, &#x60;None&#x60; will automatically detect seasonality. |  [optional]

<a name="TimeGrainEnum"></a>
## Enum: TimeGrainEnum
Name | Value
---- | -----
PT1S | &quot;PT1S&quot;
PT5S | &quot;PT5S&quot;
PT30S | &quot;PT30S&quot;
PT1M | &quot;PT1M&quot;
PT5M | &quot;PT5M&quot;
PT10M | &quot;PT10M&quot;
PT15M | &quot;PT15M&quot;
PT30M | &quot;PT30M&quot;
PT1H | &quot;PT1H&quot;
PT6H | &quot;PT6H&quot;
P1D | &quot;P1D&quot;
P1W | &quot;P1W&quot;
P1M | &quot;P1M&quot;
P3M | &quot;P3M&quot;
P1Y | &quot;P1Y&quot;
_1969_12_28T00_00_00Z_P1W | &quot;1969-12-28T00:00:00Z/P1W&quot;
_1969_12_29T00_00_00Z_P1W | &quot;1969-12-29T00:00:00Z/P1W&quot;
P1W_1970_01_03T00_00_00Z | &quot;P1W/1970-01-03T00:00:00Z&quot;
P1W_1970_01_04T00_00_00Z | &quot;P1W/1970-01-04T00:00:00Z&quot;
