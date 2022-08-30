# EmbeddedDashboardApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1EmbeddedDashboardUuidGet**](EmbeddedDashboardApi.md#apiV1EmbeddedDashboardUuidGet) | **GET** /api/v1/embedded_dashboard/{uuid} | 

<a name="apiV1EmbeddedDashboardUuidGet"></a>
# **apiV1EmbeddedDashboardUuidGet**
> InlineResponse20022 apiV1EmbeddedDashboardUuidGet(uuid)



Get a report schedule log

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.EmbeddedDashboardApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


EmbeddedDashboardApi apiInstance = new EmbeddedDashboardApi();
String uuid = "uuid_example"; // String | The embedded configuration uuid
try {
    InlineResponse20022 result = apiInstance.apiV1EmbeddedDashboardUuidGet(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EmbeddedDashboardApi#apiV1EmbeddedDashboardUuidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The embedded configuration uuid |

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

