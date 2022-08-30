# ReportSchedulesApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1ReportDelete**](ReportSchedulesApi.md#apiV1ReportDelete) | **DELETE** /api/v1/report/ | 
[**apiV1ReportGet**](ReportSchedulesApi.md#apiV1ReportGet) | **GET** /api/v1/report/ | 
[**apiV1ReportInfoGet**](ReportSchedulesApi.md#apiV1ReportInfoGet) | **GET** /api/v1/report/_info | 
[**apiV1ReportPkDelete**](ReportSchedulesApi.md#apiV1ReportPkDelete) | **DELETE** /api/v1/report/{pk} | 
[**apiV1ReportPkGet**](ReportSchedulesApi.md#apiV1ReportPkGet) | **GET** /api/v1/report/{pk} | 
[**apiV1ReportPkLogGet**](ReportSchedulesApi.md#apiV1ReportPkLogGet) | **GET** /api/v1/report/{pk}/log/ | 
[**apiV1ReportPkLogLogIdGet**](ReportSchedulesApi.md#apiV1ReportPkLogLogIdGet) | **GET** /api/v1/report/{pk}/log/{log_id} | 
[**apiV1ReportPkPut**](ReportSchedulesApi.md#apiV1ReportPkPut) | **PUT** /api/v1/report/{pk} | 
[**apiV1ReportPost**](ReportSchedulesApi.md#apiV1ReportPost) | **POST** /api/v1/report/ | 
[**apiV1ReportRelatedColumnNameGet**](ReportSchedulesApi.md#apiV1ReportRelatedColumnNameGet) | **GET** /api/v1/report/related/{column_name} | 

<a name="apiV1ReportDelete"></a>
# **apiV1ReportDelete**
> InlineResponse400 apiV1ReportDelete(q)



Deletes multiple report schedules in a bulk operation.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ReportSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportSchedulesApi apiInstance = new ReportSchedulesApi();
GetDeleteIdsSchema q = new GetDeleteIdsSchema(); // GetDeleteIdsSchema | 
try {
    InlineResponse400 result = apiInstance.apiV1ReportDelete(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSchedulesApi#apiV1ReportDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetDeleteIdsSchema**](.md)|  | [optional]

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ReportGet"></a>
# **apiV1ReportGet**
> InlineResponse20042 apiV1ReportGet(q)



Get a list of report schedules, use Rison or JSON query parameters for filtering, sorting, pagination and for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ReportSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportSchedulesApi apiInstance = new ReportSchedulesApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20042 result = apiInstance.apiV1ReportGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSchedulesApi#apiV1ReportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ReportInfoGet"></a>
# **apiV1ReportInfoGet**
> InlineResponse2002 apiV1ReportInfoGet(q)



Get metadata information about this API resource

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ReportSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportSchedulesApi apiInstance = new ReportSchedulesApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2002 result = apiInstance.apiV1ReportInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSchedulesApi#apiV1ReportInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetInfoSchema**](.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ReportPkDelete"></a>
# **apiV1ReportPkDelete**
> InlineResponse400 apiV1ReportPkDelete(pk)



Delete a report schedule

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ReportSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportSchedulesApi apiInstance = new ReportSchedulesApi();
Integer pk = 56; // Integer | The report schedule pk
try {
    InlineResponse400 result = apiInstance.apiV1ReportPkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSchedulesApi#apiV1ReportPkDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The report schedule pk |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ReportPkGet"></a>
# **apiV1ReportPkGet**
> InlineResponse20043 apiV1ReportPkGet(pk, q)



Get a report schedule

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ReportSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportSchedulesApi apiInstance = new ReportSchedulesApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20043 result = apiInstance.apiV1ReportPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSchedulesApi#apiV1ReportPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ReportPkLogGet"></a>
# **apiV1ReportPkLogGet**
> InlineResponse20045 apiV1ReportPkLogGet(pk, q)



Get a list of report schedule logs, use Rison or JSON query parameters for filtering, sorting, pagination and for selecting specific columns and metadata.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ReportSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportSchedulesApi apiInstance = new ReportSchedulesApi();
Integer pk = 56; // Integer | The report schedule id for these logs
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20045 result = apiInstance.apiV1ReportPkLogGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSchedulesApi#apiV1ReportPkLogGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The report schedule id for these logs |
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ReportPkLogLogIdGet"></a>
# **apiV1ReportPkLogLogIdGet**
> InlineResponse20046 apiV1ReportPkLogLogIdGet(pk, logId, q)



Get a report schedule log

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ReportSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportSchedulesApi apiInstance = new ReportSchedulesApi();
Integer pk = 56; // Integer | The report schedule pk for log
Integer logId = 56; // Integer | The log pk
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20046 result = apiInstance.apiV1ReportPkLogLogIdGet(pk, logId, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSchedulesApi#apiV1ReportPkLogLogIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The report schedule pk for log |
 **logId** | **Integer**| The log pk |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1ReportPkPut"></a>
# **apiV1ReportPkPut**
> InlineResponse20044 apiV1ReportPkPut(body, pk)



Update a report schedule

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ReportSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportSchedulesApi apiInstance = new ReportSchedulesApi();
ReportScheduleRestApiPut body = new ReportScheduleRestApiPut(); // ReportScheduleRestApiPut | Report Schedule schema
Integer pk = 56; // Integer | The Report Schedule pk
try {
    InlineResponse20044 result = apiInstance.apiV1ReportPkPut(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSchedulesApi#apiV1ReportPkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportScheduleRestApiPut**](ReportScheduleRestApiPut.md)| Report Schedule schema |
 **pk** | **Integer**| The Report Schedule pk |

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1ReportPost"></a>
# **apiV1ReportPost**
> InlineResponse20113 apiV1ReportPost(body)



Create a report schedule

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ReportSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportSchedulesApi apiInstance = new ReportSchedulesApi();
ReportScheduleRestApiPost body = new ReportScheduleRestApiPost(); // ReportScheduleRestApiPost | Report Schedule schema
try {
    InlineResponse20113 result = apiInstance.apiV1ReportPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSchedulesApi#apiV1ReportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportScheduleRestApiPost**](ReportScheduleRestApiPost.md)| Report Schedule schema |

### Return type

[**InlineResponse20113**](InlineResponse20113.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1ReportRelatedColumnNameGet"></a>
# **apiV1ReportRelatedColumnNameGet**
> RelatedResponseSchema apiV1ReportRelatedColumnNameGet(columnName, q)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.ReportSchedulesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


ReportSchedulesApi apiInstance = new ReportSchedulesApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    RelatedResponseSchema result = apiInstance.apiV1ReportRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportSchedulesApi#apiV1ReportRelatedColumnNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnName** | **String**|  |
 **q** | [**GetRelatedSchema**](.md)|  | [optional]

### Return type

[**RelatedResponseSchema**](RelatedResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

