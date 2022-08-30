# DashboardsApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DashboardDelete**](DashboardsApi.md#apiV1DashboardDelete) | **DELETE** /api/v1/dashboard/ | 
[**apiV1DashboardExportGet**](DashboardsApi.md#apiV1DashboardExportGet) | **GET** /api/v1/dashboard/export/ | 
[**apiV1DashboardFavoriteStatusGet**](DashboardsApi.md#apiV1DashboardFavoriteStatusGet) | **GET** /api/v1/dashboard/favorite_status/ | 
[**apiV1DashboardGet**](DashboardsApi.md#apiV1DashboardGet) | **GET** /api/v1/dashboard/ | 
[**apiV1DashboardIdOrSlugChartsGet**](DashboardsApi.md#apiV1DashboardIdOrSlugChartsGet) | **GET** /api/v1/dashboard/{id_or_slug}/charts | 
[**apiV1DashboardIdOrSlugDatasetsGet**](DashboardsApi.md#apiV1DashboardIdOrSlugDatasetsGet) | **GET** /api/v1/dashboard/{id_or_slug}/datasets | 
[**apiV1DashboardIdOrSlugEmbeddedDelete**](DashboardsApi.md#apiV1DashboardIdOrSlugEmbeddedDelete) | **DELETE** /api/v1/dashboard/{id_or_slug}/embedded | 
[**apiV1DashboardIdOrSlugEmbeddedGet**](DashboardsApi.md#apiV1DashboardIdOrSlugEmbeddedGet) | **GET** /api/v1/dashboard/{id_or_slug}/embedded | 
[**apiV1DashboardIdOrSlugEmbeddedPost**](DashboardsApi.md#apiV1DashboardIdOrSlugEmbeddedPost) | **POST** /api/v1/dashboard/{id_or_slug}/embedded | 
[**apiV1DashboardIdOrSlugEmbeddedPut**](DashboardsApi.md#apiV1DashboardIdOrSlugEmbeddedPut) | **PUT** /api/v1/dashboard/{id_or_slug}/embedded | 
[**apiV1DashboardIdOrSlugGet**](DashboardsApi.md#apiV1DashboardIdOrSlugGet) | **GET** /api/v1/dashboard/{id_or_slug} | 
[**apiV1DashboardImportPost**](DashboardsApi.md#apiV1DashboardImportPost) | **POST** /api/v1/dashboard/import/ | 
[**apiV1DashboardInfoGet**](DashboardsApi.md#apiV1DashboardInfoGet) | **GET** /api/v1/dashboard/_info | 
[**apiV1DashboardPkDelete**](DashboardsApi.md#apiV1DashboardPkDelete) | **DELETE** /api/v1/dashboard/{pk} | 
[**apiV1DashboardPkPut**](DashboardsApi.md#apiV1DashboardPkPut) | **PUT** /api/v1/dashboard/{pk} | 
[**apiV1DashboardPkThumbnailDigestGet**](DashboardsApi.md#apiV1DashboardPkThumbnailDigestGet) | **GET** /api/v1/dashboard/{pk}/thumbnail/{digest}/ | 
[**apiV1DashboardPost**](DashboardsApi.md#apiV1DashboardPost) | **POST** /api/v1/dashboard/ | 
[**apiV1DashboardRelatedColumnNameGet**](DashboardsApi.md#apiV1DashboardRelatedColumnNameGet) | **GET** /api/v1/dashboard/related/{column_name} | 

<a name="apiV1DashboardDelete"></a>
# **apiV1DashboardDelete**
> InlineResponse400 apiV1DashboardDelete(q)



Deletes multiple Dashboards in a bulk operation.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
GetDeleteIdsSchema q = new GetDeleteIdsSchema(); // GetDeleteIdsSchema | 
try {
    InlineResponse400 result = apiInstance.apiV1DashboardDelete(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardDelete");
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

<a name="apiV1DashboardExportGet"></a>
# **apiV1DashboardExportGet**
> String apiV1DashboardExportGet(q)



Exports multiple Dashboards and downloads them as YAML files.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
GetExportIdsSchema q = new GetExportIdsSchema(); // GetExportIdsSchema | 
try {
    String result = apiInstance.apiV1DashboardExportGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetExportIdsSchema**](.md)|  | [optional]

### Return type

**String**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a name="apiV1DashboardFavoriteStatusGet"></a>
# **apiV1DashboardFavoriteStatusGet**
> GetFavStarIdsSchema apiV1DashboardFavoriteStatusGet(q)



Check favorited dashboards for current user

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
GetFavStarIdsSchema q = new GetFavStarIdsSchema(); // GetFavStarIdsSchema | 
try {
    GetFavStarIdsSchema result = apiInstance.apiV1DashboardFavoriteStatusGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardFavoriteStatusGet");
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

<a name="apiV1DashboardGet"></a>
# **apiV1DashboardGet**
> InlineResponse20015 apiV1DashboardGet(q)



Get a list of dashboards, use Rison or JSON query parameters for filtering, sorting, pagination and  for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20015 result = apiInstance.apiV1DashboardGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardIdOrSlugChartsGet"></a>
# **apiV1DashboardIdOrSlugChartsGet**
> InlineResponse20020 apiV1DashboardIdOrSlugChartsGet(idOrSlug)



Get the chart definitions for a given dashboard

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
String idOrSlug = "idOrSlug_example"; // String | 
try {
    InlineResponse20020 result = apiInstance.apiV1DashboardIdOrSlugChartsGet(idOrSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardIdOrSlugChartsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrSlug** | **String**|  |

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardIdOrSlugDatasetsGet"></a>
# **apiV1DashboardIdOrSlugDatasetsGet**
> InlineResponse20021 apiV1DashboardIdOrSlugDatasetsGet(idOrSlug)



Returns a list of a dashboard&#x27;s datasets. Each dataset includes only the information necessary to render the dashboard&#x27;s charts.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
String idOrSlug = "idOrSlug_example"; // String | Either the id of the dashboard, or its slug
try {
    InlineResponse20021 result = apiInstance.apiV1DashboardIdOrSlugDatasetsGet(idOrSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardIdOrSlugDatasetsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrSlug** | **String**| Either the id of the dashboard, or its slug |

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardIdOrSlugEmbeddedDelete"></a>
# **apiV1DashboardIdOrSlugEmbeddedDelete**
> InlineResponse400 apiV1DashboardIdOrSlugEmbeddedDelete(idOrSlug)



Removes a dashboard&#x27;s embedded configuration.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
String idOrSlug = "idOrSlug_example"; // String | The dashboard id or slug
try {
    InlineResponse400 result = apiInstance.apiV1DashboardIdOrSlugEmbeddedDelete(idOrSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardIdOrSlugEmbeddedDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrSlug** | **String**| The dashboard id or slug |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardIdOrSlugEmbeddedGet"></a>
# **apiV1DashboardIdOrSlugEmbeddedGet**
> InlineResponse20022 apiV1DashboardIdOrSlugEmbeddedGet(idOrSlug)



Returns the dashboard&#x27;s embedded configuration

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
String idOrSlug = "idOrSlug_example"; // String | The dashboard id or slug
try {
    InlineResponse20022 result = apiInstance.apiV1DashboardIdOrSlugEmbeddedGet(idOrSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardIdOrSlugEmbeddedGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrSlug** | **String**| The dashboard id or slug |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardIdOrSlugEmbeddedPost"></a>
# **apiV1DashboardIdOrSlugEmbeddedPost**
> InlineResponse20022 apiV1DashboardIdOrSlugEmbeddedPost(body, idOrSlug)



Sets a dashboard&#x27;s embedded configuration.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
EmbeddedDashboardConfig body = new EmbeddedDashboardConfig(); // EmbeddedDashboardConfig | The embedded configuration to set
String idOrSlug = "idOrSlug_example"; // String | The dashboard id or slug
try {
    InlineResponse20022 result = apiInstance.apiV1DashboardIdOrSlugEmbeddedPost(body, idOrSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardIdOrSlugEmbeddedPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmbeddedDashboardConfig**](EmbeddedDashboardConfig.md)| The embedded configuration to set |
 **idOrSlug** | **String**| The dashboard id or slug |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DashboardIdOrSlugEmbeddedPut"></a>
# **apiV1DashboardIdOrSlugEmbeddedPut**
> InlineResponse20022 apiV1DashboardIdOrSlugEmbeddedPut(body, idOrSlug)



Sets a dashboard&#x27;s embedded configuration.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
EmbeddedDashboardConfig body = new EmbeddedDashboardConfig(); // EmbeddedDashboardConfig | The embedded configuration to set
String idOrSlug = "idOrSlug_example"; // String | The dashboard id or slug
try {
    InlineResponse20022 result = apiInstance.apiV1DashboardIdOrSlugEmbeddedPut(body, idOrSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardIdOrSlugEmbeddedPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EmbeddedDashboardConfig**](EmbeddedDashboardConfig.md)| The embedded configuration to set |
 **idOrSlug** | **String**| The dashboard id or slug |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DashboardIdOrSlugGet"></a>
# **apiV1DashboardIdOrSlugGet**
> InlineResponse20019 apiV1DashboardIdOrSlugGet(idOrSlug)



Get a dashboard detail information.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
String idOrSlug = "idOrSlug_example"; // String | Either the id of the dashboard, or its slug
try {
    InlineResponse20019 result = apiInstance.apiV1DashboardIdOrSlugGet(idOrSlug);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardIdOrSlugGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idOrSlug** | **String**| Either the id of the dashboard, or its slug |

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardImportPost"></a>
# **apiV1DashboardImportPost**
> InlineResponse400 apiV1DashboardImportPost(formData, overwrite, passwords)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
File formData = new File("formData_example"); // File | 
Boolean overwrite = true; // Boolean | 
String passwords = "passwords_example"; // String | 
try {
    InlineResponse400 result = apiInstance.apiV1DashboardImportPost(formData, overwrite, passwords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardImportPost");
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

<a name="apiV1DashboardInfoGet"></a>
# **apiV1DashboardInfoGet**
> InlineResponse2002 apiV1DashboardInfoGet(q)



Several metadata information about dashboard API endpoints.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2002 result = apiInstance.apiV1DashboardInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardInfoGet");
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

<a name="apiV1DashboardPkDelete"></a>
# **apiV1DashboardPkDelete**
> InlineResponse400 apiV1DashboardPkDelete(pk)



Deletes a Dashboard.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.apiV1DashboardPkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardPkDelete");
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

<a name="apiV1DashboardPkPut"></a>
# **apiV1DashboardPkPut**
> InlineResponse20023 apiV1DashboardPkPut(body, pk)



Changes a Dashboard.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
DashboardRestApiPut body = new DashboardRestApiPut(); // DashboardRestApiPut | Dashboard schema
Integer pk = 56; // Integer | 
try {
    InlineResponse20023 result = apiInstance.apiV1DashboardPkPut(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardPkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DashboardRestApiPut**](DashboardRestApiPut.md)| Dashboard schema |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DashboardPkThumbnailDigestGet"></a>
# **apiV1DashboardPkThumbnailDigestGet**
> File apiV1DashboardPkThumbnailDigestGet(pk, digest, q)



Compute async or get already computed dashboard thumbnail from cache.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
Integer pk = 56; // Integer | 
String digest = "digest_example"; // String | A hex digest that makes this dashboard unique
ThumbnailQuerySchema q = new ThumbnailQuerySchema(); // ThumbnailQuerySchema | 
try {
    File result = apiInstance.apiV1DashboardPkThumbnailDigestGet(pk, digest, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardPkThumbnailDigestGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **digest** | **String**| A hex digest that makes this dashboard unique |
 **q** | [**ThumbnailQuerySchema**](.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/_*, application/json

<a name="apiV1DashboardPost"></a>
# **apiV1DashboardPost**
> InlineResponse2014 apiV1DashboardPost(body)



Create a new Dashboard.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
DashboardRestApiPost body = new DashboardRestApiPost(); // DashboardRestApiPost | Dashboard schema
try {
    InlineResponse2014 result = apiInstance.apiV1DashboardPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DashboardRestApiPost**](DashboardRestApiPost.md)| Dashboard schema |

### Return type

[**InlineResponse2014**](InlineResponse2014.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DashboardRelatedColumnNameGet"></a>
# **apiV1DashboardRelatedColumnNameGet**
> RelatedResponseSchema apiV1DashboardRelatedColumnNameGet(columnName, q)



Get a list of all possible owners for a dashboard.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardsApi apiInstance = new DashboardsApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    RelatedResponseSchema result = apiInstance.apiV1DashboardRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardsApi#apiV1DashboardRelatedColumnNameGet");
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

