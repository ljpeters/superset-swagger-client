# CurrentUserApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1MeGet**](CurrentUserApi.md#apiV1MeGet) | **GET** /api/v1/me/ | 
[**apiV1MeRolesGet**](CurrentUserApi.md#apiV1MeRolesGet) | **GET** /api/v1/me/roles/ | 

<a name="apiV1MeGet"></a>
# **apiV1MeGet**
> InlineResponse20038 apiV1MeGet()



Returns the user object corresponding to the agent making the request, or returns a 401 error if the user is unauthenticated.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.client.CurrentUserApi;


CurrentUserApi apiInstance = new CurrentUserApi();
try {
    InlineResponse20038 result = apiInstance.apiV1MeGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrentUserApi#apiV1MeGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1MeRolesGet"></a>
# **apiV1MeRolesGet**
> InlineResponse20038 apiV1MeRolesGet()



Returns the user roles corresponding to the agent making the request, or returns a 401 error if the user is unauthenticated.

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.client.CurrentUserApi;


CurrentUserApi apiInstance = new CurrentUserApi();
try {
    InlineResponse20038 result = apiInstance.apiV1MeRolesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrentUserApi#apiV1MeRolesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

