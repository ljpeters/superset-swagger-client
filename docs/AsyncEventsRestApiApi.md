# AsyncEventsRestApiApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1AsyncEventGet**](AsyncEventsRestApiApi.md#apiV1AsyncEventGet) | **GET** /api/v1/async_event/ | 

<a name="apiV1AsyncEventGet"></a>
# **apiV1AsyncEventGet**
> InlineResponse2008 apiV1AsyncEventGet(lastId)



Reads off of the Redis events stream, using the user&#x27;s JWT token and optional query params for last event received.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AsyncEventsRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AsyncEventsRestApiApi apiInstance = new AsyncEventsRestApiApi();
String lastId = "lastId_example"; // String | Last ID received by the client
try {
    InlineResponse2008 result = apiInstance.apiV1AsyncEventGet(lastId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AsyncEventsRestApiApi#apiV1AsyncEventGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastId** | **String**| Last ID received by the client | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

