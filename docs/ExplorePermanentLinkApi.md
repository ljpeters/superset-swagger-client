# ExplorePermanentLinkApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ExplorePermalinkKeyGet**](ExplorePermanentLinkApi.md#apiV1ExplorePermalinkKeyGet) | **GET** /api/v1/explore/permalink/{key} | 
[**apiV1ExplorePermalinkPost**](ExplorePermanentLinkApi.md#apiV1ExplorePermalinkPost) | **POST** /api/v1/explore/permalink | 

<a name="apiV1ExplorePermalinkKeyGet"></a>
# **apiV1ExplorePermalinkKeyGet**
> InlineResponse20016 apiV1ExplorePermalinkKeyGet(key)



Retrives chart state associated with a permanent link.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ExplorePermanentLinkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExplorePermanentLinkApi apiInstance = new ExplorePermanentLinkApi();
String key = "key_example"; // String | 
try {
    InlineResponse20016 result = apiInstance.apiV1ExplorePermalinkKeyGet(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorePermanentLinkApi#apiV1ExplorePermalinkKeyGet");
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

<a name="apiV1ExplorePermalinkPost"></a>
# **apiV1ExplorePermalinkPost**
> InlineResponse20111 apiV1ExplorePermalinkPost(body)



Stores a new permanent link.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ExplorePermanentLinkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExplorePermanentLinkApi apiInstance = new ExplorePermanentLinkApi();
ExplorePermalinkPostSchema body = new ExplorePermalinkPostSchema(); // ExplorePermalinkPostSchema | 
try {
    InlineResponse20111 result = apiInstance.apiV1ExplorePermalinkPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorePermanentLinkApi#apiV1ExplorePermalinkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExplorePermalinkPostSchema**](ExplorePermalinkPostSchema.md)|  |

### Return type

[**InlineResponse20111**](InlineResponse20111.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

