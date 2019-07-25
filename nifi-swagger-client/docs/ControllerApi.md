# ControllerApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulletin**](ControllerApi.md#createBulletin) | **POST** /controller/bulletin | Creates a new bulletin
[**createControllerService**](ControllerApi.md#createControllerService) | **POST** /controller/controller-services | Creates a new controller service
[**createRegistryClient**](ControllerApi.md#createRegistryClient) | **POST** /controller/registry-clients | Creates a new registry client
[**createReportingTask**](ControllerApi.md#createReportingTask) | **POST** /controller/reporting-tasks | Creates a new reporting task
[**deleteHistory**](ControllerApi.md#deleteHistory) | **DELETE** /controller/history | Purges history
[**deleteNode**](ControllerApi.md#deleteNode) | **DELETE** /controller/cluster/nodes/{id} | Removes a node from the cluster
[**deleteRegistryClient**](ControllerApi.md#deleteRegistryClient) | **DELETE** /controller/registry-clients/{id} | Deletes a registry client
[**getCluster**](ControllerApi.md#getCluster) | **GET** /controller/cluster | Gets the contents of the cluster
[**getControllerConfig**](ControllerApi.md#getControllerConfig) | **GET** /controller/config | Retrieves the configuration for this NiFi Controller
[**getNode**](ControllerApi.md#getNode) | **GET** /controller/cluster/nodes/{id} | Gets a node in the cluster
[**getRegistryClient**](ControllerApi.md#getRegistryClient) | **GET** /controller/registry-clients/{id} | Gets a registry client
[**getRegistryClients**](ControllerApi.md#getRegistryClients) | **GET** /controller/registry-clients | Gets the listing of available registry clients
[**updateControllerConfig**](ControllerApi.md#updateControllerConfig) | **PUT** /controller/config | Retrieves the configuration for this NiFi
[**updateNode**](ControllerApi.md#updateNode) | **PUT** /controller/cluster/nodes/{id} | Updates a node in the cluster
[**updateRegistryClient**](ControllerApi.md#updateRegistryClient) | **PUT** /controller/registry-clients/{id} | Updates a registry client


<a name="createBulletin"></a>
# **createBulletin**
> BulletinEntity createBulletin(body)

Creates a new bulletin

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    BulletinEntity body = new BulletinEntity(); // BulletinEntity | The reporting task configuration details.
    try {
      BulletinEntity result = apiInstance.createBulletin(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#createBulletin");
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
 **body** | [**BulletinEntity**](BulletinEntity.md)| The reporting task configuration details. |

### Return type

[**BulletinEntity**](BulletinEntity.md)

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
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="createControllerService"></a>
# **createControllerService**
> ControllerServiceEntity createControllerService(body)

Creates a new controller service

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    ControllerServiceEntity body = new ControllerServiceEntity(); // ControllerServiceEntity | The controller service configuration details.
    try {
      ControllerServiceEntity result = apiInstance.createControllerService(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#createControllerService");
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
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="createRegistryClient"></a>
# **createRegistryClient**
> RegistryClientEntity createRegistryClient(body)

Creates a new registry client

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    RegistryClientEntity body = new RegistryClientEntity(); // RegistryClientEntity | The registry configuration details.
    try {
      RegistryClientEntity result = apiInstance.createRegistryClient(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#createRegistryClient");
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
 **body** | [**RegistryClientEntity**](RegistryClientEntity.md)| The registry configuration details. |

### Return type

[**RegistryClientEntity**](RegistryClientEntity.md)

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
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="createReportingTask"></a>
# **createReportingTask**
> ReportingTaskEntity createReportingTask(body)

Creates a new reporting task

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    ReportingTaskEntity body = new ReportingTaskEntity(); // ReportingTaskEntity | The reporting task configuration details.
    try {
      ReportingTaskEntity result = apiInstance.createReportingTask(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#createReportingTask");
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
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

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
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="deleteHistory"></a>
# **deleteHistory**
> HistoryEntity deleteHistory(endDate)

Purges history

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    String endDate = "endDate_example"; // String | Purge actions before this date/time.
    try {
      HistoryEntity result = apiInstance.deleteHistory(endDate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#deleteHistory");
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
 **endDate** | **String**| Purge actions before this date/time. |

### Return type

[**HistoryEntity**](HistoryEntity.md)

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
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="deleteNode"></a>
# **deleteNode**
> NodeEntity deleteNode(id)

Removes a node from the cluster

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    String id = "id_example"; // String | The node id.
    try {
      NodeEntity result = apiInstance.deleteNode(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#deleteNode");
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
 **id** | **String**| The node id. |

### Return type

[**NodeEntity**](NodeEntity.md)

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

<a name="deleteRegistryClient"></a>
# **deleteRegistryClient**
> RegistryClientEntity deleteRegistryClient(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a registry client

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    String id = "id_example"; // String | The registry id.
    String version = "version_example"; // String | The revision is used to verify the client is working with the latest version of the flow.
    String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
    Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
    try {
      RegistryClientEntity result = apiInstance.deleteRegistryClient(id, version, clientId, disconnectedNodeAcknowledged);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#deleteRegistryClient");
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
 **id** | **String**| The registry id. |
 **version** | **String**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**RegistryClientEntity**](RegistryClientEntity.md)

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

<a name="getCluster"></a>
# **getCluster**
> ClusterEntity getCluster()

Gets the contents of the cluster

Returns the contents of the cluster including all nodes and their status.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    try {
      ClusterEntity result = apiInstance.getCluster();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#getCluster");
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

[**ClusterEntity**](ClusterEntity.md)

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
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="getControllerConfig"></a>
# **getControllerConfig**
> ControllerConfigurationEntity getControllerConfig()

Retrieves the configuration for this NiFi Controller

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    try {
      ControllerConfigurationEntity result = apiInstance.getControllerConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#getControllerConfig");
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

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

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
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="getNode"></a>
# **getNode**
> NodeEntity getNode(id)

Gets a node in the cluster

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    String id = "id_example"; // String | The node id.
    try {
      NodeEntity result = apiInstance.getNode(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#getNode");
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
 **id** | **String**| The node id. |

### Return type

[**NodeEntity**](NodeEntity.md)

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

<a name="getRegistryClient"></a>
# **getRegistryClient**
> RegistryClientEntity getRegistryClient(id)

Gets a registry client

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    String id = "id_example"; // String | The registry id.
    try {
      RegistryClientEntity result = apiInstance.getRegistryClient(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#getRegistryClient");
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
 **id** | **String**| The registry id. |

### Return type

[**RegistryClientEntity**](RegistryClientEntity.md)

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

<a name="getRegistryClients"></a>
# **getRegistryClients**
> RegistryClientsEntity getRegistryClients()

Gets the listing of available registry clients

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    try {
      RegistryClientsEntity result = apiInstance.getRegistryClients();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#getRegistryClients");
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

[**RegistryClientsEntity**](RegistryClientsEntity.md)

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

<a name="updateControllerConfig"></a>
# **updateControllerConfig**
> ControllerConfigurationEntity updateControllerConfig(body)

Retrieves the configuration for this NiFi

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    ControllerConfigurationEntity body = new ControllerConfigurationEntity(); // ControllerConfigurationEntity | The controller configuration.
    try {
      ControllerConfigurationEntity result = apiInstance.updateControllerConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#updateControllerConfig");
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
 **body** | [**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)| The controller configuration. |

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

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
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="updateNode"></a>
# **updateNode**
> NodeEntity updateNode(id, body)

Updates a node in the cluster

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    String id = "id_example"; // String | The node id.
    NodeEntity body = new NodeEntity(); // NodeEntity | The node configuration. The only configuration that will be honored at this endpoint is the status.
    try {
      NodeEntity result = apiInstance.updateNode(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#updateNode");
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
 **id** | **String**| The node id. |
 **body** | [**NodeEntity**](NodeEntity.md)| The node configuration. The only configuration that will be honored at this endpoint is the status. |

### Return type

[**NodeEntity**](NodeEntity.md)

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

<a name="updateRegistryClient"></a>
# **updateRegistryClient**
> RegistryClientEntity updateRegistryClient(id, body)

Updates a registry client

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ControllerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ControllerApi apiInstance = new ControllerApi(defaultClient);
    String id = "id_example"; // String | The registry id.
    RegistryClientEntity body = new RegistryClientEntity(); // RegistryClientEntity | The registry configuration details.
    try {
      RegistryClientEntity result = apiInstance.updateRegistryClient(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ControllerApi#updateRegistryClient");
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
 **id** | **String**| The registry id. |
 **body** | [**RegistryClientEntity**](RegistryClientEntity.md)| The registry configuration details. |

### Return type

[**RegistryClientEntity**](RegistryClientEntity.md)

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

