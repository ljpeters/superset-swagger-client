# ChartsApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ChartDataCacheKeyGet**](ChartsApi.md#apiV1ChartDataCacheKeyGet) | **GET** /api/v1/chart/data/{cache_key} | 
[**apiV1ChartDataPost**](ChartsApi.md#apiV1ChartDataPost) | **POST** /api/v1/chart/data | 
[**apiV1ChartDelete**](ChartsApi.md#apiV1ChartDelete) | **DELETE** /api/v1/chart/ | 
[**apiV1ChartExportGet**](ChartsApi.md#apiV1ChartExportGet) | **GET** /api/v1/chart/export/ | 
[**apiV1ChartFavoriteStatusGet**](ChartsApi.md#apiV1ChartFavoriteStatusGet) | **GET** /api/v1/chart/favorite_status/ | 
[**apiV1ChartGet**](ChartsApi.md#apiV1ChartGet) | **GET** /api/v1/chart/ | 
[**apiV1ChartImportPost**](ChartsApi.md#apiV1ChartImportPost) | **POST** /api/v1/chart/import/ | 
[**apiV1ChartInfoGet**](ChartsApi.md#apiV1ChartInfoGet) | **GET** /api/v1/chart/_info | 
[**apiV1ChartPkCacheScreenshotGet**](ChartsApi.md#apiV1ChartPkCacheScreenshotGet) | **GET** /api/v1/chart/{pk}/cache_screenshot/ | 
[**apiV1ChartPkDataGet**](ChartsApi.md#apiV1ChartPkDataGet) | **GET** /api/v1/chart/{pk}/data/ | 
[**apiV1ChartPkDelete**](ChartsApi.md#apiV1ChartPkDelete) | **DELETE** /api/v1/chart/{pk} | 
[**apiV1ChartPkGet**](ChartsApi.md#apiV1ChartPkGet) | **GET** /api/v1/chart/{pk} | 
[**apiV1ChartPkPut**](ChartsApi.md#apiV1ChartPkPut) | **PUT** /api/v1/chart/{pk} | 
[**apiV1ChartPkScreenshotDigestGet**](ChartsApi.md#apiV1ChartPkScreenshotDigestGet) | **GET** /api/v1/chart/{pk}/screenshot/{digest}/ | 
[**apiV1ChartPkThumbnailDigestGet**](ChartsApi.md#apiV1ChartPkThumbnailDigestGet) | **GET** /api/v1/chart/{pk}/thumbnail/{digest}/ | 
[**apiV1ChartPost**](ChartsApi.md#apiV1ChartPost) | **POST** /api/v1/chart/ | 
[**apiV1ChartRelatedColumnNameGet**](ChartsApi.md#apiV1ChartRelatedColumnNameGet) | **GET** /api/v1/chart/related/{column_name} | 

<a name="apiV1ChartDataCacheKeyGet"></a>
# **apiV1ChartDataCacheKeyGet**
> ChartDataResponseSchema apiV1ChartDataCacheKeyGet(cacheKey)



Takes a query context cache key and returns payload data response for the given query.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
String cacheKey = "cacheKey_example"; // String | 
try {
    ChartDataResponseSchema result = apiInstance.apiV1ChartDataCacheKeyGet(cacheKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartDataCacheKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cacheKey** | **String**|  |

### Return type

[**ChartDataResponseSchema**](ChartDataResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ChartDataPost"></a>
# **apiV1ChartDataPost**
> ChartDataResponseSchema apiV1ChartDataPost(body)



Takes a query context constructed in the client and returns payload data response for the given query.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
ChartDataQueryContextSchema body = new ChartDataQueryContextSchema(); // ChartDataQueryContextSchema | A query context consists of a datasource from which to fetch data and one or many query objects.
try {
    ChartDataResponseSchema result = apiInstance.apiV1ChartDataPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartDataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChartDataQueryContextSchema**](ChartDataQueryContextSchema.md)| A query context consists of a datasource from which to fetch data and one or many query objects. |

### Return type

[**ChartDataResponseSchema**](ChartDataResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1ChartDelete"></a>
# **apiV1ChartDelete**
> InlineResponse400 apiV1ChartDelete(q)



Deletes multiple Charts in a bulk operation.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
GetDeleteIdsSchema q = new GetDeleteIdsSchema(); // GetDeleteIdsSchema | 
try {
    InlineResponse400 result = apiInstance.apiV1ChartDelete(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartDelete");
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

<a name="apiV1ChartExportGet"></a>
# **apiV1ChartExportGet**
> File apiV1ChartExportGet(q)



Exports multiple charts and downloads them as YAML files

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
GetExportIdsSchema q = new GetExportIdsSchema(); // GetExportIdsSchema | 
try {
    File result = apiInstance.apiV1ChartExportGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartExportGet");
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

<a name="apiV1ChartFavoriteStatusGet"></a>
# **apiV1ChartFavoriteStatusGet**
> GetFavStarIdsSchema apiV1ChartFavoriteStatusGet(q)



Check favorited dashboards for current user

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
GetFavStarIdsSchema q = new GetFavStarIdsSchema(); // GetFavStarIdsSchema | 
try {
    GetFavStarIdsSchema result = apiInstance.apiV1ChartFavoriteStatusGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartFavoriteStatusGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetFavStarIdsSchema**](.md)|  | [optional]

### Return type

[**GetFavStarIdsSchema**](GetFavStarIdsSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ChartGet"></a>
# **apiV1ChartGet**
> InlineResponse2009 apiV1ChartGet(q)



Get a list of charts, use Rison or JSON query parameters for filtering, sorting, pagination and  for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse2009 result = apiInstance.apiV1ChartGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ChartImportPost"></a>
# **apiV1ChartImportPost**
> InlineResponse400 apiV1ChartImportPost(formData, overwrite, passwords)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
File formData = new File("formData_example"); // File | 
Boolean overwrite = true; // Boolean | 
String passwords = "passwords_example"; // String | 
try {
    InlineResponse400 result = apiInstance.apiV1ChartImportPost(formData, overwrite, passwords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartImportPost");
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

<a name="apiV1ChartInfoGet"></a>
# **apiV1ChartInfoGet**
> InlineResponse2002 apiV1ChartInfoGet(q)



Several metadata information about chart API endpoints.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2002 result = apiInstance.apiV1ChartInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartInfoGet");
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

<a name="apiV1ChartPkCacheScreenshotGet"></a>
# **apiV1ChartPkCacheScreenshotGet**
> ChartCacheScreenshotResponseSchema apiV1ChartPkCacheScreenshotGet(pk, q)



Compute and cache a screenshot.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | 
ScreenshotQuerySchema q = new ScreenshotQuerySchema(); // ScreenshotQuerySchema | 
try {
    ChartCacheScreenshotResponseSchema result = apiInstance.apiV1ChartPkCacheScreenshotGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartPkCacheScreenshotGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**ScreenshotQuerySchema**](.md)|  | [optional]

### Return type

[**ChartCacheScreenshotResponseSchema**](ChartCacheScreenshotResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ChartPkDataGet"></a>
# **apiV1ChartPkDataGet**
> ChartDataResponseSchema apiV1ChartPkDataGet(pk, format, type)



Takes a chart ID and uses the query context stored when the chart was saved to return payload data response.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | The chart ID
String format = "format_example"; // String | The format in which the data should be returned
String type = "type_example"; // String | The type in which the data should be returned
try {
    ChartDataResponseSchema result = apiInstance.apiV1ChartPkDataGet(pk, format, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartPkDataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The chart ID |
 **format** | **String**| The format in which the data should be returned | [optional]
 **type** | **String**| The type in which the data should be returned | [optional]

### Return type

[**ChartDataResponseSchema**](ChartDataResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ChartPkDelete"></a>
# **apiV1ChartPkDelete**
> InlineResponse400 apiV1ChartPkDelete(pk)



Deletes a Chart.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.apiV1ChartPkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartPkDelete");
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

<a name="apiV1ChartPkGet"></a>
# **apiV1ChartPkGet**
> InlineResponse20010 apiV1ChartPkGet(pk, q)



Get a chart detail information.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20010 result = apiInstance.apiV1ChartPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ChartPkPut"></a>
# **apiV1ChartPkPut**
> InlineResponse20011 apiV1ChartPkPut(body, pk)



Changes a Chart.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
ChartRestApiPut body = new ChartRestApiPut(); // ChartRestApiPut | Chart schema
Integer pk = 56; // Integer | 
try {
    InlineResponse20011 result = apiInstance.apiV1ChartPkPut(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartPkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChartRestApiPut**](ChartRestApiPut.md)| Chart schema |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1ChartPkScreenshotDigestGet"></a>
# **apiV1ChartPkScreenshotDigestGet**
> File apiV1ChartPkScreenshotDigestGet(pk, digest)



Get a computed screenshot from cache.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | 
String digest = "digest_example"; // String | 
try {
    File result = apiInstance.apiV1ChartPkScreenshotDigestGet(pk, digest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartPkScreenshotDigestGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **digest** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/_*, application/json

<a name="apiV1ChartPkThumbnailDigestGet"></a>
# **apiV1ChartPkThumbnailDigestGet**
> File apiV1ChartPkThumbnailDigestGet(pk, digest)



Compute or get already computed chart thumbnail from cache.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
Integer pk = 56; // Integer | 
String digest = "digest_example"; // String | 
try {
    File result = apiInstance.apiV1ChartPkThumbnailDigestGet(pk, digest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartPkThumbnailDigestGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **digest** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/_*, application/json

<a name="apiV1ChartPost"></a>
# **apiV1ChartPost**
> InlineResponse2012 apiV1ChartPost(body)



Create a new Chart.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
ChartRestApiPost body = new ChartRestApiPost(); // ChartRestApiPost | Chart schema
try {
    InlineResponse2012 result = apiInstance.apiV1ChartPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChartRestApiPost**](ChartRestApiPost.md)| Chart schema |

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1ChartRelatedColumnNameGet"></a>
# **apiV1ChartRelatedColumnNameGet**
> RelatedResponseSchema apiV1ChartRelatedColumnNameGet(columnName, q)



Get a list of all possible owners for a chart. Use &#x60;owners&#x60; has the &#x60;column_name&#x60; parameter

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ChartsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ChartsApi apiInstance = new ChartsApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    RelatedResponseSchema result = apiInstance.apiV1ChartRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChartsApi#apiV1ChartRelatedColumnNameGet");
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

