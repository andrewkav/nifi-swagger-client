# FlowApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateControllerServices**](FlowApi.md#activateControllerServices) | **PUT** /flow/process-groups/{id}/controller-services | Enable or disable Controller Services in the specified Process Group.
[**generateClientId**](FlowApi.md#generateClientId) | **GET** /flow/client-id | Generates a client id.
[**getAboutInfo**](FlowApi.md#getAboutInfo) | **GET** /flow/about | Retrieves details about this NiFi to put in the About dialog
[**getAction**](FlowApi.md#getAction) | **GET** /flow/history/{id} | Gets an action
[**getBanners**](FlowApi.md#getBanners) | **GET** /flow/banners | Retrieves the banners for this NiFi
[**getBuckets**](FlowApi.md#getBuckets) | **GET** /flow/registries/{id}/buckets | Gets the buckets from the specified registry for the current user
[**getBulletinBoard**](FlowApi.md#getBulletinBoard) | **GET** /flow/bulletin-board | Gets current bulletins
[**getBulletins**](FlowApi.md#getBulletins) | **GET** /flow/controller/bulletins | Retrieves Controller level bulletins
[**getClusterSummary**](FlowApi.md#getClusterSummary) | **GET** /flow/cluster/summary | The cluster summary for this NiFi
[**getComponentHistory**](FlowApi.md#getComponentHistory) | **GET** /flow/history/components/{componentId} | Gets configuration history for a component
[**getConnectionStatus**](FlowApi.md#getConnectionStatus) | **GET** /flow/connections/{id}/status | Gets status for a connection
[**getConnectionStatusHistory**](FlowApi.md#getConnectionStatusHistory) | **GET** /flow/connections/{id}/status/history | Gets the status history for a connection
[**getControllerServiceTypes**](FlowApi.md#getControllerServiceTypes) | **GET** /flow/controller-service-types | Retrieves the types of controller services that this NiFi supports
[**getControllerServicesFromController**](FlowApi.md#getControllerServicesFromController) | **GET** /flow/controller/controller-services | Gets controller services for reporting tasks
[**getControllerServicesFromGroup**](FlowApi.md#getControllerServicesFromGroup) | **GET** /flow/process-groups/{id}/controller-services | Gets all controller services
[**getControllerStatus**](FlowApi.md#getControllerStatus) | **GET** /flow/status | Gets the current status of this NiFi
[**getCurrentUser**](FlowApi.md#getCurrentUser) | **GET** /flow/current-user | Retrieves the user identity of the user making the request
[**getFlow**](FlowApi.md#getFlow) | **GET** /flow/process-groups/{id} | Gets a process group
[**getFlowConfig**](FlowApi.md#getFlowConfig) | **GET** /flow/config | Retrieves the configuration for this NiFi flow
[**getFlows**](FlowApi.md#getFlows) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows | Gets the flows from the specified registry and bucket for the current user
[**getInputPortStatus**](FlowApi.md#getInputPortStatus) | **GET** /flow/input-ports/{id}/status | Gets status for an input port
[**getOutputPortStatus**](FlowApi.md#getOutputPortStatus) | **GET** /flow/output-ports/{id}/status | Gets status for an output port
[**getPrioritizers**](FlowApi.md#getPrioritizers) | **GET** /flow/prioritizers | Retrieves the types of prioritizers that this NiFi supports
[**getProcessGroupStatus**](FlowApi.md#getProcessGroupStatus) | **GET** /flow/process-groups/{id}/status | Gets the status for a process group
[**getProcessGroupStatusHistory**](FlowApi.md#getProcessGroupStatusHistory) | **GET** /flow/process-groups/{id}/status/history | Gets status history for a remote process group
[**getProcessorStatus**](FlowApi.md#getProcessorStatus) | **GET** /flow/processors/{id}/status | Gets status for a processor
[**getProcessorStatusHistory**](FlowApi.md#getProcessorStatusHistory) | **GET** /flow/processors/{id}/status/history | Gets status history for a processor
[**getProcessorTypes**](FlowApi.md#getProcessorTypes) | **GET** /flow/processor-types | Retrieves the types of processors that this NiFi supports
[**getRegistries**](FlowApi.md#getRegistries) | **GET** /flow/registries | Gets the listing of available registries
[**getRemoteProcessGroupStatus**](FlowApi.md#getRemoteProcessGroupStatus) | **GET** /flow/remote-process-groups/{id}/status | Gets status for a remote process group
[**getRemoteProcessGroupStatusHistory**](FlowApi.md#getRemoteProcessGroupStatusHistory) | **GET** /flow/remote-process-groups/{id}/status/history | Gets the status history
[**getReportingTaskTypes**](FlowApi.md#getReportingTaskTypes) | **GET** /flow/reporting-task-types | Retrieves the types of reporting tasks that this NiFi supports
[**getReportingTasks**](FlowApi.md#getReportingTasks) | **GET** /flow/reporting-tasks | Gets all reporting tasks
[**getTemplates**](FlowApi.md#getTemplates) | **GET** /flow/templates | Gets all templates
[**getVersions**](FlowApi.md#getVersions) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows/{flow-id}/versions | Gets the flow versions from the specified registry and bucket for the specified flow for the current user
[**queryHistory**](FlowApi.md#queryHistory) | **GET** /flow/history | Gets configuration history
[**scheduleComponents**](FlowApi.md#scheduleComponents) | **PUT** /flow/process-groups/{id} | Schedule or unschedule components in the specified Process Group.
[**searchCluster**](FlowApi.md#searchCluster) | **GET** /flow/cluster/search-results | Searches the cluster for a node with the specified address
[**searchFlow**](FlowApi.md#searchFlow) | **GET** /flow/search-results | Performs a search against this NiFi using the specified search term


<a name="activateControllerServices"></a>
# **activateControllerServices**
> ActivateControllerServicesEntity activateControllerServices(id, body)

Enable or disable Controller Services in the specified Process Group.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The process group id.
    ActivateControllerServicesEntity body = new ActivateControllerServicesEntity(); // ActivateControllerServicesEntity | The request to schedule or unschedule. If the comopnents in the request are not specified, all authorized components will be considered.
    try {
      ActivateControllerServicesEntity result = apiInstance.activateControllerServices(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#activateControllerServices");
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
 **id** | **String**| The process group id. |
 **body** | [**ActivateControllerServicesEntity**](ActivateControllerServicesEntity.md)| The request to schedule or unschedule. If the comopnents in the request are not specified, all authorized components will be considered. |

### Return type

[**ActivateControllerServicesEntity**](ActivateControllerServicesEntity.md)

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

<a name="generateClientId"></a>
# **generateClientId**
> String generateClientId()

Generates a client id.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      String result = apiInstance.generateClientId();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#generateClientId");
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
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="getAboutInfo"></a>
# **getAboutInfo**
> AboutEntity getAboutInfo()

Retrieves details about this NiFi to put in the About dialog

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      AboutEntity result = apiInstance.getAboutInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getAboutInfo");
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

[**AboutEntity**](AboutEntity.md)

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

<a name="getAction"></a>
# **getAction**
> ActionEntity getAction(id)

Gets an action

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The action id.
    try {
      ActionEntity result = apiInstance.getAction(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getAction");
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
 **id** | **String**| The action id. |

### Return type

[**ActionEntity**](ActionEntity.md)

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

<a name="getBanners"></a>
# **getBanners**
> BannerEntity getBanners()

Retrieves the banners for this NiFi

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      BannerEntity result = apiInstance.getBanners();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getBanners");
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

[**BannerEntity**](BannerEntity.md)

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

<a name="getBuckets"></a>
# **getBuckets**
> BucketsEntity getBuckets(id)

Gets the buckets from the specified registry for the current user

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The registry id.
    try {
      BucketsEntity result = apiInstance.getBuckets(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getBuckets");
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

[**BucketsEntity**](BucketsEntity.md)

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

<a name="getBulletinBoard"></a>
# **getBulletinBoard**
> BulletinBoardEntity getBulletinBoard(after, sourceName, message, sourceId, groupId, limit)

Gets current bulletins

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String after = "after_example"; // String | Includes bulletins with an id after this value.
    String sourceName = "sourceName_example"; // String | Includes bulletins originating from this sources whose name match this regular expression.
    String message = "message_example"; // String | Includes bulletins whose message that match this regular expression.
    String sourceId = "sourceId_example"; // String | Includes bulletins originating from this sources whose id match this regular expression.
    String groupId = "groupId_example"; // String | Includes bulletins originating from this sources whose group id match this regular expression.
    String limit = "limit_example"; // String | The number of bulletins to limit the response to.
    try {
      BulletinBoardEntity result = apiInstance.getBulletinBoard(after, sourceName, message, sourceId, groupId, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getBulletinBoard");
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
 **after** | **String**| Includes bulletins with an id after this value. | [optional]
 **sourceName** | **String**| Includes bulletins originating from this sources whose name match this regular expression. | [optional]
 **message** | **String**| Includes bulletins whose message that match this regular expression. | [optional]
 **sourceId** | **String**| Includes bulletins originating from this sources whose id match this regular expression. | [optional]
 **groupId** | **String**| Includes bulletins originating from this sources whose group id match this regular expression. | [optional]
 **limit** | **String**| The number of bulletins to limit the response to. | [optional]

### Return type

[**BulletinBoardEntity**](BulletinBoardEntity.md)

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

<a name="getBulletins"></a>
# **getBulletins**
> ControllerBulletinsEntity getBulletins()

Retrieves Controller level bulletins

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      ControllerBulletinsEntity result = apiInstance.getBulletins();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getBulletins");
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

[**ControllerBulletinsEntity**](ControllerBulletinsEntity.md)

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

<a name="getClusterSummary"></a>
# **getClusterSummary**
> ClusteSummaryEntity getClusterSummary()

The cluster summary for this NiFi

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      ClusteSummaryEntity result = apiInstance.getClusterSummary();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getClusterSummary");
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

[**ClusteSummaryEntity**](ClusteSummaryEntity.md)

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

<a name="getComponentHistory"></a>
# **getComponentHistory**
> ComponentHistoryEntity getComponentHistory(componentId)

Gets configuration history for a component

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String componentId = "componentId_example"; // String | The component id.
    try {
      ComponentHistoryEntity result = apiInstance.getComponentHistory(componentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getComponentHistory");
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
 **componentId** | **String**| The component id. |

### Return type

[**ComponentHistoryEntity**](ComponentHistoryEntity.md)

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

<a name="getConnectionStatus"></a>
# **getConnectionStatus**
> ConnectionStatusEntity getConnectionStatus(id, nodewise, clusterNodeId)

Gets status for a connection

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The connection id.
    Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
    try {
      ConnectionStatusEntity result = apiInstance.getConnectionStatus(id, nodewise, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getConnectionStatus");
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
 **id** | **String**| The connection id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ConnectionStatusEntity**](ConnectionStatusEntity.md)

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

<a name="getConnectionStatusHistory"></a>
# **getConnectionStatusHistory**
> StatusHistoryEntity getConnectionStatusHistory(id)

Gets the status history for a connection

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The connection id.
    try {
      StatusHistoryEntity result = apiInstance.getConnectionStatusHistory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getConnectionStatusHistory");
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
 **id** | **String**| The connection id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

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

<a name="getControllerServiceTypes"></a>
# **getControllerServiceTypes**
> ControllerServiceTypesEntity getControllerServiceTypes(serviceType, serviceBundleGroup, serviceBundleArtifact, serviceBundleVersion, bundleGroupFilter, bundleArtifactFilter, typeFilter)

Retrieves the types of controller services that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String serviceType = "serviceType_example"; // String | If specified, will only return controller services that are compatible with this type of service.
    String serviceBundleGroup = "serviceBundleGroup_example"; // String | If serviceType specified, is the bundle group of the serviceType.
    String serviceBundleArtifact = "serviceBundleArtifact_example"; // String | If serviceType specified, is the bundle artifact of the serviceType.
    String serviceBundleVersion = "serviceBundleVersion_example"; // String | If serviceType specified, is the bundle version of the serviceType.
    String bundleGroupFilter = "bundleGroupFilter_example"; // String | If specified, will only return types that are a member of this bundle group.
    String bundleArtifactFilter = "bundleArtifactFilter_example"; // String | If specified, will only return types that are a member of this bundle artifact.
    String typeFilter = "typeFilter_example"; // String | If specified, will only return types whose fully qualified classname matches.
    try {
      ControllerServiceTypesEntity result = apiInstance.getControllerServiceTypes(serviceType, serviceBundleGroup, serviceBundleArtifact, serviceBundleVersion, bundleGroupFilter, bundleArtifactFilter, typeFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getControllerServiceTypes");
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
 **serviceType** | **String**| If specified, will only return controller services that are compatible with this type of service. | [optional]
 **serviceBundleGroup** | **String**| If serviceType specified, is the bundle group of the serviceType. | [optional]
 **serviceBundleArtifact** | **String**| If serviceType specified, is the bundle artifact of the serviceType. | [optional]
 **serviceBundleVersion** | **String**| If serviceType specified, is the bundle version of the serviceType. | [optional]
 **bundleGroupFilter** | **String**| If specified, will only return types that are a member of this bundle group. | [optional]
 **bundleArtifactFilter** | **String**| If specified, will only return types that are a member of this bundle artifact. | [optional]
 **typeFilter** | **String**| If specified, will only return types whose fully qualified classname matches. | [optional]

### Return type

[**ControllerServiceTypesEntity**](ControllerServiceTypesEntity.md)

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

<a name="getControllerServicesFromController"></a>
# **getControllerServicesFromController**
> ControllerServicesEntity getControllerServicesFromController()

Gets controller services for reporting tasks

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      ControllerServicesEntity result = apiInstance.getControllerServicesFromController();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getControllerServicesFromController");
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

[**ControllerServicesEntity**](ControllerServicesEntity.md)

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

<a name="getControllerServicesFromGroup"></a>
# **getControllerServicesFromGroup**
> ControllerServicesEntity getControllerServicesFromGroup(id, includeAncestorGroups, includeDescendantGroups)

Gets all controller services

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The process group id.
    Boolean includeAncestorGroups = true; // Boolean | Whether or not to include parent/ancestory process groups
    Boolean includeDescendantGroups = false; // Boolean | Whether or not to include descendant process groups
    try {
      ControllerServicesEntity result = apiInstance.getControllerServicesFromGroup(id, includeAncestorGroups, includeDescendantGroups);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getControllerServicesFromGroup");
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
 **id** | **String**| The process group id. |
 **includeAncestorGroups** | **Boolean**| Whether or not to include parent/ancestory process groups | [optional] [default to true]
 **includeDescendantGroups** | **Boolean**| Whether or not to include descendant process groups | [optional] [default to false]

### Return type

[**ControllerServicesEntity**](ControllerServicesEntity.md)

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

<a name="getControllerStatus"></a>
# **getControllerStatus**
> ControllerStatusEntity getControllerStatus()

Gets the current status of this NiFi

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      ControllerStatusEntity result = apiInstance.getControllerStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getControllerStatus");
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

[**ControllerStatusEntity**](ControllerStatusEntity.md)

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

<a name="getCurrentUser"></a>
# **getCurrentUser**
> CurrentUserEntity getCurrentUser()

Retrieves the user identity of the user making the request

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      CurrentUserEntity result = apiInstance.getCurrentUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getCurrentUser");
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

[**CurrentUserEntity**](CurrentUserEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getFlow"></a>
# **getFlow**
> ProcessGroupFlowEntity getFlow(id)

Gets a process group

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The process group id.
    try {
      ProcessGroupFlowEntity result = apiInstance.getFlow(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getFlow");
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
 **id** | **String**| The process group id. |

### Return type

[**ProcessGroupFlowEntity**](ProcessGroupFlowEntity.md)

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

<a name="getFlowConfig"></a>
# **getFlowConfig**
> FlowConfigurationEntity getFlowConfig()

Retrieves the configuration for this NiFi flow

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      FlowConfigurationEntity result = apiInstance.getFlowConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getFlowConfig");
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

[**FlowConfigurationEntity**](FlowConfigurationEntity.md)

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

<a name="getFlows"></a>
# **getFlows**
> VersionedFlowsEntity getFlows(registryId, bucketId)

Gets the flows from the specified registry and bucket for the current user

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String registryId = "registryId_example"; // String | The registry id.
    String bucketId = "bucketId_example"; // String | The bucket id.
    try {
      VersionedFlowsEntity result = apiInstance.getFlows(registryId, bucketId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getFlows");
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
 **registryId** | **String**| The registry id. |
 **bucketId** | **String**| The bucket id. |

### Return type

[**VersionedFlowsEntity**](VersionedFlowsEntity.md)

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

<a name="getInputPortStatus"></a>
# **getInputPortStatus**
> PortStatusEntity getInputPortStatus(id, nodewise, clusterNodeId)

Gets status for an input port

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The input port id.
    Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
    try {
      PortStatusEntity result = apiInstance.getInputPortStatus(id, nodewise, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getInputPortStatus");
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
 **id** | **String**| The input port id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**PortStatusEntity**](PortStatusEntity.md)

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

<a name="getOutputPortStatus"></a>
# **getOutputPortStatus**
> PortStatusEntity getOutputPortStatus(id, nodewise, clusterNodeId)

Gets status for an output port

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The output port id.
    Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
    try {
      PortStatusEntity result = apiInstance.getOutputPortStatus(id, nodewise, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getOutputPortStatus");
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
 **id** | **String**| The output port id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**PortStatusEntity**](PortStatusEntity.md)

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

<a name="getPrioritizers"></a>
# **getPrioritizers**
> PrioritizerTypesEntity getPrioritizers()

Retrieves the types of prioritizers that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      PrioritizerTypesEntity result = apiInstance.getPrioritizers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getPrioritizers");
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

[**PrioritizerTypesEntity**](PrioritizerTypesEntity.md)

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

<a name="getProcessGroupStatus"></a>
# **getProcessGroupStatus**
> ProcessGroupStatusEntity getProcessGroupStatus(id, recursive, nodewise, clusterNodeId)

Gets the status for a process group

The status for a process group includes status for all descendent components. When invoked on the root group with recursive set to true, it will return the current status of every component in the flow.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The process group id.
    Boolean recursive = false; // Boolean | Whether all descendant groups and the status of their content will be included. Optional, defaults to false
    Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
    try {
      ProcessGroupStatusEntity result = apiInstance.getProcessGroupStatus(id, recursive, nodewise, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getProcessGroupStatus");
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
 **id** | **String**| The process group id. |
 **recursive** | **Boolean**| Whether all descendant groups and the status of their content will be included. Optional, defaults to false | [optional] [default to false]
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ProcessGroupStatusEntity**](ProcessGroupStatusEntity.md)

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

<a name="getProcessGroupStatusHistory"></a>
# **getProcessGroupStatusHistory**
> StatusHistoryEntity getProcessGroupStatusHistory(id)

Gets status history for a remote process group

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The process group id.
    try {
      StatusHistoryEntity result = apiInstance.getProcessGroupStatusHistory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getProcessGroupStatusHistory");
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
 **id** | **String**| The process group id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

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

<a name="getProcessorStatus"></a>
# **getProcessorStatus**
> ProcessorStatusEntity getProcessorStatus(id, nodewise, clusterNodeId)

Gets status for a processor

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
    try {
      ProcessorStatusEntity result = apiInstance.getProcessorStatus(id, nodewise, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getProcessorStatus");
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
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ProcessorStatusEntity**](ProcessorStatusEntity.md)

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

<a name="getProcessorStatusHistory"></a>
# **getProcessorStatusHistory**
> StatusHistoryEntity getProcessorStatusHistory(id)

Gets status history for a processor

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The processor id.
    try {
      StatusHistoryEntity result = apiInstance.getProcessorStatusHistory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getProcessorStatusHistory");
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

[**StatusHistoryEntity**](StatusHistoryEntity.md)

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

<a name="getProcessorTypes"></a>
# **getProcessorTypes**
> ProcessorTypesEntity getProcessorTypes(bundleGroupFilter, bundleArtifactFilter, type)

Retrieves the types of processors that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String bundleGroupFilter = "bundleGroupFilter_example"; // String | If specified, will only return types that are a member of this bundle group.
    String bundleArtifactFilter = "bundleArtifactFilter_example"; // String | If specified, will only return types that are a member of this bundle artifact.
    String type = "type_example"; // String | If specified, will only return types whose fully qualified classname matches.
    try {
      ProcessorTypesEntity result = apiInstance.getProcessorTypes(bundleGroupFilter, bundleArtifactFilter, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getProcessorTypes");
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
 **bundleGroupFilter** | **String**| If specified, will only return types that are a member of this bundle group. | [optional]
 **bundleArtifactFilter** | **String**| If specified, will only return types that are a member of this bundle artifact. | [optional]
 **type** | **String**| If specified, will only return types whose fully qualified classname matches. | [optional]

### Return type

[**ProcessorTypesEntity**](ProcessorTypesEntity.md)

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

<a name="getRegistries"></a>
# **getRegistries**
> RegistryClientsEntity getRegistries()

Gets the listing of available registries

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      RegistryClientsEntity result = apiInstance.getRegistries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getRegistries");
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

<a name="getRemoteProcessGroupStatus"></a>
# **getRemoteProcessGroupStatus**
> RemoteProcessGroupStatusEntity getRemoteProcessGroupStatus(id, nodewise, clusterNodeId)

Gets status for a remote process group

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The remote process group id.
    Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
    try {
      RemoteProcessGroupStatusEntity result = apiInstance.getRemoteProcessGroupStatus(id, nodewise, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getRemoteProcessGroupStatus");
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
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**RemoteProcessGroupStatusEntity**](RemoteProcessGroupStatusEntity.md)

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

<a name="getRemoteProcessGroupStatusHistory"></a>
# **getRemoteProcessGroupStatusHistory**
> StatusHistoryEntity getRemoteProcessGroupStatusHistory(id)

Gets the status history

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The remote process group id.
    try {
      StatusHistoryEntity result = apiInstance.getRemoteProcessGroupStatusHistory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getRemoteProcessGroupStatusHistory");
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

[**StatusHistoryEntity**](StatusHistoryEntity.md)

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

<a name="getReportingTaskTypes"></a>
# **getReportingTaskTypes**
> ReportingTaskTypesEntity getReportingTaskTypes(bundleGroupFilter, bundleArtifactFilter, type)

Retrieves the types of reporting tasks that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String bundleGroupFilter = "bundleGroupFilter_example"; // String | If specified, will only return types that are a member of this bundle group.
    String bundleArtifactFilter = "bundleArtifactFilter_example"; // String | If specified, will only return types that are a member of this bundle artifact.
    String type = "type_example"; // String | If specified, will only return types whose fully qualified classname matches.
    try {
      ReportingTaskTypesEntity result = apiInstance.getReportingTaskTypes(bundleGroupFilter, bundleArtifactFilter, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getReportingTaskTypes");
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
 **bundleGroupFilter** | **String**| If specified, will only return types that are a member of this bundle group. | [optional]
 **bundleArtifactFilter** | **String**| If specified, will only return types that are a member of this bundle artifact. | [optional]
 **type** | **String**| If specified, will only return types whose fully qualified classname matches. | [optional]

### Return type

[**ReportingTaskTypesEntity**](ReportingTaskTypesEntity.md)

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

<a name="getReportingTasks"></a>
# **getReportingTasks**
> ReportingTasksEntity getReportingTasks()

Gets all reporting tasks

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      ReportingTasksEntity result = apiInstance.getReportingTasks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getReportingTasks");
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

[**ReportingTasksEntity**](ReportingTasksEntity.md)

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

<a name="getTemplates"></a>
# **getTemplates**
> TemplatesEntity getTemplates()

Gets all templates

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    try {
      TemplatesEntity result = apiInstance.getTemplates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getTemplates");
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

[**TemplatesEntity**](TemplatesEntity.md)

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

<a name="getVersions"></a>
# **getVersions**
> VersionedFlowSnapshotMetadataSetEntity getVersions(registryId, bucketId, flowId)

Gets the flow versions from the specified registry and bucket for the specified flow for the current user

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String registryId = "registryId_example"; // String | The registry id.
    String bucketId = "bucketId_example"; // String | The bucket id.
    String flowId = "flowId_example"; // String | The flow id.
    try {
      VersionedFlowSnapshotMetadataSetEntity result = apiInstance.getVersions(registryId, bucketId, flowId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#getVersions");
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
 **registryId** | **String**| The registry id. |
 **bucketId** | **String**| The bucket id. |
 **flowId** | **String**| The flow id. |

### Return type

[**VersionedFlowSnapshotMetadataSetEntity**](VersionedFlowSnapshotMetadataSetEntity.md)

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

<a name="queryHistory"></a>
# **queryHistory**
> HistoryEntity queryHistory(offset, count, sortColumn, sortOrder, startDate, endDate, userIdentity, sourceId)

Gets configuration history

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String offset = "offset_example"; // String | The offset into the result set.
    String count = "count_example"; // String | The number of actions to return.
    String sortColumn = "sortColumn_example"; // String | The field to sort on.
    String sortOrder = "sortOrder_example"; // String | The direction to sort.
    String startDate = "startDate_example"; // String | Include actions after this date.
    String endDate = "endDate_example"; // String | Include actions before this date.
    String userIdentity = "userIdentity_example"; // String | Include actions performed by this user.
    String sourceId = "sourceId_example"; // String | Include actions on this component.
    try {
      HistoryEntity result = apiInstance.queryHistory(offset, count, sortColumn, sortOrder, startDate, endDate, userIdentity, sourceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#queryHistory");
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
 **offset** | **String**| The offset into the result set. |
 **count** | **String**| The number of actions to return. |
 **sortColumn** | **String**| The field to sort on. | [optional]
 **sortOrder** | **String**| The direction to sort. | [optional]
 **startDate** | **String**| Include actions after this date. | [optional]
 **endDate** | **String**| Include actions before this date. | [optional]
 **userIdentity** | **String**| Include actions performed by this user. | [optional]
 **sourceId** | **String**| Include actions on this component. | [optional]

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

<a name="scheduleComponents"></a>
# **scheduleComponents**
> ScheduleComponentsEntity scheduleComponents(id, body)

Schedule or unschedule components in the specified Process Group.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String id = "id_example"; // String | The process group id.
    ScheduleComponentsEntity body = new ScheduleComponentsEntity(); // ScheduleComponentsEntity | The request to schedule or unschedule. If the comopnents in the request are not specified, all authorized components will be considered.
    try {
      ScheduleComponentsEntity result = apiInstance.scheduleComponents(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#scheduleComponents");
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
 **id** | **String**| The process group id. |
 **body** | [**ScheduleComponentsEntity**](ScheduleComponentsEntity.md)| The request to schedule or unschedule. If the comopnents in the request are not specified, all authorized components will be considered. |

### Return type

[**ScheduleComponentsEntity**](ScheduleComponentsEntity.md)

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

<a name="searchCluster"></a>
# **searchCluster**
> ClusterSearchResultsEntity searchCluster(q)

Searches the cluster for a node with the specified address

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String q = "q_example"; // String | Node address to search for.
    try {
      ClusterSearchResultsEntity result = apiInstance.searchCluster(q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#searchCluster");
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
 **q** | **String**| Node address to search for. |

### Return type

[**ClusterSearchResultsEntity**](ClusterSearchResultsEntity.md)

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

<a name="searchFlow"></a>
# **searchFlow**
> SearchResultsEntity searchFlow(q)

Performs a search against this NiFi using the specified search term

Only search results from authorized components will be returned.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowApi apiInstance = new FlowApi(defaultClient);
    String q = "q_example"; // String | 
    try {
      SearchResultsEntity result = apiInstance.searchFlow(q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowApi#searchFlow");
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
 **q** | **String**|  | [optional]

### Return type

[**SearchResultsEntity**](SearchResultsEntity.md)

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

