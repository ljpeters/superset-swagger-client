# CssTemplatesApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1CssTemplateDelete**](CssTemplatesApi.md#apiV1CssTemplateDelete) | **DELETE** /api/v1/css_template/ | 
[**apiV1CssTemplateGet**](CssTemplatesApi.md#apiV1CssTemplateGet) | **GET** /api/v1/css_template/ | 
[**apiV1CssTemplateInfoGet**](CssTemplatesApi.md#apiV1CssTemplateInfoGet) | **GET** /api/v1/css_template/_info | 
[**apiV1CssTemplatePkDelete**](CssTemplatesApi.md#apiV1CssTemplatePkDelete) | **DELETE** /api/v1/css_template/{pk} | 
[**apiV1CssTemplatePkGet**](CssTemplatesApi.md#apiV1CssTemplatePkGet) | **GET** /api/v1/css_template/{pk} | 
[**apiV1CssTemplatePkPut**](CssTemplatesApi.md#apiV1CssTemplatePkPut) | **PUT** /api/v1/css_template/{pk} | 
[**apiV1CssTemplatePost**](CssTemplatesApi.md#apiV1CssTemplatePost) | **POST** /api/v1/css_template/ | 
[**apiV1CssTemplateRelatedColumnNameGet**](CssTemplatesApi.md#apiV1CssTemplateRelatedColumnNameGet) | **GET** /api/v1/css_template/related/{column_name} | 

<a name="apiV1CssTemplateDelete"></a>
# **apiV1CssTemplateDelete**
> InlineResponse400 apiV1CssTemplateDelete(q)



Deletes multiple css templates in a bulk operation.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.CssTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CssTemplatesApi apiInstance = new CssTemplatesApi();
GetDeleteIdsSchema q = new GetDeleteIdsSchema(); // GetDeleteIdsSchema | 
try {
    InlineResponse400 result = apiInstance.apiV1CssTemplateDelete(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CssTemplatesApi#apiV1CssTemplateDelete");
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

<a name="apiV1CssTemplateGet"></a>
# **apiV1CssTemplateGet**
> InlineResponse20012 apiV1CssTemplateGet(q)



Get a list of CSS templates, use Rison or JSON query parameters for filtering, sorting, pagination and for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.CssTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CssTemplatesApi apiInstance = new CssTemplatesApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20012 result = apiInstance.apiV1CssTemplateGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CssTemplatesApi#apiV1CssTemplateGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1CssTemplateInfoGet"></a>
# **apiV1CssTemplateInfoGet**
> InlineResponse2002 apiV1CssTemplateInfoGet(q)



Get metadata information about this API resource

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.CssTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CssTemplatesApi apiInstance = new CssTemplatesApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2002 result = apiInstance.apiV1CssTemplateInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CssTemplatesApi#apiV1CssTemplateInfoGet");
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

<a name="apiV1CssTemplatePkDelete"></a>
# **apiV1CssTemplatePkDelete**
> InlineResponse400 apiV1CssTemplatePkDelete(pk)



Delete CSS template

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.CssTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CssTemplatesApi apiInstance = new CssTemplatesApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.apiV1CssTemplatePkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CssTemplatesApi#apiV1CssTemplatePkDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1CssTemplatePkGet"></a>
# **apiV1CssTemplatePkGet**
> InlineResponse20013 apiV1CssTemplatePkGet(pk, q)



Get a CSS template

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.CssTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CssTemplatesApi apiInstance = new CssTemplatesApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20013 result = apiInstance.apiV1CssTemplatePkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CssTemplatesApi#apiV1CssTemplatePkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1CssTemplatePkPut"></a>
# **apiV1CssTemplatePkPut**
> InlineResponse20014 apiV1CssTemplatePkPut(body, pk)



Update a CSS template

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.CssTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CssTemplatesApi apiInstance = new CssTemplatesApi();
CssTemplateRestApiPut body = new CssTemplateRestApiPut(); // CssTemplateRestApiPut | Model schema
Integer pk = 56; // Integer | 
try {
    InlineResponse20014 result = apiInstance.apiV1CssTemplatePkPut(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CssTemplatesApi#apiV1CssTemplatePkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CssTemplateRestApiPut**](CssTemplateRestApiPut.md)| Model schema |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1CssTemplatePost"></a>
# **apiV1CssTemplatePost**
> InlineResponse2013 apiV1CssTemplatePost(body)



Create a CSS template

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.CssTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CssTemplatesApi apiInstance = new CssTemplatesApi();
CssTemplateRestApiPost body = new CssTemplateRestApiPost(); // CssTemplateRestApiPost | Model schema
try {
    InlineResponse2013 result = apiInstance.apiV1CssTemplatePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CssTemplatesApi#apiV1CssTemplatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CssTemplateRestApiPost**](CssTemplateRestApiPost.md)| Model schema |

### Return type

[**InlineResponse2013**](InlineResponse2013.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1CssTemplateRelatedColumnNameGet"></a>
# **apiV1CssTemplateRelatedColumnNameGet**
> RelatedResponseSchema apiV1CssTemplateRelatedColumnNameGet(columnName, q)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.CssTemplatesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CssTemplatesApi apiInstance = new CssTemplatesApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    RelatedResponseSchema result = apiInstance.apiV1CssTemplateRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CssTemplatesApi#apiV1CssTemplateRelatedColumnNameGet");
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

