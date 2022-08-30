# LogRestApiApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1LogGet**](LogRestApiApi.md#apiV1LogGet) | **GET** /api/v1/log/ | 
[**apiV1LogPkGet**](LogRestApiApi.md#apiV1LogPkGet) | **GET** /api/v1/log/{pk} | 
[**apiV1LogPost**](LogRestApiApi.md#apiV1LogPost) | **POST** /api/v1/log/ | 

<a name="apiV1LogGet"></a>
# **apiV1LogGet**
> InlineResponse20036 apiV1LogGet(q)



Get a list of models

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.LogRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LogRestApiApi apiInstance = new LogRestApiApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20036 result = apiInstance.apiV1LogGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogRestApiApi#apiV1LogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1LogPkGet"></a>
# **apiV1LogPkGet**
> InlineResponse20037 apiV1LogPkGet(pk, q)



Get an item model

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.LogRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LogRestApiApi apiInstance = new LogRestApiApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20037 result = apiInstance.apiV1LogPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogRestApiApi#apiV1LogPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1LogPost"></a>
# **apiV1LogPost**
> InlineResponse20112 apiV1LogPost(body)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.LogRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


LogRestApiApi apiInstance = new LogRestApiApi();
LogRestApiPost body = new LogRestApiPost(); // LogRestApiPost | Model schema
try {
    InlineResponse20112 result = apiInstance.apiV1LogPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogRestApiApi#apiV1LogPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LogRestApiPost**](LogRestApiPost.md)| Model schema |

### Return type

[**InlineResponse20112**](InlineResponse20112.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

