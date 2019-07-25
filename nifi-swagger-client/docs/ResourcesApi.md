# ResourcesApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResources**](ResourcesApi.md#getResources) | **GET** /resources | Gets the available resources that support access/authorization policies


<a name="getResources"></a>
# **getResources**
> ResourcesEntity getResources()

Gets the available resources that support access/authorization policies

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ResourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ResourcesApi apiInstance = new ResourcesApi(defaultClient);
    try {
      ResourcesEntity result = apiInstance.getResources();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ResourcesApi#getResources");
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

[**ResourcesEntity**](ResourcesEntity.md)

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

