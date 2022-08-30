# ImportexportApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1AssetsExportGet**](ImportexportApi.md#apiV1AssetsExportGet) | **GET** /api/v1/assets/export/ | 
[**apiV1AssetsImportPost**](ImportexportApi.md#apiV1AssetsImportPost) | **POST** /api/v1/assets/import/ | 

<a name="apiV1AssetsExportGet"></a>
# **apiV1AssetsExportGet**
> File apiV1AssetsExportGet()



Returns a ZIP file with all the Superset assets (databases, datasets, charts, dashboards, saved queries) as YAML files.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ImportexportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ImportexportApi apiInstance = new ImportexportApi();
try {
    File result = apiInstance.apiV1AssetsExportGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportexportApi#apiV1AssetsExportGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip, application/json

<a name="apiV1AssetsImportPost"></a>
# **apiV1AssetsImportPost**
> InlineResponse400 apiV1AssetsImportPost(bundle, passwords)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ImportexportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ImportexportApi apiInstance = new ImportexportApi();
File bundle = new File("bundle_example"); // File | 
String passwords = "passwords_example"; // String | 
try {
    InlineResponse400 result = apiInstance.apiV1AssetsImportPost(bundle, passwords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImportexportApi#apiV1AssetsImportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundle** | **File**|  |
 **passwords** | **String**|  |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

