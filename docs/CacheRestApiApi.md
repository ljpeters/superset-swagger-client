# CacheRestApiApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1CachekeyInvalidatePost**](CacheRestApiApi.md#apiV1CachekeyInvalidatePost) | **POST** /api/v1/cachekey/invalidate | 

<a name="apiV1CachekeyInvalidatePost"></a>
# **apiV1CachekeyInvalidatePost**
> apiV1CachekeyInvalidatePost(body)



Takes a list of datasources, finds the associated cache records and invalidates them and removes the database records

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.CacheRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


CacheRestApiApi apiInstance = new CacheRestApiApi();
CacheInvalidationRequestSchema body = new CacheInvalidationRequestSchema(); // CacheInvalidationRequestSchema | A list of datasources uuid or the tuples of database and datasource names
try {
    apiInstance.apiV1CachekeyInvalidatePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling CacheRestApiApi#apiV1CachekeyInvalidatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CacheInvalidationRequestSchema**](CacheInvalidationRequestSchema.md)| A list of datasources uuid or the tuples of database and datasource names |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

