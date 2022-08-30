# AdvancedDataTypeApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1AdvancedDataTypeConvertGet**](AdvancedDataTypeApi.md#apiV1AdvancedDataTypeConvertGet) | **GET** /api/v1/advanced_data_type/convert | Returns a AdvancedDataTypeResponse object populated with the passed in args.
[**apiV1AdvancedDataTypeTypesGet**](AdvancedDataTypeApi.md#apiV1AdvancedDataTypeTypesGet) | **GET** /api/v1/advanced_data_type/types | 

<a name="apiV1AdvancedDataTypeConvertGet"></a>
# **apiV1AdvancedDataTypeConvertGet**
> AdvancedDataTypeSchema apiV1AdvancedDataTypeConvertGet(q)

Returns a AdvancedDataTypeResponse object populated with the passed in args.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AdvancedDataTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AdvancedDataTypeApi apiInstance = new AdvancedDataTypeApi();
AdvancedDataTypeConvertSchema q = new AdvancedDataTypeConvertSchema(); // AdvancedDataTypeConvertSchema | 
try {
    AdvancedDataTypeSchema result = apiInstance.apiV1AdvancedDataTypeConvertGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdvancedDataTypeApi#apiV1AdvancedDataTypeConvertGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**AdvancedDataTypeConvertSchema**](.md)|  | [optional]

### Return type

[**AdvancedDataTypeSchema**](AdvancedDataTypeSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1AdvancedDataTypeTypesGet"></a>
# **apiV1AdvancedDataTypeTypesGet**
> InlineResponse200 apiV1AdvancedDataTypeTypesGet()



Returns a list of available advanced data types.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.AdvancedDataTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


AdvancedDataTypeApi apiInstance = new AdvancedDataTypeApi();
try {
    InlineResponse200 result = apiInstance.apiV1AdvancedDataTypeTypesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdvancedDataTypeApi#apiV1AdvancedDataTypeTypesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

