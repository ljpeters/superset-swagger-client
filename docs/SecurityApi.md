# SecurityApi

All URIs are relative to *http://localhost:8088/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiV1SecurityCsrfTokenGet**](SecurityApi.md#apiV1SecurityCsrfTokenGet) | **GET** /api/v1/security/csrf_token/ | 
[**apiV1SecurityGuestTokenPost**](SecurityApi.md#apiV1SecurityGuestTokenPost) | **POST** /api/v1/security/guest_token/ | 
[**apiV1SecurityLoginPost**](SecurityApi.md#apiV1SecurityLoginPost) | **POST** /api/v1/security/login | 
[**apiV1SecurityRefreshPost**](SecurityApi.md#apiV1SecurityRefreshPost) | **POST** /api/v1/security/refresh | 

<a name="apiV1SecurityCsrfTokenGet"></a>
# **apiV1SecurityCsrfTokenGet**
> InlineResponse20050 apiV1SecurityCsrfTokenGet()



Fetch the CSRF token

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecurityApi apiInstance = new SecurityApi();
try {
    InlineResponse20050 result = apiInstance.apiV1SecurityCsrfTokenGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#apiV1SecurityCsrfTokenGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiV1SecurityGuestTokenPost"></a>
# **apiV1SecurityGuestTokenPost**
> InlineResponse20051 apiV1SecurityGuestTokenPost(body)



Fetches a guest token

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecurityApi apiInstance = new SecurityApi();
GuestTokenCreate body = new GuestTokenCreate(); // GuestTokenCreate | Parameters for the guest token
try {
    InlineResponse20051 result = apiInstance.apiV1SecurityGuestTokenPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#apiV1SecurityGuestTokenPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GuestTokenCreate**](GuestTokenCreate.md)| Parameters for the guest token |

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1SecurityLoginPost"></a>
# **apiV1SecurityLoginPost**
> InlineResponse20052 apiV1SecurityLoginPost(body)



Authenticate and get a JWT access and refresh token

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.client.SecurityApi;


SecurityApi apiInstance = new SecurityApi();
SecurityLoginBody body = new SecurityLoginBody(); // SecurityLoginBody | 
try {
    InlineResponse20052 result = apiInstance.apiV1SecurityLoginPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#apiV1SecurityLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SecurityLoginBody**](SecurityLoginBody.md)|  |

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="apiV1SecurityRefreshPost"></a>
# **apiV1SecurityRefreshPost**
> InlineResponse20053 apiV1SecurityRefreshPost()



Use the refresh token to get a new JWT access token

### Example
```java
// Import classes:
//import at.mic.superset.swagger.ApiClient;
//import at.mic.superset.swagger.ApiException;
//import at.mic.superset.swagger.Configuration;
//import at.mic.superset.swagger.auth.*;
//import at.mic.superset.swagger.client.SecurityApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();


SecurityApi apiInstance = new SecurityApi();
try {
    InlineResponse20053 result = apiInstance.apiV1SecurityRefreshPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityApi#apiV1SecurityRefreshPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

### Authorization

[jwt_refresh](../README.md#jwt_refresh)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

