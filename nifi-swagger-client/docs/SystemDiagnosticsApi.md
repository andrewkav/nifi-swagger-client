# SystemDiagnosticsApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSystemDiagnostics**](SystemDiagnosticsApi.md#getSystemDiagnostics) | **GET** /system-diagnostics | Gets the diagnostics for the system NiFi is running on


<a name="getSystemDiagnostics"></a>
# **getSystemDiagnostics**
> SystemDiagnosticsEntity getSystemDiagnostics(nodewise, clusterNodeId)

Gets the diagnostics for the system NiFi is running on

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.SystemDiagnosticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    SystemDiagnosticsApi apiInstance = new SystemDiagnosticsApi(defaultClient);
    Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
    try {
      SystemDiagnosticsEntity result = apiInstance.getSystemDiagnostics(nodewise, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SystemDiagnosticsApi#getSystemDiagnostics");
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

[**SystemDiagnosticsEntity**](SystemDiagnosticsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |

