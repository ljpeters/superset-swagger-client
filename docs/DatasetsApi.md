# DatasetsApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DatasetDelete**](DatasetsApi.md#apiV1DatasetDelete) | **DELETE** /api/v1/dataset/ | 
[**apiV1DatasetDistinctColumnNameGet**](DatasetsApi.md#apiV1DatasetDistinctColumnNameGet) | **GET** /api/v1/dataset/distinct/{column_name} | 
[**apiV1DatasetExportGet**](DatasetsApi.md#apiV1DatasetExportGet) | **GET** /api/v1/dataset/export/ | 
[**apiV1DatasetGet**](DatasetsApi.md#apiV1DatasetGet) | **GET** /api/v1/dataset/ | 
[**apiV1DatasetImportPost**](DatasetsApi.md#apiV1DatasetImportPost) | **POST** /api/v1/dataset/import/ | 
[**apiV1DatasetInfoGet**](DatasetsApi.md#apiV1DatasetInfoGet) | **GET** /api/v1/dataset/_info | 
[**apiV1DatasetPkColumnColumnIdDelete**](DatasetsApi.md#apiV1DatasetPkColumnColumnIdDelete) | **DELETE** /api/v1/dataset/{pk}/column/{column_id} | 
[**apiV1DatasetPkDelete**](DatasetsApi.md#apiV1DatasetPkDelete) | **DELETE** /api/v1/dataset/{pk} | 
[**apiV1DatasetPkGet**](DatasetsApi.md#apiV1DatasetPkGet) | **GET** /api/v1/dataset/{pk} | 
[**apiV1DatasetPkMetricMetricIdDelete**](DatasetsApi.md#apiV1DatasetPkMetricMetricIdDelete) | **DELETE** /api/v1/dataset/{pk}/metric/{metric_id} | 
[**apiV1DatasetPkPut**](DatasetsApi.md#apiV1DatasetPkPut) | **PUT** /api/v1/dataset/{pk} | 
[**apiV1DatasetPkRefreshPut**](DatasetsApi.md#apiV1DatasetPkRefreshPut) | **PUT** /api/v1/dataset/{pk}/refresh | 
[**apiV1DatasetPkRelatedObjectsGet**](DatasetsApi.md#apiV1DatasetPkRelatedObjectsGet) | **GET** /api/v1/dataset/{pk}/related_objects | 
[**apiV1DatasetPkSamplesGet**](DatasetsApi.md#apiV1DatasetPkSamplesGet) | **GET** /api/v1/dataset/{pk}/samples | 
[**apiV1DatasetPost**](DatasetsApi.md#apiV1DatasetPost) | **POST** /api/v1/dataset/ | 
[**apiV1DatasetRelatedColumnNameGet**](DatasetsApi.md#apiV1DatasetRelatedColumnNameGet) | **GET** /api/v1/dataset/related/{column_name} | 

<a name="apiV1DatasetDelete"></a>
# **apiV1DatasetDelete**
> InlineResponse400 apiV1DatasetDelete(q)



Deletes multiple Datasets in a bulk operation.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
GetDeleteIdsSchema q = new GetDeleteIdsSchema(); // GetDeleteIdsSchema | 
try {
    InlineResponse400 result = apiInstance.apiV1DatasetDelete(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetDelete");
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

<a name="apiV1DatasetDistinctColumnNameGet"></a>
# **apiV1DatasetDistinctColumnNameGet**
> DistincResponseSchema apiV1DatasetDistinctColumnNameGet(columnName, q)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    DistincResponseSchema result = apiInstance.apiV1DatasetDistinctColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetDistinctColumnNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **columnName** | **String**|  |
 **q** | [**GetRelatedSchema**](.md)|  | [optional]

### Return type

[**DistincResponseSchema**](DistincResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatasetExportGet"></a>
# **apiV1DatasetExportGet**
> String apiV1DatasetExportGet(q)



Exports multiple datasets and downloads them as YAML files

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
GetExportIdsSchema q = new GetExportIdsSchema(); // GetExportIdsSchema | 
try {
    String result = apiInstance.apiV1DatasetExportGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetExportIdsSchema**](.md)|  | [optional]

### Return type

**String**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json

<a name="apiV1DatasetGet"></a>
# **apiV1DatasetGet**
> InlineResponse20031 apiV1DatasetGet(q)



Get a list of models

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20031 result = apiInstance.apiV1DatasetGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatasetImportPost"></a>
# **apiV1DatasetImportPost**
> InlineResponse400 apiV1DatasetImportPost(formData, overwrite, passwords)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
File formData = new File("formData_example"); // File | 
Boolean overwrite = true; // Boolean | 
String passwords = "passwords_example"; // String | 
try {
    InlineResponse400 result = apiInstance.apiV1DatasetImportPost(formData, overwrite, passwords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetImportPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formData** | **File**|  |
 **overwrite** | **Boolean**|  |
 **passwords** | **String**|  |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="apiV1DatasetInfoGet"></a>
# **apiV1DatasetInfoGet**
> InlineResponse2002 apiV1DatasetInfoGet(q)



Get metadata information about this API resource

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2002 result = apiInstance.apiV1DatasetInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetInfoGet");
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

<a name="apiV1DatasetPkColumnColumnIdDelete"></a>
# **apiV1DatasetPkColumnColumnIdDelete**
> InlineResponse400 apiV1DatasetPkColumnColumnIdDelete(pk, columnId)



Delete a Dataset column

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | The dataset pk for this column
Integer columnId = 56; // Integer | The column id for this dataset
try {
    InlineResponse400 result = apiInstance.apiV1DatasetPkColumnColumnIdDelete(pk, columnId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetPkColumnColumnIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The dataset pk for this column |
 **columnId** | **Integer**| The column id for this dataset |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatasetPkDelete"></a>
# **apiV1DatasetPkDelete**
> InlineResponse400 apiV1DatasetPkDelete(pk)



Deletes a Dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.apiV1DatasetPkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetPkDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatasetPkGet"></a>
# **apiV1DatasetPkGet**
> InlineResponse20032 apiV1DatasetPkGet(pk, q)



Get an item model

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20032 result = apiInstance.apiV1DatasetPkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetPkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatasetPkMetricMetricIdDelete"></a>
# **apiV1DatasetPkMetricMetricIdDelete**
> InlineResponse400 apiV1DatasetPkMetricMetricIdDelete(pk, metricId)



Delete a Dataset metric

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | The dataset pk for this column
Integer metricId = 56; // Integer | The metric id for this dataset
try {
    InlineResponse400 result = apiInstance.apiV1DatasetPkMetricMetricIdDelete(pk, metricId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetPkMetricMetricIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The dataset pk for this column |
 **metricId** | **Integer**| The metric id for this dataset |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatasetPkPut"></a>
# **apiV1DatasetPkPut**
> InlineResponse20033 apiV1DatasetPkPut(body, pk, overrideColumns)



Changes a Dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
DatasetRestApiPut body = new DatasetRestApiPut(); // DatasetRestApiPut | Dataset schema
Integer pk = 56; // Integer | 
Boolean overrideColumns = true; // Boolean | 
try {
    InlineResponse20033 result = apiInstance.apiV1DatasetPkPut(body, pk, overrideColumns);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetPkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatasetRestApiPut**](DatasetRestApiPut.md)| Dataset schema |
 **pk** | **Integer**|  |
 **overrideColumns** | **Boolean**|  | [optional]

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DatasetPkRefreshPut"></a>
# **apiV1DatasetPkRefreshPut**
> InlineResponse400 apiV1DatasetPkRefreshPut(pk)



Refreshes and updates columns of a dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.apiV1DatasetPkRefreshPut(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetPkRefreshPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatasetPkRelatedObjectsGet"></a>
# **apiV1DatasetPkRelatedObjectsGet**
> DatasetRelatedObjectsResponse apiV1DatasetPkRelatedObjectsGet(pk)



Get charts and dashboards count associated to a dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | 
try {
    DatasetRelatedObjectsResponse result = apiInstance.apiV1DatasetPkRelatedObjectsGet(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetPkRelatedObjectsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |

### Return type

[**DatasetRelatedObjectsResponse**](DatasetRelatedObjectsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatasetPkSamplesGet"></a>
# **apiV1DatasetPkSamplesGet**
> InlineResponse20034 apiV1DatasetPkSamplesGet(pk, force)



get samples from a Dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
Integer pk = 56; // Integer | 
Boolean force = true; // Boolean | 
try {
    InlineResponse20034 result = apiInstance.apiV1DatasetPkSamplesGet(pk, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetPkSamplesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **force** | **Boolean**|  | [optional]

### Return type

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatasetPost"></a>
# **apiV1DatasetPost**
> InlineResponse2019 apiV1DatasetPost(body)



Create a new Dataset

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
DatasetRestApiPost body = new DatasetRestApiPost(); // DatasetRestApiPost | Dataset schema
try {
    InlineResponse2019 result = apiInstance.apiV1DatasetPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatasetRestApiPost**](DatasetRestApiPost.md)| Dataset schema |

### Return type

[**InlineResponse2019**](InlineResponse2019.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DatasetRelatedColumnNameGet"></a>
# **apiV1DatasetRelatedColumnNameGet**
> RelatedResponseSchema apiV1DatasetRelatedColumnNameGet(columnName, q)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatasetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatasetsApi apiInstance = new DatasetsApi();
String columnName = "columnName_example"; // String | 
GetRelatedSchema q = new GetRelatedSchema(); // GetRelatedSchema | 
try {
    RelatedResponseSchema result = apiInstance.apiV1DatasetRelatedColumnNameGet(columnName, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasetsApi#apiV1DatasetRelatedColumnNameGet");
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

