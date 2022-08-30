# DashboardPermanentLinkApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DashboardPermalinkKeyGet**](DashboardPermanentLinkApi.md#apiV1DashboardPermalinkKeyGet) | **GET** /api/v1/dashboard/permalink/{key} | 
[**apiV1DashboardPkPermalinkPost**](DashboardPermanentLinkApi.md#apiV1DashboardPkPermalinkPost) | **POST** /api/v1/dashboard/{pk}/permalink | 

<a name="apiV1DashboardPermalinkKeyGet"></a>
# **apiV1DashboardPermalinkKeyGet**
> InlineResponse20016 apiV1DashboardPermalinkKeyGet(key)



Retrives dashboard state associated with a permanent link.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardPermanentLinkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardPermanentLinkApi apiInstance = new DashboardPermanentLinkApi();
String key = "key_example"; // String | 
try {
    InlineResponse20016 result = apiInstance.apiV1DashboardPermalinkKeyGet(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardPermanentLinkApi#apiV1DashboardPermalinkKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**|  |

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardPkPermalinkPost"></a>
# **apiV1DashboardPkPermalinkPost**
> InlineResponse2017 apiV1DashboardPkPermalinkPost(body, pk)



Stores a new permanent link.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DashboardPermanentLinkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DashboardPermanentLinkApi apiInstance = new DashboardPermanentLinkApi();
DashboardPermalinkPostSchema body = new DashboardPermalinkPostSchema(); // DashboardPermalinkPostSchema | 
String pk = "pk_example"; // String | 
try {
    InlineResponse2017 result = apiInstance.apiV1DashboardPkPermalinkPost(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DashboardPermanentLinkApi#apiV1DashboardPkPermalinkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DashboardPermalinkPostSchema**](DashboardPermalinkPostSchema.md)|  |
 **pk** | **String**|  |

### Return type

[**InlineResponse2017**](InlineResponse2017.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

