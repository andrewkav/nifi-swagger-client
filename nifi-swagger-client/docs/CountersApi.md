# CountersApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCounters**](CountersApi.md#getCounters) | **GET** /counters | Gets the current counters for this NiFi
[**updateCounter**](CountersApi.md#updateCounter) | **PUT** /counters/{id} | Updates the specified counter. This will reset the counter value to 0


<a name="getCounters"></a>
# **getCounters**
> CountersEntity getCounters(nodewise, clusterNodeId)

Gets the current counters for this NiFi

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.CountersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    CountersApi apiInstance = new CountersApi(defaultClient);
    Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
    try {
      CountersEntity result = apiInstance.getCounters(nodewise, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountersApi#getCounters");
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
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**CountersEntity**](CountersEntity.md)

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

<a name="updateCounter"></a>
# **updateCounter**
> CounterEntity updateCounter(id)

Updates the specified counter. This will reset the counter value to 0

Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.CountersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    CountersApi apiInstance = new CountersApi(defaultClient);
    String id = "id_example"; // String | The id of the counter.
    try {
      CounterEntity result = apiInstance.updateCounter(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountersApi#updateCounter");
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
 **id** | **String**| The id of the counter. |

### Return type

[**CounterEntity**](CounterEntity.md)

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

