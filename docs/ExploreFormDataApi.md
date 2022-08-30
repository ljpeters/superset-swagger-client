# ExploreFormDataApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ExploreFormDataKeyDelete**](ExploreFormDataApi.md#apiV1ExploreFormDataKeyDelete) | **DELETE** /api/v1/explore/form_data/{key} | 
[**apiV1ExploreFormDataKeyGet**](ExploreFormDataApi.md#apiV1ExploreFormDataKeyGet) | **GET** /api/v1/explore/form_data/{key} | 
[**apiV1ExploreFormDataKeyPut**](ExploreFormDataApi.md#apiV1ExploreFormDataKeyPut) | **PUT** /api/v1/explore/form_data/{key} | 
[**apiV1ExploreFormDataPost**](ExploreFormDataApi.md#apiV1ExploreFormDataPost) | **POST** /api/v1/explore/form_data | 

<a name="apiV1ExploreFormDataKeyDelete"></a>
# **apiV1ExploreFormDataKeyDelete**
> InlineResponse20025 apiV1ExploreFormDataKeyDelete(key)



Deletes a form_data.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ExploreFormDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExploreFormDataApi apiInstance = new ExploreFormDataApi();
String key = "key_example"; // String | The form_data key.
try {
    InlineResponse20025 result = apiInstance.apiV1ExploreFormDataKeyDelete(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExploreFormDataApi#apiV1ExploreFormDataKeyDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| The form_data key. |

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ExploreFormDataKeyGet"></a>
# **apiV1ExploreFormDataKeyGet**
> InlineResponse20035 apiV1ExploreFormDataKeyGet(key)



Retrives a form_data.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ExploreFormDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExploreFormDataApi apiInstance = new ExploreFormDataApi();
String key = "key_example"; // String | 
try {
    InlineResponse20035 result = apiInstance.apiV1ExploreFormDataKeyGet(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExploreFormDataApi#apiV1ExploreFormDataKeyGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**|  |

### Return type

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ExploreFormDataKeyPut"></a>
# **apiV1ExploreFormDataKeyPut**
> InlineResponse20110 apiV1ExploreFormDataKeyPut(body, key, tabId)



Updates an existing form_data.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ExploreFormDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExploreFormDataApi apiInstance = new ExploreFormDataApi();
FormDataPutSchema body = new FormDataPutSchema(); // FormDataPutSchema | 
String key = "key_example"; // String | 
Integer tabId = 56; // Integer | 
try {
    InlineResponse20110 result = apiInstance.apiV1ExploreFormDataKeyPut(body, key, tabId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExploreFormDataApi#apiV1ExploreFormDataKeyPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataPutSchema**](FormDataPutSchema.md)|  |
 **key** | **String**|  |
 **tabId** | **Integer**|  | [optional]

### Return type

[**InlineResponse20110**](InlineResponse20110.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1ExploreFormDataPost"></a>
# **apiV1ExploreFormDataPost**
> InlineResponse20110 apiV1ExploreFormDataPost(body, tabId)



Stores a new form_data.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ExploreFormDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ExploreFormDataApi apiInstance = new ExploreFormDataApi();
FormDataPostSchema body = new FormDataPostSchema(); // FormDataPostSchema | 
Integer tabId = 56; // Integer | 
try {
    InlineResponse20110 result = apiInstance.apiV1ExploreFormDataPost(body, tabId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExploreFormDataApi#apiV1ExploreFormDataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FormDataPostSchema**](FormDataPostSchema.md)|  |
 **tabId** | **Integer**|  | [optional]

### Return type

[**InlineResponse20110**](InlineResponse20110.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

