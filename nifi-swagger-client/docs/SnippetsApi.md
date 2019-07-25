# SnippetsApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnippet**](SnippetsApi.md#createSnippet) | **POST** /snippets | Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.
[**deleteSnippet**](SnippetsApi.md#deleteSnippet) | **DELETE** /snippets/{id} | Deletes the components in a snippet and discards the snippet
[**updateSnippet**](SnippetsApi.md#updateSnippet) | **PUT** /snippets/{id} | Move&#39;s the components in this Snippet into a new Process Group and discards the snippet


<a name="createSnippet"></a>
# **createSnippet**
> SnippetEntity createSnippet(body)

Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.SnippetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    SnippetsApi apiInstance = new SnippetsApi(defaultClient);
    SnippetEntity body = new SnippetEntity(); // SnippetEntity | The snippet configuration details.
    try {
      SnippetEntity result = apiInstance.createSnippet(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnippetsApi#createSnippet");
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
 **body** | [**SnippetEntity**](SnippetEntity.md)| The snippet configuration details. |

### Return type

[**SnippetEntity**](SnippetEntity.md)

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

<a name="deleteSnippet"></a>
# **deleteSnippet**
> SnippetEntity deleteSnippet(id, disconnectedNodeAcknowledged)

Deletes the components in a snippet and discards the snippet

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.SnippetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    SnippetsApi apiInstance = new SnippetsApi(defaultClient);
    String id = "id_example"; // String | The snippet id.
    Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
    try {
      SnippetEntity result = apiInstance.deleteSnippet(id, disconnectedNodeAcknowledged);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnippetsApi#deleteSnippet");
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
 **id** | **String**| The snippet id. |
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**SnippetEntity**](SnippetEntity.md)

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

<a name="updateSnippet"></a>
# **updateSnippet**
> SnippetEntity updateSnippet(id, body)

Move&#39;s the components in this Snippet into a new Process Group and discards the snippet

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.SnippetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    SnippetsApi apiInstance = new SnippetsApi(defaultClient);
    String id = "id_example"; // String | The snippet id.
    SnippetEntity body = new SnippetEntity(); // SnippetEntity | The snippet configuration details.
    try {
      SnippetEntity result = apiInstance.updateSnippet(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SnippetsApi#updateSnippet");
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
 **id** | **String**| The snippet id. |
 **body** | [**SnippetEntity**](SnippetEntity.md)| The snippet configuration details. |

### Return type

[**SnippetEntity**](SnippetEntity.md)

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

