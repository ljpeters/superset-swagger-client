# AnnotationLayer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotationType** | [**AnnotationTypeEnum**](#AnnotationTypeEnum) | Type of annotation layer |  [optional]
**color** | **String** | Layer color |  [optional]
**descriptionColumns** | **List&lt;String&gt;** | Columns to use as the description. If none are provided, all will be shown. |  [optional]
**hideLine** | **Boolean** | Should line be hidden. Only applies to line annotations |  [optional]
**intervalEndColumn** | **String** | Column containing end of interval. Only applies to interval layers |  [optional]
**name** | **String** | Name of layer | 
**opacity** | [**OpacityEnum**](#OpacityEnum) | Opacity of layer |  [optional]
**overrides** | **Map&lt;String, Object&gt;** | which properties should be overridable |  [optional]
**show** | **Boolean** | Should the layer be shown | 
**showLabel** | **Boolean** | Should the label always be shown |  [optional]
**showMarkers** | **Boolean** | Should markers be shown. Only applies to line annotations. | 
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | Type of source for annotation data |  [optional]
**style** | [**StyleEnum**](#StyleEnum) | Line style. Only applies to time-series annotations |  [optional]
**timeColumn** | **String** | Column with event date or interval start date |  [optional]
**titleColumn** | **String** | Column with title |  [optional]
**value** | **Object** | For formula annotations, this contains the formula. For other types, this is the primary key of the source object. | 
**width** | **Float** | Width of annotation line |  [optional]

<a name="AnnotationTypeEnum"></a>
## Enum: AnnotationTypeEnum
Name | Value
---- | -----
FORMULA | &quot;FORMULA&quot;
INTERVAL | &quot;INTERVAL&quot;
EVENT | &quot;EVENT&quot;
TIME_SERIES | &quot;TIME_SERIES&quot;

<a name="OpacityEnum"></a>
## Enum: OpacityEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
OPACITYLOW | &quot;opacityLow&quot;
OPACITYMEDIUM | &quot;opacityMedium&quot;
OPACITYHIGH | &quot;opacityHigh&quot;

<a name="SourceTypeEnum"></a>
## Enum: SourceTypeEnum
Name | Value
---- | -----
EMPTY | &quot;&quot;
LINE | &quot;line&quot;
NATIVE | &quot;NATIVE&quot;
TABLE | &quot;table&quot;

<a name="StyleEnum"></a>
## Enum: StyleEnum
Name | Value
---- | -----
DASHED | &quot;dashed&quot;
DOTTED | &quot;dotted&quot;
SOLID | &quot;solid&quot;
LONGDASHED | &quot;longDashed&quot;
