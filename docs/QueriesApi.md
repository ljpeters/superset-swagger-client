# QueriesApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1QueryDistinctColumnNameGet**](QueriesApi.md#apiV1QueryDistinctColumnNameGet) | **GET** /api/v1/query/distinct/{column_name} | 
[**apiV1QueryGet**](QueriesApi.md#apiV1QueryGet) | **GET** /api/v1/query/ | 
[**apiV1QueryPkGet**](QueriesApi.md#apiV1QueryPkGet) | **GET** /api/v1/query/{pk} | 
[**apiV1QueryRelatedColumnNameGet**](QueriesApi.md#apiV1QueryRelatedColumnNameGet) | **GET** /api/v1/query/related/{column_name} | 
[**apiV1SavedQueryDelete**](QueriesApi.md#apiV1SavedQueryDelete) | **DELETE** /api/v1/saved_query/ | 
[**apiV1SavedQueryDistinctColumnNameGet**](QueriesApi.md#apiV1SavedQueryDistinctColumnNameGet) | **GET** /api/v1/saved_query/distinct/{column_name} | 
[**apiV1SavedQueryExportGet**](QueriesApi.md#apiV1SavedQueryExportGet) | **GET** /api/v1/saved_query/export/ | 
[**apiV1SavedQueryGet**](QueriesApi.md#apiV1SavedQueryGet) | **GET** /api/v1/saved_query/ | 
[**apiV1SavedQueryImportPost**](QueriesApi.md#apiV1SavedQueryImportPost) | **POST** /api/v1/saved_query/import/ | 
[**apiV1SavedQueryInfoGet**](QueriesApi.md#apiV1SavedQueryInfoGet) | **GET** /api/v1/saved_query/_info | 
[**apiV1SavedQueryPkDelete**](QueriesApi.md#apiV1SavedQueryPkDelete) | **DELETE** /api/v1/saved_query/{pk} | 
[**apiV1SavedQueryPkGet**](QueriesApi.md#apiV1SavedQueryPkGet) | **GET** /api/v1/saved_query/{pk} | 
[**apiV1SavedQueryPkPut**](QueriesApi.md#apiV1SavedQueryPkPut) | **PUT** /api/v1/saved_query/{pk} | 
[**apiV1SavedQueryPost**](QueriesApi.md#apiV1SavedQueryPost) | **POST** /api/v1/saved_query/ | 
[**apiV1SavedQueryRelatedColumnNameGet**](QueriesApi.md#apiV1SavedQueryRelatedColumnNameGet) | **GET** /api/v1/saved_query/related/{column_name} | 

<a name="apiV1QueryDistinctColumnNameGet"></a>
# **apiV1QueryDistinctColumnNameGet**
> DistincResponseSchema apiV1QueryDistinctColumnNameGet(columnName, q)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    DistincResponseSchema result = apiInstance.apiV1QueryDistinctColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1QueryDistinctColumnNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnName** | **String**|  |
 **q** | [**GetRelatedSchema**](.md)|  | [optional]

### Return type

[**DistincResponseSchema**](DistincResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1QueryGet"></a>
# **apiV1QueryGet**
> InlineResponse20040 apiV1QueryGet(q)



Get a list of queries, use Rison or JSON query parameters for filtering, sorting, pagination and  for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20040 result = apiInstance.apiV1QueryGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1QueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1QueryPkGet"></a>
# **apiV1QueryPkGet**
> InlineResponse20041 apiV1QueryPkGet(pk, q)



Get query detail information.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20041 result = apiInstance.apiV1QueryPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1QueryPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20041**](InlineResponse20041.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1QueryRelatedColumnNameGet"></a>
# **apiV1QueryRelatedColumnNameGet**
> RelatedResponseSchema apiV1QueryRelatedColumnNameGet(columnName, q)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    RelatedResponseSchema result = apiInstance.apiV1QueryRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1QueryRelatedColumnNameGet");
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

<a name="apiV1SavedQueryDelete"></a>
# **apiV1SavedQueryDelete**
> InlineResponse400 apiV1SavedQueryDelete(q)



Deletes multiple saved queries in a bulk operation.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
GetDeleteIdsSchema q = new GetDeleteIdsSchema(); // GetDeleteIdsSchema | 
try {
    InlineResponse400 result = apiInstance.apiV1SavedQueryDelete(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryDelete");
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

<a name="apiV1SavedQueryDistinctColumnNameGet"></a>
# **apiV1SavedQueryDistinctColumnNameGet**
> DistincResponseSchema apiV1SavedQueryDistinctColumnNameGet(columnName, q)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    DistincResponseSchema result = apiInstance.apiV1SavedQueryDistinctColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryDistinctColumnNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnName** | **String**|  |
 **q** | [**GetRelatedSchema**](.md)|  | [optional]

### Return type

[**DistincResponseSchema**](DistincResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1SavedQueryExportGet"></a>
# **apiV1SavedQueryExportGet**
> File apiV1SavedQueryExportGet(q)



Exports multiple saved queries and downloads them as YAML files

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
GetExportIdsSchema q = new GetExportIdsSchema(); // GetExportIdsSchema | 
try {
    File result = apiInstance.apiV1SavedQueryExportGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetExportIdsSchema**](.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip, application/json

<a name="apiV1SavedQueryGet"></a>
# **apiV1SavedQueryGet**
> InlineResponse20047 apiV1SavedQueryGet(q)



Get a list of saved queries, use Rison or JSON query parameters for filtering, sorting, pagination and for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20047 result = apiInstance.apiV1SavedQueryGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1SavedQueryImportPost"></a>
# **apiV1SavedQueryImportPost**
> InlineResponse400 apiV1SavedQueryImportPost(formData, overwrite, passwords)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
File formData = new File("formData_example"); // File | 
Boolean overwrite = true; // Boolean | 
String passwords = "passwords_example"; // String | 
try {
    InlineResponse400 result = apiInstance.apiV1SavedQueryImportPost(formData, overwrite, passwords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryImportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formData** | **File**|  |
 **overwrite** | **Boolean**|  |
 **passwords** | **String**|  |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="apiV1SavedQueryInfoGet"></a>
# **apiV1SavedQueryInfoGet**
> InlineResponse2002 apiV1SavedQueryInfoGet(q)



Get metadata information about this API resource

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2002 result = apiInstance.apiV1SavedQueryInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryInfoGet");
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

<a name="apiV1SavedQueryPkDelete"></a>
# **apiV1SavedQueryPkDelete**
> InlineResponse400 apiV1SavedQueryPkDelete(pk)



Delete saved query

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.apiV1SavedQueryPkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryPkDelete");
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

<a name="apiV1SavedQueryPkGet"></a>
# **apiV1SavedQueryPkGet**
> InlineResponse20048 apiV1SavedQueryPkGet(pk, q)



Get a saved query

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20048 result = apiInstance.apiV1SavedQueryPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1SavedQueryPkPut"></a>
# **apiV1SavedQueryPkPut**
> InlineResponse20049 apiV1SavedQueryPkPut(body, pk)



Update a saved query

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
SavedQueryRestApiPut body = new SavedQueryRestApiPut(); // SavedQueryRestApiPut | Model schema
Integer pk = 56; // Integer | 
try {
    InlineResponse20049 result = apiInstance.apiV1SavedQueryPkPut(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryPkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SavedQueryRestApiPut**](SavedQueryRestApiPut.md)| Model schema |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1SavedQueryPost"></a>
# **apiV1SavedQueryPost**
> InlineResponse20114 apiV1SavedQueryPost(body)



Create a saved query

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
SavedQueryRestApiPost body = new SavedQueryRestApiPost(); // SavedQueryRestApiPost | Model schema
try {
    InlineResponse20114 result = apiInstance.apiV1SavedQueryPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SavedQueryRestApiPost**](SavedQueryRestApiPost.md)| Model schema |

### Return type

[**InlineResponse20114**](InlineResponse20114.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1SavedQueryRelatedColumnNameGet"></a>
# **apiV1SavedQueryRelatedColumnNameGet**
> RelatedResponseSchema apiV1SavedQueryRelatedColumnNameGet(columnName, q)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.QueriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


QueriesApi apiInstance = new QueriesApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    RelatedResponseSchema result = apiInstance.apiV1SavedQueryRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueriesApi#apiV1SavedQueryRelatedColumnNameGet");
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

