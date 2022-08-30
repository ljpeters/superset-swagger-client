# MenuApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1MenuGet**](MenuApi.md#apiV1MenuGet) | **GET** /api/v1/menu/ | 

<a name="apiV1MenuGet"></a>
# **apiV1MenuGet**
> InlineResponse20039 apiV1MenuGet()



Get the menu data structure. Returns a forest like structure with the menu the user has access to

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.MenuApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


MenuApi apiInstance = new MenuApi();
try {
    InlineResponse20039 result = apiInstance.apiV1MenuGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MenuApi#apiV1MenuGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

