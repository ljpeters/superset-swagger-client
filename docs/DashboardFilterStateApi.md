# DashboardFilterStateApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DashboardPkFilterStateKeyDelete**](DashboardFilterStateApi.md#apiV1DashboardPkFilterStateKeyDelete) | **DELETE** /api/v1/dashboard/{pk}/filter_state/{key} | 
[**apiV1DashboardPkFilterStateKeyGet**](DashboardFilterStateApi.md#apiV1DashboardPkFilterStateKeyGet) | **GET** /api/v1/dashboard/{pk}/filter_state/{key} | 
[**apiV1DashboardPkFilterStateKeyPut**](DashboardFilterStateApi.md#apiV1DashboardPkFilterStateKeyPut) | **PUT** /api/v1/dashboard/{pk}/filter_state/{key} | 
[**apiV1DashboardPkFilterStatePost**](DashboardFilterStateApi.md#apiV1DashboardPkFilterStatePost) | **POST** /api/v1/dashboard/{pk}/filter_state | 

<a name="apiV1DashboardPkFilterStateKeyDelete"></a>
# **apiV1DashboardPkFilterStateKeyDelete**
> InlineResponse20025 apiV1DashboardPkFilterStateKeyDelete(pk, key)



Deletes a value.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardFilterStateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardFilterStateApi apiInstance = new DashboardFilterStateApi();
Integer pk = 56; // Integer | 
String key = "key_example"; // String | The value key.
try {
    InlineResponse20025 result = apiInstance.apiV1DashboardPkFilterStateKeyDelete(pk, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardFilterStateApi#apiV1DashboardPkFilterStateKeyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **key** | **String**| The value key. |

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardPkFilterStateKeyGet"></a>
# **apiV1DashboardPkFilterStateKeyGet**
> InlineResponse20024 apiV1DashboardPkFilterStateKeyGet(pk, key)



Retrives a value.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardFilterStateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardFilterStateApi apiInstance = new DashboardFilterStateApi();
Integer pk = 56; // Integer | 
String key = "key_example"; // String | 
try {
    InlineResponse20024 result = apiInstance.apiV1DashboardPkFilterStateKeyGet(pk, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardFilterStateApi#apiV1DashboardPkFilterStateKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **key** | **String**|  |

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardPkFilterStateKeyPut"></a>
# **apiV1DashboardPkFilterStateKeyPut**
> InlineResponse2016 apiV1DashboardPkFilterStateKeyPut(body, pk, key, tabId)



Updates an existing value.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardFilterStateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardFilterStateApi apiInstance = new DashboardFilterStateApi();
TemporaryCachePutSchema body = new TemporaryCachePutSchema(); // TemporaryCachePutSchema | 
Integer pk = 56; // Integer | 
String key = "key_example"; // String | 
Integer tabId = 56; // Integer | 
try {
    InlineResponse2016 result = apiInstance.apiV1DashboardPkFilterStateKeyPut(body, pk, key, tabId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardFilterStateApi#apiV1DashboardPkFilterStateKeyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemporaryCachePutSchema**](TemporaryCachePutSchema.md)|  |
 **pk** | **Integer**|  |
 **key** | **String**|  |
 **tabId** | **Integer**|  | [optional]

### Return type

[**InlineResponse2016**](InlineResponse2016.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DashboardPkFilterStatePost"></a>
# **apiV1DashboardPkFilterStatePost**
> InlineResponse2016 apiV1DashboardPkFilterStatePost(body, pk, tabId)



Stores a new value.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardFilterStateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardFilterStateApi apiInstance = new DashboardFilterStateApi();
TemporaryCachePostSchema body = new TemporaryCachePostSchema(); // TemporaryCachePostSchema | 
Integer pk = 56; // Integer | 
Integer tabId = 56; // Integer | 
try {
    InlineResponse2016 result = apiInstance.apiV1DashboardPkFilterStatePost(body, pk, tabId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardFilterStateApi#apiV1DashboardPkFilterStatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**TemporaryCachePostSchema**](TemporaryCachePostSchema.md)|  |
 **pk** | **Integer**|  |
 **tabId** | **Integer**|  | [optional]

### Return type

[**InlineResponse2016**](InlineResponse2016.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

