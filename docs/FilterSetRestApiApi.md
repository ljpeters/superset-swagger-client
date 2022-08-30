# FilterSetRestApiApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DashboardDashboardIdFiltersetsGet**](FilterSetRestApiApi.md#apiV1DashboardDashboardIdFiltersetsGet) | **GET** /api/v1/dashboard/{dashboard_id}/filtersets | 
[**apiV1DashboardDashboardIdFiltersetsPkDelete**](FilterSetRestApiApi.md#apiV1DashboardDashboardIdFiltersetsPkDelete) | **DELETE** /api/v1/dashboard/{dashboard_id}/filtersets/{pk} | 
[**apiV1DashboardDashboardIdFiltersetsPkPut**](FilterSetRestApiApi.md#apiV1DashboardDashboardIdFiltersetsPkPut) | **PUT** /api/v1/dashboard/{dashboard_id}/filtersets/{pk} | 
[**apiV1DashboardDashboardIdFiltersetsPost**](FilterSetRestApiApi.md#apiV1DashboardDashboardIdFiltersetsPost) | **POST** /api/v1/dashboard/{dashboard_id}/filtersets | 

<a name="apiV1DashboardDashboardIdFiltersetsGet"></a>
# **apiV1DashboardDashboardIdFiltersetsGet**
> List&lt;InlineResponse20017&gt; apiV1DashboardDashboardIdFiltersetsGet(dashboardId)



Get a dashboard&#x27;s list of filter sets

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.FilterSetRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilterSetRestApiApi apiInstance = new FilterSetRestApiApi();
Integer dashboardId = 56; // Integer | The id of the dashboard
try {
    List<InlineResponse20017> result = apiInstance.apiV1DashboardDashboardIdFiltersetsGet(dashboardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterSetRestApiApi#apiV1DashboardDashboardIdFiltersetsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **Integer**| The id of the dashboard |

### Return type

[**List&lt;InlineResponse20017&gt;**](InlineResponse20017.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardDashboardIdFiltersetsPkDelete"></a>
# **apiV1DashboardDashboardIdFiltersetsPkDelete**
> InlineResponse400 apiV1DashboardDashboardIdFiltersetsPkDelete(dashboardId, pk)



Deletes a Dashboard.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.FilterSetRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilterSetRestApiApi apiInstance = new FilterSetRestApiApi();
Integer dashboardId = 56; // Integer | 
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.apiV1DashboardDashboardIdFiltersetsPkDelete(dashboardId, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterSetRestApiApi#apiV1DashboardDashboardIdFiltersetsPkDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardId** | **Integer**|  |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DashboardDashboardIdFiltersetsPkPut"></a>
# **apiV1DashboardDashboardIdFiltersetsPkPut**
> InlineResponse20018 apiV1DashboardDashboardIdFiltersetsPkPut(body, dashboardId, pk)



Changes a Dashboard&#x27;s Filter set.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.FilterSetRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilterSetRestApiApi apiInstance = new FilterSetRestApiApi();
FilterSetRestApiPut body = new FilterSetRestApiPut(); // FilterSetRestApiPut | Filter set schema
Integer dashboardId = 56; // Integer | 
Integer pk = 56; // Integer | 
try {
    InlineResponse20018 result = apiInstance.apiV1DashboardDashboardIdFiltersetsPkPut(body, dashboardId, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterSetRestApiApi#apiV1DashboardDashboardIdFiltersetsPkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilterSetRestApiPut**](FilterSetRestApiPut.md)| Filter set schema |
 **dashboardId** | **Integer**|  |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DashboardDashboardIdFiltersetsPost"></a>
# **apiV1DashboardDashboardIdFiltersetsPost**
> InlineResponse2015 apiV1DashboardDashboardIdFiltersetsPost(body, dashboardId)



Create a new Dashboard&#x27;s Filter Set.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.FilterSetRestApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


FilterSetRestApiApi apiInstance = new FilterSetRestApiApi();
FilterSetRestApiPost body = new FilterSetRestApiPost(); // FilterSetRestApiPost | Filter set schema
Integer dashboardId = 56; // Integer | The id of the dashboard
try {
    InlineResponse2015 result = apiInstance.apiV1DashboardDashboardIdFiltersetsPost(body, dashboardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilterSetRestApiApi#apiV1DashboardDashboardIdFiltersetsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilterSetRestApiPost**](FilterSetRestApiPost.md)| Filter set schema |
 **dashboardId** | **Integer**| The id of the dashboard |

### Return type

[**InlineResponse2015**](InlineResponse2015.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

