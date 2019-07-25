# ProcessorsApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearState**](ProcessorsApi.md#clearState) | **POST** /processors/{id}/state/clear-requests | Clears the state for a processor
[**deleteProcessor**](ProcessorsApi.md#deleteProcessor) | **DELETE** /processors/{id} | Deletes a processor
[**getProcessor**](ProcessorsApi.md#getProcessor) | **GET** /processors/{id} | Gets a processor
[**getProcessorDiagnostics**](ProcessorsApi.md#getProcessorDiagnostics) | **GET** /processors/{id}/diagnostics | Gets diagnostics information about a processor
[**getPropertyDescriptor**](ProcessorsApi.md#getPropertyDescriptor) | **GET** /processors/{id}/descriptors | Gets the descriptor for a processor property
[**getState**](ProcessorsApi.md#getState) | **GET** /processors/{id}/state | Gets the state for a processor
[**terminateProcessor**](ProcessorsApi.md#terminateProcessor) | **DELETE** /processors/{id}/threads | Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks
[**updateProcessor**](ProcessorsApi.md#updateProcessor) | **PUT** /processors/{id} | Updates a processor
[**updateRunStatus**](ProcessorsApi.md#updateRunStatus) | **PUT** /processors/{id}/run-status | Updates run status of a processor


<a name="clearState"></a>
# **clearState**
> ComponentStateEntity clearState(id)

Clears the state for a processor

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    try {
      ComponentStateEntity result = apiInstance.clearState(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorsApi#clearState");
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
 **id** | **String**| The processor id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

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

<a name="deleteProcessor"></a>
# **deleteProcessor**
> ProcessorEntity deleteProcessor(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a processor

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
    String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
    Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
    try {
      ProcessorEntity result = apiInstance.deleteProcessor(id, version, clientId, disconnectedNodeAcknowledged);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorsApi#deleteProcessor");
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
 **id** | **String**| The processor id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

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

<a name="getProcessor"></a>
# **getProcessor**
> ProcessorEntity getProcessor(id)

Gets a processor

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    try {
      ProcessorEntity result = apiInstance.getProcessor(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorsApi#getProcessor");
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
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

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

<a name="getProcessorDiagnostics"></a>
# **getProcessorDiagnostics**
> ProcessorEntity getProcessorDiagnostics(id)

Gets diagnostics information about a processor

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    try {
      ProcessorEntity result = apiInstance.getProcessorDiagnostics(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorsApi#getProcessorDiagnostics");
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
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

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

<a name="getPropertyDescriptor"></a>
# **getPropertyDescriptor**
> PropertyDescriptorEntity getPropertyDescriptor(id, propertyName, clientId)

Gets the descriptor for a processor property

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    String propertyName = "propertyName_example"; // String | The property name.
    String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
    try {
      PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor(id, propertyName, clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorsApi#getPropertyDescriptor");
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
 **id** | **String**| The processor id. |
 **propertyName** | **String**| The property name. |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

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

<a name="getState"></a>
# **getState**
> ComponentStateEntity getState(id)

Gets the state for a processor

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    try {
      ComponentStateEntity result = apiInstance.getState(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorsApi#getState");
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
 **id** | **String**| The processor id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

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

<a name="terminateProcessor"></a>
# **terminateProcessor**
> ProcessorEntity terminateProcessor(id)

Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    try {
      ProcessorEntity result = apiInstance.terminateProcessor(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorsApi#terminateProcessor");
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
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

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

<a name="updateProcessor"></a>
# **updateProcessor**
> ProcessorEntity updateProcessor(id, body)

Updates a processor

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    ProcessorEntity body = new ProcessorEntity(); // ProcessorEntity | The processor configuration details.
    try {
      ProcessorEntity result = apiInstance.updateProcessor(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorsApi#updateProcessor");
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
 **id** | **String**| The processor id. |
 **body** | [**ProcessorEntity**](ProcessorEntity.md)| The processor configuration details. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

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

<a name="updateRunStatus"></a>
# **updateRunStatus**
> ProcessorEntity updateRunStatus(id, body)

Updates run status of a processor

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProcessorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProcessorsApi apiInstance = new ProcessorsApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    ProcessorRunStatusEntity body = new ProcessorRunStatusEntity(); // ProcessorRunStatusEntity | The processor run status.
    try {
      ProcessorEntity result = apiInstance.updateRunStatus(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessorsApi#updateRunStatus");
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
 **id** | **String**| The processor id. |
 **body** | [**ProcessorRunStatusEntity**](ProcessorRunStatusEntity.md)| The processor run status. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

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

