# ChartDataFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**col** | **Object** | The column to filter by. Can be either a string (physical or saved expression) or an object (adhoc column) | 
**grain** | **String** | Optional time grain for temporal filters |  [optional]
**isExtra** | **Boolean** | Indicates if the filter has been added by a filter component as opposed to being a part of the original query. |  [optional]
**op** | [**OpEnum**](#OpEnum) | The comparison operator. | 
**val** | **Object** | The value or values to compare against. Can be a string, integer, decimal or list, depending on the operator. |  [optional]

<a name="OpEnum"></a>
## Enum: OpEnum
Name | Value
---- | -----
_U | &quot;&#x3D;&#x3D;&quot;
NOT_EQUAL | &quot;!&#x3D;&quot;
GREATER_THAN | &quot;&gt;&quot;
LESS_THAN | &quot;&lt;&quot;
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;
LIKE | &quot;LIKE&quot;
ILIKE | &quot;ILIKE&quot;
IS_NULL | &quot;IS NULL&quot;
IS_NOT_NULL | &quot;IS NOT NULL&quot;
IN | &quot;IN&quot;
NOT_IN | &quot;NOT IN&quot;
REGEX | &quot;REGEX&quot;
IS_TRUE | &quot;IS TRUE&quot;
IS_FALSE | &quot;IS FALSE&quot;
