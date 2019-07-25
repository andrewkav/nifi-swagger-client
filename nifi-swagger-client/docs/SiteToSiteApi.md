# SiteToSiteApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeers**](SiteToSiteApi.md#getPeers) | **GET** /site-to-site/peers | Returns the available Peers and its status of this NiFi
[**getSiteToSiteDetails**](SiteToSiteApi.md#getSiteToSiteDetails) | **GET** /site-to-site | Returns the details about this NiFi necessary to communicate via site to site


<a name="getPeers"></a>
# **getPeers**
> PeersEntity getPeers()

Returns the available Peers and its status of this NiFi

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.SiteToSiteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    SiteToSiteApi apiInstance = new SiteToSiteApi(defaultClient);
    try {
      PeersEntity result = apiInstance.getPeers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SiteToSiteApi#getPeers");
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

[**PeersEntity**](PeersEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="getSiteToSiteDetails"></a>
# **getSiteToSiteDetails**
> ControllerEntity getSiteToSiteDetails()

Returns the details about this NiFi necessary to communicate via site to site

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.SiteToSiteApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    SiteToSiteApi apiInstance = new SiteToSiteApi(defaultClient);
    try {
      ControllerEntity result = apiInstance.getSiteToSiteDetails();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SiteToSiteApi#getSiteToSiteDetails");
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

[**ControllerEntity**](ControllerEntity.md)

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

