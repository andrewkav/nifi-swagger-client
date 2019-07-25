# RemoteProcessGroupsApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRemoteProcessGroup**](RemoteProcessGroupsApi.md#getRemoteProcessGroup) | **GET** /remote-process-groups/{id} | Gets a remote process group
[**removeRemoteProcessGroup**](RemoteProcessGroupsApi.md#removeRemoteProcessGroup) | **DELETE** /remote-process-groups/{id} | Deletes a remote process group
[**updateRemoteProcessGroup**](RemoteProcessGroupsApi.md#updateRemoteProcessGroup) | **PUT** /remote-process-groups/{id} | Updates a remote process group
[**updateRemoteProcessGroupInputPort**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupInputPort) | **PUT** /remote-process-groups/{id}/input-ports/{port-id} | Updates a remote port
[**updateRemoteProcessGroupInputPortRunStatus**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupInputPortRunStatus) | **PUT** /remote-process-groups/{id}/input-ports/{port-id}/run-status | Updates run status of a remote port
[**updateRemoteProcessGroupOutputPort**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupOutputPort) | **PUT** /remote-process-groups/{id}/output-ports/{port-id} | Updates a remote port
[**updateRemoteProcessGroupOutputPortRunStatus**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupOutputPortRunStatus) | **PUT** /remote-process-groups/{id}/output-ports/{port-id}/run-status | Updates run status of a remote port
[**updateRemoteProcessGroupRunStatus**](RemoteProcessGroupsApi.md#updateRemoteProcessGroupRunStatus) | **PUT** /remote-process-groups/{id}/run-status | Updates run status of a remote process group


<a name="getRemoteProcessGroup"></a>
# **getRemoteProcessGroup**
> RemoteProcessGroupEntity getRemoteProcessGroup(id)

Gets a remote process group

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.RemoteProcessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi(defaultClient);
    String id = "id_example"; // String | The remote process group id.
    try {
      RemoteProcessGroupEntity result = apiInstance.getRemoteProcessGroup(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteProcessGroupsApi#getRemoteProcessGroup");
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
 **id** | **String**| The remote process group id. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

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
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="removeRemoteProcessGroup"></a>
# **removeRemoteProcessGroup**
> RemoteProcessGroupEntity removeRemoteProcessGroup(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a remote process group

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.RemoteProcessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi(defaultClient);
    String id = "id_example"; // String | The remote process group id.
    String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
    String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
    Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
    try {
      RemoteProcessGroupEntity result = apiInstance.removeRemoteProcessGroup(id, version, clientId, disconnectedNodeAcknowledged);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteProcessGroupsApi#removeRemoteProcessGroup");
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
 **id** | **String**| The remote process group id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

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
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="updateRemoteProcessGroup"></a>
# **updateRemoteProcessGroup**
> RemoteProcessGroupEntity updateRemoteProcessGroup(id, body)

Updates a remote process group

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.RemoteProcessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi(defaultClient);
    String id = "id_example"; // String | The remote process group id.
    RemoteProcessGroupEntity body = new RemoteProcessGroupEntity(); // RemoteProcessGroupEntity | The remote process group.
    try {
      RemoteProcessGroupEntity result = apiInstance.updateRemoteProcessGroup(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroup");
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
 **id** | **String**| The remote process group id. |
 **body** | [**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)| The remote process group. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="updateRemoteProcessGroupInputPort"></a>
# **updateRemoteProcessGroupInputPort**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupInputPort(id, portId, body)

Updates a remote port

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.RemoteProcessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi(defaultClient);
    String id = "id_example"; // String | The remote process group id.
    String portId = "portId_example"; // String | The remote process group port id.
    RemoteProcessGroupPortEntity body = new RemoteProcessGroupPortEntity(); // RemoteProcessGroupPortEntity | The remote process group port.
    try {
      RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupInputPort(id, portId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupInputPort");
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
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |
 **body** | [**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)| The remote process group port. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="updateRemoteProcessGroupInputPortRunStatus"></a>
# **updateRemoteProcessGroupInputPortRunStatus**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupInputPortRunStatus(id, portId, body)

Updates run status of a remote port

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.RemoteProcessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi(defaultClient);
    String id = "id_example"; // String | The remote process group id.
    String portId = "portId_example"; // String | The remote process group port id.
    RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process group port.
    try {
      RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupInputPortRunStatus(id, portId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupInputPortRunStatus");
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
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process group port. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="updateRemoteProcessGroupOutputPort"></a>
# **updateRemoteProcessGroupOutputPort**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupOutputPort(id, portId, body)

Updates a remote port

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.RemoteProcessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi(defaultClient);
    String id = "id_example"; // String | The remote process group id.
    String portId = "portId_example"; // String | The remote process group port id.
    RemoteProcessGroupPortEntity body = new RemoteProcessGroupPortEntity(); // RemoteProcessGroupPortEntity | The remote process group port.
    try {
      RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupOutputPort(id, portId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupOutputPort");
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
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |
 **body** | [**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)| The remote process group port. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="updateRemoteProcessGroupOutputPortRunStatus"></a>
# **updateRemoteProcessGroupOutputPortRunStatus**
> RemoteProcessGroupPortEntity updateRemoteProcessGroupOutputPortRunStatus(id, portId, body)

Updates run status of a remote port

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.RemoteProcessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi(defaultClient);
    String id = "id_example"; // String | The remote process group id.
    String portId = "portId_example"; // String | The remote process group port id.
    RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process group port.
    try {
      RemoteProcessGroupPortEntity result = apiInstance.updateRemoteProcessGroupOutputPortRunStatus(id, portId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupOutputPortRunStatus");
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
 **id** | **String**| The remote process group id. |
 **portId** | **String**| The remote process group port id. |
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process group port. |

### Return type

[**RemoteProcessGroupPortEntity**](RemoteProcessGroupPortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="updateRemoteProcessGroupRunStatus"></a>
# **updateRemoteProcessGroupRunStatus**
> RemoteProcessGroupEntity updateRemoteProcessGroupRunStatus(id, body)

Updates run status of a remote process group

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.RemoteProcessGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    RemoteProcessGroupsApi apiInstance = new RemoteProcessGroupsApi(defaultClient);
    String id = "id_example"; // String | The remote process group id.
    RemotePortRunStatusEntity body = new RemotePortRunStatusEntity(); // RemotePortRunStatusEntity | The remote process group run status.
    try {
      RemoteProcessGroupEntity result = apiInstance.updateRemoteProcessGroupRunStatus(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RemoteProcessGroupsApi#updateRemoteProcessGroupRunStatus");
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
 **id** | **String**| The remote process group id. |
 **body** | [**RemotePortRunStatusEntity**](RemotePortRunStatusEntity.md)| The remote process group run status. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

