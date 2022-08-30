# OpenApiApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiVersionOpenapiGet**](OpenApiApi.md#apiVersionOpenapiGet) | **GET** /api/{version}/_openapi | 

<a name="apiVersionOpenapiGet"></a>
# **apiVersionOpenapiGet**
> Object apiVersionOpenapiGet(version)



Get the OpenAPI spec for a specific API version

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.OpenApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


OpenApiApi apiInstance = new OpenApiApi();
String version = "version_example"; // String | 
try {
    Object result = apiInstance.apiVersionOpenapiGet(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenApiApi#apiVersionOpenapiGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**|  |

### Return type

**Object**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

