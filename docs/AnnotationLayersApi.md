# AnnotationLayersApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1AnnotationLayerDelete**](AnnotationLayersApi.md#apiV1AnnotationLayerDelete) | **DELETE** /api/v1/annotation_layer/ | 
[**apiV1AnnotationLayerGet**](AnnotationLayersApi.md#apiV1AnnotationLayerGet) | **GET** /api/v1/annotation_layer/ | 
[**apiV1AnnotationLayerInfoGet**](AnnotationLayersApi.md#apiV1AnnotationLayerInfoGet) | **GET** /api/v1/annotation_layer/_info | 
[**apiV1AnnotationLayerPkAnnotationAnnotationIdDelete**](AnnotationLayersApi.md#apiV1AnnotationLayerPkAnnotationAnnotationIdDelete) | **DELETE** /api/v1/annotation_layer/{pk}/annotation/{annotation_id} | 
[**apiV1AnnotationLayerPkAnnotationAnnotationIdGet**](AnnotationLayersApi.md#apiV1AnnotationLayerPkAnnotationAnnotationIdGet) | **GET** /api/v1/annotation_layer/{pk}/annotation/{annotation_id} | 
[**apiV1AnnotationLayerPkAnnotationAnnotationIdPut**](AnnotationLayersApi.md#apiV1AnnotationLayerPkAnnotationAnnotationIdPut) | **PUT** /api/v1/annotation_layer/{pk}/annotation/{annotation_id} | 
[**apiV1AnnotationLayerPkAnnotationDelete**](AnnotationLayersApi.md#apiV1AnnotationLayerPkAnnotationDelete) | **DELETE** /api/v1/annotation_layer/{pk}/annotation/ | 
[**apiV1AnnotationLayerPkAnnotationGet**](AnnotationLayersApi.md#apiV1AnnotationLayerPkAnnotationGet) | **GET** /api/v1/annotation_layer/{pk}/annotation/ | 
[**apiV1AnnotationLayerPkAnnotationPost**](AnnotationLayersApi.md#apiV1AnnotationLayerPkAnnotationPost) | **POST** /api/v1/annotation_layer/{pk}/annotation/ | 
[**apiV1AnnotationLayerPkDelete**](AnnotationLayersApi.md#apiV1AnnotationLayerPkDelete) | **DELETE** /api/v1/annotation_layer/{pk} | 
[**apiV1AnnotationLayerPkGet**](AnnotationLayersApi.md#apiV1AnnotationLayerPkGet) | **GET** /api/v1/annotation_layer/{pk} | 
[**apiV1AnnotationLayerPkPut**](AnnotationLayersApi.md#apiV1AnnotationLayerPkPut) | **PUT** /api/v1/annotation_layer/{pk} | 
[**apiV1AnnotationLayerPost**](AnnotationLayersApi.md#apiV1AnnotationLayerPost) | **POST** /api/v1/annotation_layer/ | 
[**apiV1AnnotationLayerRelatedColumnNameGet**](AnnotationLayersApi.md#apiV1AnnotationLayerRelatedColumnNameGet) | **GET** /api/v1/annotation_layer/related/{column_name} | 

<a name="apiV1AnnotationLayerDelete"></a>
# **apiV1AnnotationLayerDelete**
> InlineResponse400 apiV1AnnotationLayerDelete(q)



Deletes multiple annotation layers in a bulk operation.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
GetDeleteIdsSchema q = new GetDeleteIdsSchema(); // GetDeleteIdsSchema | 
try {
    InlineResponse400 result = apiInstance.apiV1AnnotationLayerDelete(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetDeleteIdsSchema**](.md)|  | [optional]

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1AnnotationLayerGet"></a>
# **apiV1AnnotationLayerGet**
> InlineResponse2001 apiV1AnnotationLayerGet(q)



Get a list of Annotation layers, use Rison or JSON query parameters for filtering, sorting, pagination and for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse2001 result = apiInstance.apiV1AnnotationLayerGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1AnnotationLayerInfoGet"></a>
# **apiV1AnnotationLayerInfoGet**
> InlineResponse2002 apiV1AnnotationLayerInfoGet(q)



Get metadata information about this API resource

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2002 result = apiInstance.apiV1AnnotationLayerInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetInfoSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1AnnotationLayerPkAnnotationAnnotationIdDelete"></a>
# **apiV1AnnotationLayerPkAnnotationAnnotationIdDelete**
> InlineResponse400 apiV1AnnotationLayerPkAnnotationAnnotationIdDelete(pk, annotationId)



Delete Annotation layer

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
Integer pk = 56; // Integer | The annotation layer pk for this annotation
Integer annotationId = 56; // Integer | The annotation pk for this annotation
try {
    InlineResponse400 result = apiInstance.apiV1AnnotationLayerPkAnnotationAnnotationIdDelete(pk, annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerPkAnnotationAnnotationIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The annotation layer pk for this annotation |
 **annotationId** | **Integer**| The annotation pk for this annotation |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1AnnotationLayerPkAnnotationAnnotationIdGet"></a>
# **apiV1AnnotationLayerPkAnnotationAnnotationIdGet**
> InlineResponse2006 apiV1AnnotationLayerPkAnnotationAnnotationIdGet(pk, annotationId, q)



Get an Annotation layer

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
Integer pk = 56; // Integer | The annotation layer pk for this annotation
Integer annotationId = 56; // Integer | The annotation pk
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse2006 result = apiInstance.apiV1AnnotationLayerPkAnnotationAnnotationIdGet(pk, annotationId, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerPkAnnotationAnnotationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The annotation layer pk for this annotation |
 **annotationId** | **Integer**| The annotation pk |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1AnnotationLayerPkAnnotationAnnotationIdPut"></a>
# **apiV1AnnotationLayerPkAnnotationAnnotationIdPut**
> InlineResponse2007 apiV1AnnotationLayerPkAnnotationAnnotationIdPut(body, pk, annotationId)



Update an Annotation layer

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
AnnotationRestApiPut body = new AnnotationRestApiPut(); // AnnotationRestApiPut | Annotation schema
Integer pk = 56; // Integer | The annotation layer pk for this annotation
Integer annotationId = 56; // Integer | The annotation pk for this annotation
try {
    InlineResponse2007 result = apiInstance.apiV1AnnotationLayerPkAnnotationAnnotationIdPut(body, pk, annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerPkAnnotationAnnotationIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AnnotationRestApiPut**](AnnotationRestApiPut.md)| Annotation schema |
 **pk** | **Integer**| The annotation layer pk for this annotation |
 **annotationId** | **Integer**| The annotation pk for this annotation |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1AnnotationLayerPkAnnotationDelete"></a>
# **apiV1AnnotationLayerPkAnnotationDelete**
> InlineResponse400 apiV1AnnotationLayerPkAnnotationDelete(pk, q)



Deletes multiple annotation in a bulk operation.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
Integer pk = 56; // Integer | The annotation layer pk for this annotation
GetDeleteIdsSchema q = new GetDeleteIdsSchema(); // GetDeleteIdsSchema | 
try {
    InlineResponse400 result = apiInstance.apiV1AnnotationLayerPkAnnotationDelete(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerPkAnnotationDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The annotation layer pk for this annotation |
 **q** | [**GetDeleteIdsSchema**](.md)|  | [optional]

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1AnnotationLayerPkAnnotationGet"></a>
# **apiV1AnnotationLayerPkAnnotationGet**
> InlineResponse2005 apiV1AnnotationLayerPkAnnotationGet(pk, q)



Get a list of Annotation layers, use Rison or JSON query parameters for filtering, sorting, pagination and for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
Integer pk = 56; // Integer | The annotation layer id for this annotation
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse2005 result = apiInstance.apiV1AnnotationLayerPkAnnotationGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerPkAnnotationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The annotation layer id for this annotation |
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1AnnotationLayerPkAnnotationPost"></a>
# **apiV1AnnotationLayerPkAnnotationPost**
> InlineResponse2011 apiV1AnnotationLayerPkAnnotationPost(body, pk)



Create an Annotation layer

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
AnnotationRestApiPost body = new AnnotationRestApiPost(); // AnnotationRestApiPost | Annotation schema
Integer pk = 56; // Integer | The annotation layer pk for this annotation
try {
    InlineResponse2011 result = apiInstance.apiV1AnnotationLayerPkAnnotationPost(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerPkAnnotationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AnnotationRestApiPost**](AnnotationRestApiPost.md)| Annotation schema |
 **pk** | **Integer**| The annotation layer pk for this annotation |

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1AnnotationLayerPkDelete"></a>
# **apiV1AnnotationLayerPkDelete**
> InlineResponse400 apiV1AnnotationLayerPkDelete(pk)



Delete Annotation layer

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
Integer pk = 56; // Integer | The annotation layer pk for this annotation
try {
    InlineResponse400 result = apiInstance.apiV1AnnotationLayerPkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerPkDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The annotation layer pk for this annotation |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1AnnotationLayerPkGet"></a>
# **apiV1AnnotationLayerPkGet**
> InlineResponse2003 apiV1AnnotationLayerPkGet(pk, q)



Get an Annotation layer

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse2003 result = apiInstance.apiV1AnnotationLayerPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1AnnotationLayerPkPut"></a>
# **apiV1AnnotationLayerPkPut**
> InlineResponse2004 apiV1AnnotationLayerPkPut(body, pk)



Update an Annotation layer

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
AnnotationLayerRestApiPut body = new AnnotationLayerRestApiPut(); // AnnotationLayerRestApiPut | Annotation schema
Integer pk = 56; // Integer | The annotation layer pk for this annotation
try {
    InlineResponse2004 result = apiInstance.apiV1AnnotationLayerPkPut(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerPkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AnnotationLayerRestApiPut**](AnnotationLayerRestApiPut.md)| Annotation schema |
 **pk** | **Integer**| The annotation layer pk for this annotation |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1AnnotationLayerPost"></a>
# **apiV1AnnotationLayerPost**
> InlineResponse201 apiV1AnnotationLayerPost(body)



Create an Annotation layer

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
AnnotationLayerRestApiPost body = new AnnotationLayerRestApiPost(); // AnnotationLayerRestApiPost | Annotation Layer schema
try {
    InlineResponse201 result = apiInstance.apiV1AnnotationLayerPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AnnotationLayerRestApiPost**](AnnotationLayerRestApiPost.md)| Annotation Layer schema |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1AnnotationLayerRelatedColumnNameGet"></a>
# **apiV1AnnotationLayerRelatedColumnNameGet**
> RelatedResponseSchema apiV1AnnotationLayerRelatedColumnNameGet(columnName, q)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AnnotationLayersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AnnotationLayersApi apiInstance = new AnnotationLayersApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    RelatedResponseSchema result = apiInstance.apiV1AnnotationLayerRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationLayersApi#apiV1AnnotationLayerRelatedColumnNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnName** | **String**|  |
 **q** | [**GetRelatedSchema**](.md)|  | [optional]

### Return type

[**RelatedResponseSchema**](RelatedResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

