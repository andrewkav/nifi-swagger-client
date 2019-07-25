# AccessApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccessToken**](AccessApi.md#createAccessToken) | **POST** /access/token | Creates a token for accessing the REST API via username/password
[**createAccessTokenFromTicket**](AccessApi.md#createAccessTokenFromTicket) | **POST** /access/kerberos | Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation
[**createDownloadToken**](AccessApi.md#createDownloadToken) | **POST** /access/download-token | Creates a single use access token for downloading FlowFile content.
[**createUiExtensionToken**](AccessApi.md#createUiExtensionToken) | **POST** /access/ui-extension-token | Creates a single use access token for accessing a NiFi UI extension.
[**getAccessStatus**](AccessApi.md#getAccessStatus) | **GET** /access | Gets the status the client&#39;s access
[**getLoginConfig**](AccessApi.md#getLoginConfig) | **GET** /access/config | Retrieves the access configuration for this NiFi
[**knoxCallback**](AccessApi.md#knoxCallback) | **GET** /access/knox/callback | Redirect/callback URI for processing the result of the Apache Knox login sequence.
[**knoxLogout**](AccessApi.md#knoxLogout) | **GET** /access/knox/logout | Performs a logout in the Apache Knox.
[**knoxRequest**](AccessApi.md#knoxRequest) | **GET** /access/knox/request | Initiates a request to authenticate through Apache Knox.
[**oidcCallback**](AccessApi.md#oidcCallback) | **GET** /access/oidc/callback | Redirect/callback URI for processing the result of the OpenId Connect login sequence.
[**oidcExchange**](AccessApi.md#oidcExchange) | **POST** /access/oidc/exchange | Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.
[**oidcLogout**](AccessApi.md#oidcLogout) | **GET** /access/oidc/logout | Performs a logout in the OpenId Provider.
[**oidcRequest**](AccessApi.md#oidcRequest) | **GET** /access/oidc/request | Initiates a request to authenticate through the configured OpenId Connect provider.


<a name="createAccessToken"></a>
# **createAccessToken**
> String createAccessToken(username, password)

Creates a token for accessing the REST API via username/password

The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    String username = "username_example"; // String | 
    String password = "password_example"; // String | 
    try {
      String result = apiInstance.createAccessToken(username, password);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#createAccessToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**|  | [optional]
 **password** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**409** | Unable to create access token because NiFi is not in the appropriate state. (i.e. may not be configured to support username/password login. |  -  |
**500** | Unable to create access token because an unexpected error occurred. |  -  |

<a name="createAccessTokenFromTicket"></a>
# **createAccessTokenFromTicket**
> String createAccessTokenFromTicket()

Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation

The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format &#39;Authorization: Bearer &lt;token&gt;&#39;.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      String result = apiInstance.createAccessTokenFromTicket();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#createAccessTokenFromTicket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | NiFi was unable to complete the request because it did not contain a valid Kerberos ticket in the Authorization header. Retry this request after initializing a ticket with kinit and ensuring your browser is configured to support SPNEGO. |  -  |
**409** | Unable to create access token because NiFi is not in the appropriate state. (i.e. may not be configured to support Kerberos login. |  -  |
**500** | Unable to create access token because an unexpected error occurred. |  -  |

<a name="createDownloadToken"></a>
# **createDownloadToken**
> String createDownloadToken()

Creates a single use access token for downloading FlowFile content.

The token returned is a base64 encoded string. It is valid for a single request up to five minutes from being issued. It is used as a query parameter name &#39;access_token&#39;.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      String result = apiInstance.createDownloadToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#createDownloadToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**403** | Client is not authorized to make this request. |  -  |
**409** | Unable to create the download token because NiFi is not in the appropriate state. (i.e. may not have any tokens to grant or be configured to support username/password login) |  -  |
**500** | Unable to create download token because an unexpected error occurred. |  -  |

<a name="createUiExtensionToken"></a>
# **createUiExtensionToken**
> String createUiExtensionToken()

Creates a single use access token for accessing a NiFi UI extension.

The token returned is a base64 encoded string. It is valid for a single request up to five minutes from being issued. It is used as a query parameter name &#39;access_token&#39;.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      String result = apiInstance.createUiExtensionToken();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#createUiExtensionToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**403** | Client is not authorized to make this request. |  -  |
**409** | Unable to create the download token because NiFi is not in the appropriate state. (i.e. may not have any tokens to grant or be configured to support username/password login) |  -  |
**500** | Unable to create download token because an unexpected error occurred. |  -  |

<a name="getAccessStatus"></a>
# **getAccessStatus**
> AccessStatusEntity getAccessStatus()

Gets the status the client&#39;s access

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      AccessStatusEntity result = apiInstance.getAccessStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#getAccessStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessStatusEntity**](AccessStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Unable to determine access status because the client could not be authenticated. |  -  |
**403** | Unable to determine access status because the client is not authorized to make this request. |  -  |
**409** | Unable to determine access status because NiFi is not in the appropriate state. |  -  |
**500** | Unable to determine access status because an unexpected error occurred. |  -  |

<a name="getLoginConfig"></a>
# **getLoginConfig**
> AccessConfigurationEntity getLoginConfig()

Retrieves the access configuration for this NiFi

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      AccessConfigurationEntity result = apiInstance.getLoginConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#getLoginConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessConfigurationEntity**](AccessConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="knoxCallback"></a>
# **knoxCallback**
> knoxCallback()

Redirect/callback URI for processing the result of the Apache Knox login sequence.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      apiInstance.knoxCallback();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#knoxCallback");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="knoxLogout"></a>
# **knoxLogout**
> knoxLogout()

Performs a logout in the Apache Knox.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      apiInstance.knoxLogout();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#knoxLogout");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="knoxRequest"></a>
# **knoxRequest**
> knoxRequest()

Initiates a request to authenticate through Apache Knox.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      apiInstance.knoxRequest();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#knoxRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="oidcCallback"></a>
# **oidcCallback**
> oidcCallback()

Redirect/callback URI for processing the result of the OpenId Connect login sequence.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      apiInstance.oidcCallback();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#oidcCallback");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="oidcExchange"></a>
# **oidcExchange**
> String oidcExchange()

Retrieves a JWT following a successful login sequence using the configured OpenId Connect provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      String result = apiInstance.oidcExchange();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#oidcExchange");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="oidcLogout"></a>
# **oidcLogout**
> oidcLogout()

Performs a logout in the OpenId Provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      apiInstance.oidcLogout();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#oidcLogout");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

<a name="oidcRequest"></a>
# **oidcRequest**
> oidcRequest()

Initiates a request to authenticate through the configured OpenId Connect provider.

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.AccessApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    AccessApi apiInstance = new AccessApi(defaultClient);
    try {
      apiInstance.oidcRequest();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessApi#oidcRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | successful operation |  -  |

