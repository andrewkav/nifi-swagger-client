# ControllerServicesApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearState**](ControllerServicesApi.md#clearState) | **POST** /controller-services/{id}/state/clear-requests | Clears the state for a controller service
[**getControllerService**](ControllerServicesApi.md#getControllerService) | **GET** /controller-services/{id} | Gets a controller service
[**getControllerServiceReferences**](ControllerServicesApi.md#getControllerServiceReferences) | **GET** /controller-services/{id}/references | Gets a controller service
[**getPropertyDescriptor**](ControllerServicesApi.md#getPropertyDescriptor) | **GET** /controller-services/{id}/descriptors | Gets a controller service property descriptor
[**getState**](ControllerServicesApi.md#getState) | **GET** /controller-services/{id}/state | Gets the state for a controller service
[**removeControllerService**](ControllerServicesApi.md#removeControllerService) | **DELETE** /controller-services/{id} | Deletes a controller service
[**updateControllerService**](ControllerServicesApi.md#updateControllerService) | **PUT** /controller-services/{id} | Updates a controller service
[**updateControllerServiceReferences**](ControllerServicesApi.md#updateControllerServiceReferences) | **PUT** /controller-services/{id}/references | Updates a controller services references
[**updateRunStatus**](ControllerServicesApi.md#updateRunStatus) | **PUT** /controller-services/{id}/run-status | Updates run status of a controller service


<a name="clearState"></a>
# **clearState**
> ComponentStateEntity clearState(id)

Clears the state for a controller service

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerServicesApi apiInstance = new ControllerServicesApi(defaultClient);
    String id = "id_example"; // String | The controller service id.
    try {
      ComponentStateEntity result = apiInstance.clearState(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerServicesApi#clearState");
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
 **id** | **String**| The controller service id. |

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

<a name="getControllerService"></a>
# **getControllerService**
> ControllerServiceEntity getControllerService(id)

Gets a controller service

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerServicesApi apiInstance = new ControllerServicesApi(defaultClient);
    String id = "id_example"; // String | The controller service id.
    try {
      ControllerServiceEntity result = apiInstance.getControllerService(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerServicesApi#getControllerService");
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
 **id** | **String**| The controller service id. |

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

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

<a name="getControllerServiceReferences"></a>
# **getControllerServiceReferences**
> ControllerServiceReferencingComponentsEntity getControllerServiceReferences(id)

Gets a controller service

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerServicesApi apiInstance = new ControllerServicesApi(defaultClient);
    String id = "id_example"; // String | The controller service id.
    try {
      ControllerServiceReferencingComponentsEntity result = apiInstance.getControllerServiceReferences(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerServicesApi#getControllerServiceReferences");
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
 **id** | **String**| The controller service id. |

### Return type

[**ControllerServiceReferencingComponentsEntity**](ControllerServiceReferencingComponentsEntity.md)

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
> PropertyDescriptorEntity getPropertyDescriptor(id, propertyName)

Gets a controller service property descriptor

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerServicesApi apiInstance = new ControllerServicesApi(defaultClient);
    String id = "id_example"; // String | The controller service id.
    String propertyName = "propertyName_example"; // String | The property name to return the descriptor for.
    try {
      PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor(id, propertyName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerServicesApi#getPropertyDescriptor");
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
 **id** | **String**| The controller service id. |
 **propertyName** | **String**| The property name to return the descriptor for. |

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

Gets the state for a controller service

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerServicesApi apiInstance = new ControllerServicesApi(defaultClient);
    String id = "id_example"; // String | The controller service id.
    try {
      ComponentStateEntity result = apiInstance.getState(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerServicesApi#getState");
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
 **id** | **String**| The controller service id. |

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

<a name="removeControllerService"></a>
# **removeControllerService**
> ControllerServiceEntity removeControllerService(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a controller service

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerServicesApi apiInstance = new ControllerServicesApi(defaultClient);
    String id = "id_example"; // String | The controller service id.
    String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
    String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
    Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
    try {
      ControllerServiceEntity result = apiInstance.removeControllerService(id, version, clientId, disconnectedNodeAcknowledged);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerServicesApi#removeControllerService");
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
 **id** | **String**| The controller service id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

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

<a name="updateControllerService"></a>
# **updateControllerService**
> ControllerServiceEntity updateControllerService(id, body)

Updates a controller service

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerServicesApi apiInstance = new ControllerServicesApi(defaultClient);
    String id = "id_example"; // String | The controller service id.
    ControllerServiceEntity body = new ControllerServiceEntity(); // ControllerServiceEntity | The controller service configuration details.
    try {
      ControllerServiceEntity result = apiInstance.updateControllerService(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerServicesApi#updateControllerService");
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
 **id** | **String**| The controller service id. |
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. |

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

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

<a name="updateControllerServiceReferences"></a>
# **updateControllerServiceReferences**
> ControllerServiceReferencingComponentsEntity updateControllerServiceReferences(id, body)

Updates a controller services references

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerServicesApi apiInstance = new ControllerServicesApi(defaultClient);
    String id = "id_example"; // String | The controller service id.
    UpdateControllerServiceReferenceRequestEntity body = new UpdateControllerServiceReferenceRequestEntity(); // UpdateControllerServiceReferenceRequestEntity | The controller service request update request.
    try {
      ControllerServiceReferencingComponentsEntity result = apiInstance.updateControllerServiceReferences(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerServicesApi#updateControllerServiceReferences");
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
 **id** | **String**| The controller service id. |
 **body** | [**UpdateControllerServiceReferenceRequestEntity**](UpdateControllerServiceReferenceRequestEntity.md)| The controller service request update request. |

### Return type

[**ControllerServiceReferencingComponentsEntity**](ControllerServiceReferencingComponentsEntity.md)

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
> ControllerServiceEntity updateRunStatus(id, body)

Updates run status of a controller service

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerServicesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerServicesApi apiInstance = new ControllerServicesApi(defaultClient);
    String id = "id_example"; // String | The controller service id.
    ControllerServiceRunStatusEntity body = new ControllerServiceRunStatusEntity(); // ControllerServiceRunStatusEntity | The controller service run status.
    try {
      ControllerServiceEntity result = apiInstance.updateRunStatus(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerServicesApi#updateRunStatus");
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
 **id** | **String**| The controller service id. |
 **body** | [**ControllerServiceRunStatusEntity**](ControllerServiceRunStatusEntity.md)| The controller service run status. |

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

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

