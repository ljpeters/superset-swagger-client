# DatabaseApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1DatabaseAvailableGet**](DatabaseApi.md#apiV1DatabaseAvailableGet) | **GET** /api/v1/database/available/ | 
[**apiV1DatabaseExportGet**](DatabaseApi.md#apiV1DatabaseExportGet) | **GET** /api/v1/database/export/ | 
[**apiV1DatabaseGet**](DatabaseApi.md#apiV1DatabaseGet) | **GET** /api/v1/database/ | 
[**apiV1DatabaseImportPost**](DatabaseApi.md#apiV1DatabaseImportPost) | **POST** /api/v1/database/import/ | 
[**apiV1DatabaseInfoGet**](DatabaseApi.md#apiV1DatabaseInfoGet) | **GET** /api/v1/database/_info | 
[**apiV1DatabasePkDelete**](DatabaseApi.md#apiV1DatabasePkDelete) | **DELETE** /api/v1/database/{pk} | 
[**apiV1DatabasePkFunctionNamesGet**](DatabaseApi.md#apiV1DatabasePkFunctionNamesGet) | **GET** /api/v1/database/{pk}/function_names/ | 
[**apiV1DatabasePkGet**](DatabaseApi.md#apiV1DatabasePkGet) | **GET** /api/v1/database/{pk} | 
[**apiV1DatabasePkPut**](DatabaseApi.md#apiV1DatabasePkPut) | **PUT** /api/v1/database/{pk} | 
[**apiV1DatabasePkRelatedObjectsGet**](DatabaseApi.md#apiV1DatabasePkRelatedObjectsGet) | **GET** /api/v1/database/{pk}/related_objects/ | 
[**apiV1DatabasePkSchemasGet**](DatabaseApi.md#apiV1DatabasePkSchemasGet) | **GET** /api/v1/database/{pk}/schemas/ | 
[**apiV1DatabasePkSelectStarTableNameGet**](DatabaseApi.md#apiV1DatabasePkSelectStarTableNameGet) | **GET** /api/v1/database/{pk}/select_star/{table_name}/ | 
[**apiV1DatabasePkSelectStarTableNameSchemaNameGet**](DatabaseApi.md#apiV1DatabasePkSelectStarTableNameSchemaNameGet) | **GET** /api/v1/database/{pk}/select_star/{table_name}/{schema_name}/ | 
[**apiV1DatabasePkTableExtraTableNameSchemaNameGet**](DatabaseApi.md#apiV1DatabasePkTableExtraTableNameSchemaNameGet) | **GET** /api/v1/database/{pk}/table_extra/{table_name}/{schema_name}/ | Get table extra metadata
[**apiV1DatabasePkTableTableNameSchemaNameGet**](DatabaseApi.md#apiV1DatabasePkTableTableNameSchemaNameGet) | **GET** /api/v1/database/{pk}/table/{table_name}/{schema_name}/ | 
[**apiV1DatabasePkValidateSqlPost**](DatabaseApi.md#apiV1DatabasePkValidateSqlPost) | **POST** /api/v1/database/{pk}/validate_sql | Validates that arbitrary sql is acceptable for the given database
[**apiV1DatabasePost**](DatabaseApi.md#apiV1DatabasePost) | **POST** /api/v1/database/ | 
[**apiV1DatabaseTestConnectionPost**](DatabaseApi.md#apiV1DatabaseTestConnectionPost) | **POST** /api/v1/database/test_connection | 
[**apiV1DatabaseValidateParametersPost**](DatabaseApi.md#apiV1DatabaseValidateParametersPost) | **POST** /api/v1/database/validate_parameters | 

<a name="apiV1DatabaseAvailableGet"></a>
# **apiV1DatabaseAvailableGet**
> List&lt;InlineResponse20027&gt; apiV1DatabaseAvailableGet()



Get names of databases currently available

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
try {
    List<InlineResponse20027> result = apiInstance.apiV1DatabaseAvailableGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabaseAvailableGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;InlineResponse20027&gt;**](InlineResponse20027.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatabaseExportGet"></a>
# **apiV1DatabaseExportGet**
> File apiV1DatabaseExportGet(q)



Download database(s) and associated dataset(s) as a zip file

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
GetExportIdsSchema q = new GetExportIdsSchema(); // GetExportIdsSchema | 
try {
    File result = apiInstance.apiV1DatabaseExportGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabaseExportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetExportIdsSchema**](.md)|  | [optional]

### Return type

[**File**](File.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip, application/json

<a name="apiV1DatabaseGet"></a>
# **apiV1DatabaseGet**
> InlineResponse20026 apiV1DatabaseGet(q)



Get a list of models

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
GetListSchema q = new GetListSchema(); // GetListSchema | 
try {
    InlineResponse20026 result = apiInstance.apiV1DatabaseGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabaseGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | [**GetListSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatabaseImportPost"></a>
# **apiV1DatabaseImportPost**
> InlineResponse400 apiV1DatabaseImportPost(formData, overwrite, passwords)



### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
File formData = new File("formData_example"); // File | 
Boolean overwrite = true; // Boolean | 
String passwords = "passwords_example"; // String | 
try {
    InlineResponse400 result = apiInstance.apiV1DatabaseImportPost(formData, overwrite, passwords);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabaseImportPost");
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

<a name="apiV1DatabaseInfoGet"></a>
# **apiV1DatabaseInfoGet**
> InlineResponse2002 apiV1DatabaseInfoGet(q)



Get metadata information about this API resource

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
GetInfoSchema q = new GetInfoSchema(); // GetInfoSchema | 
try {
    InlineResponse2002 result = apiInstance.apiV1DatabaseInfoGet(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabaseInfoGet");
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

<a name="apiV1DatabasePkDelete"></a>
# **apiV1DatabasePkDelete**
> InlineResponse400 apiV1DatabasePkDelete(pk)



Deletes a Database.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | 
try {
    InlineResponse400 result = apiInstance.apiV1DatabasePkDelete(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkDelete");
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

<a name="apiV1DatabasePkFunctionNamesGet"></a>
# **apiV1DatabasePkFunctionNamesGet**
> DatabaseFunctionNamesResponse apiV1DatabasePkFunctionNamesGet(pk)



Get function names supported by a database

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | 
try {
    DatabaseFunctionNamesResponse result = apiInstance.apiV1DatabasePkFunctionNamesGet(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkFunctionNamesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |

### Return type

[**DatabaseFunctionNamesResponse**](DatabaseFunctionNamesResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatabasePkGet"></a>
# **apiV1DatabasePkGet**
> InlineResponse20028 apiV1DatabasePkGet(pk, q)



Get an item model

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | 
GetItemSchema q = new GetItemSchema(); // GetItemSchema | 
try {
    InlineResponse20028 result = apiInstance.apiV1DatabasePkGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |
 **q** | [**GetItemSchema**](.md)|  | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatabasePkPut"></a>
# **apiV1DatabasePkPut**
> InlineResponse20029 apiV1DatabasePkPut(body, pk)



Changes a Database.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
DatabaseRestApiPut body = new DatabaseRestApiPut(); // DatabaseRestApiPut | Database schema
Integer pk = 56; // Integer | 
try {
    InlineResponse20029 result = apiInstance.apiV1DatabasePkPut(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatabaseRestApiPut**](DatabaseRestApiPut.md)| Database schema |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DatabasePkRelatedObjectsGet"></a>
# **apiV1DatabasePkRelatedObjectsGet**
> DatabaseRelatedObjectsResponse apiV1DatabasePkRelatedObjectsGet(pk)



Get charts and dashboards count associated to a database

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | 
try {
    DatabaseRelatedObjectsResponse result = apiInstance.apiV1DatabasePkRelatedObjectsGet(pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkRelatedObjectsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**|  |

### Return type

[**DatabaseRelatedObjectsResponse**](DatabaseRelatedObjectsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatabasePkSchemasGet"></a>
# **apiV1DatabasePkSchemasGet**
> SchemasResponseSchema apiV1DatabasePkSchemasGet(pk, q)



Get all schemas from a database

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | The database id
DatabaseSchemasQuerySchema q = new DatabaseSchemasQuerySchema(); // DatabaseSchemasQuerySchema | 
try {
    SchemasResponseSchema result = apiInstance.apiV1DatabasePkSchemasGet(pk, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkSchemasGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The database id |
 **q** | [**DatabaseSchemasQuerySchema**](.md)|  | [optional]

### Return type

[**SchemasResponseSchema**](SchemasResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatabasePkSelectStarTableNameGet"></a>
# **apiV1DatabasePkSelectStarTableNameGet**
> SelectStarResponseSchema apiV1DatabasePkSelectStarTableNameGet(pk, tableName, schemaName)



Get database select star for table

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | The database id
String tableName = "tableName_example"; // String | Table name
String schemaName = "schemaName_example"; // String | Table schema
try {
    SelectStarResponseSchema result = apiInstance.apiV1DatabasePkSelectStarTableNameGet(pk, tableName, schemaName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkSelectStarTableNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The database id |
 **tableName** | **String**| Table name |
 **schemaName** | **String**| Table schema |

### Return type

[**SelectStarResponseSchema**](SelectStarResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatabasePkSelectStarTableNameSchemaNameGet"></a>
# **apiV1DatabasePkSelectStarTableNameSchemaNameGet**
> SelectStarResponseSchema apiV1DatabasePkSelectStarTableNameSchemaNameGet(pk, tableName, schemaName)



Get database select star for table

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | The database id
String tableName = "tableName_example"; // String | Table name
String schemaName = "schemaName_example"; // String | Table schema
try {
    SelectStarResponseSchema result = apiInstance.apiV1DatabasePkSelectStarTableNameSchemaNameGet(pk, tableName, schemaName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkSelectStarTableNameSchemaNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The database id |
 **tableName** | **String**| Table name |
 **schemaName** | **String**| Table schema |

### Return type

[**SelectStarResponseSchema**](SelectStarResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatabasePkTableExtraTableNameSchemaNameGet"></a>
# **apiV1DatabasePkTableExtraTableNameSchemaNameGet**
> TableExtraMetadataResponseSchema apiV1DatabasePkTableExtraTableNameSchemaNameGet(pk, tableName, schemaName)

Get table extra metadata

Response depends on each DB engine spec normally focused on partitions

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | The database id
String tableName = "tableName_example"; // String | Table name
String schemaName = "schemaName_example"; // String | Table schema
try {
    TableExtraMetadataResponseSchema result = apiInstance.apiV1DatabasePkTableExtraTableNameSchemaNameGet(pk, tableName, schemaName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkTableExtraTableNameSchemaNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The database id |
 **tableName** | **String**| Table name |
 **schemaName** | **String**| Table schema |

### Return type

[**TableExtraMetadataResponseSchema**](TableExtraMetadataResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatabasePkTableTableNameSchemaNameGet"></a>
# **apiV1DatabasePkTableTableNameSchemaNameGet**
> TableMetadataResponseSchema apiV1DatabasePkTableTableNameSchemaNameGet(pk, tableName, schemaName)



Get database table metadata

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
Integer pk = 56; // Integer | The database id
String tableName = "tableName_example"; // String | Table name
String schemaName = "schemaName_example"; // String | Table schema
try {
    TableMetadataResponseSchema result = apiInstance.apiV1DatabasePkTableTableNameSchemaNameGet(pk, tableName, schemaName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkTableTableNameSchemaNameGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **Integer**| The database id |
 **tableName** | **String**| Table name |
 **schemaName** | **String**| Table schema |

### Return type

[**TableMetadataResponseSchema**](TableMetadataResponseSchema.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1DatabasePkValidateSqlPost"></a>
# **apiV1DatabasePkValidateSqlPost**
> InlineResponse20030 apiV1DatabasePkValidateSqlPost(body, pk)

Validates that arbitrary sql is acceptable for the given database

Validates arbitrary SQL.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
ValidateSQLRequest body = new ValidateSQLRequest(); // ValidateSQLRequest | Validate SQL request
Integer pk = 56; // Integer | 
try {
    InlineResponse20030 result = apiInstance.apiV1DatabasePkValidateSqlPost(body, pk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePkValidateSqlPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ValidateSQLRequest**](ValidateSQLRequest.md)| Validate SQL request |
 **pk** | **Integer**|  |

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DatabasePost"></a>
# **apiV1DatabasePost**
> InlineResponse2018 apiV1DatabasePost(body)



Create a new Database.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
DatabaseRestApiPost body = new DatabaseRestApiPost(); // DatabaseRestApiPost | Database schema
try {
    InlineResponse2018 result = apiInstance.apiV1DatabasePost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabasePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatabaseRestApiPost**](DatabaseRestApiPost.md)| Database schema |

### Return type

[**InlineResponse2018**](InlineResponse2018.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DatabaseTestConnectionPost"></a>
# **apiV1DatabaseTestConnectionPost**
> InlineResponse400 apiV1DatabaseTestConnectionPost(body)



Tests a database connection

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
DatabaseTestConnectionSchema body = new DatabaseTestConnectionSchema(); // DatabaseTestConnectionSchema | Database schema
try {
    InlineResponse400 result = apiInstance.apiV1DatabaseTestConnectionPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabaseTestConnectionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatabaseTestConnectionSchema**](DatabaseTestConnectionSchema.md)| Database schema |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1DatabaseValidateParametersPost"></a>
# **apiV1DatabaseValidateParametersPost**
> InlineResponse400 apiV1DatabaseValidateParametersPost(body)



Validates parameters used to connect to a database

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.DatabaseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


DatabaseApi apiInstance = new DatabaseApi();
DatabaseValidateParametersSchema body = new DatabaseValidateParametersSchema(); // DatabaseValidateParametersSchema | DB-specific parameters
try {
    InlineResponse400 result = apiInstance.apiV1DatabaseValidateParametersPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatabaseApi#apiV1DatabaseValidateParametersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DatabaseValidateParametersSchema**](DatabaseValidateParametersSchema.md)| DB-specific parameters |

### Return type

[**InlineResponse400**](InlineResponse400.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

