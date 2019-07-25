# ProvenanceEventsApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInputContent**](ProvenanceEventsApi.md#getInputContent) | **GET** /provenance-events/{id}/content/input | Gets the input content for a provenance event
[**getOutputContent**](ProvenanceEventsApi.md#getOutputContent) | **GET** /provenance-events/{id}/content/output | Gets the output content for a provenance event
[**getProvenanceEvent**](ProvenanceEventsApi.md#getProvenanceEvent) | **GET** /provenance-events/{id} | Gets a provenance event
[**submitReplay**](ProvenanceEventsApi.md#submitReplay) | **POST** /provenance-events/replays | Replays content from a provenance event


<a name="getInputContent"></a>
# **getInputContent**
> Object getInputContent(id, clusterNodeId)

Gets the input content for a provenance event

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProvenanceEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProvenanceEventsApi apiInstance = new ProvenanceEventsApi(defaultClient);
    String id = "id_example"; // String | The provenance event id.
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
    try {
      Object result = apiInstance.getInputContent(id, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvenanceEventsApi#getInputContent");
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
 **id** | **String**| The provenance event id. |
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="getOutputContent"></a>
# **getOutputContent**
> Object getOutputContent(id, clusterNodeId)

Gets the output content for a provenance event

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProvenanceEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProvenanceEventsApi apiInstance = new ProvenanceEventsApi(defaultClient);
    String id = "id_example"; // String | The provenance event id.
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
    try {
      Object result = apiInstance.getOutputContent(id, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvenanceEventsApi#getOutputContent");
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
 **id** | **String**| The provenance event id. |
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="getProvenanceEvent"></a>
# **getProvenanceEvent**
> ProvenanceEventEntity getProvenanceEvent(id, clusterNodeId)

Gets a provenance event

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProvenanceEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProvenanceEventsApi apiInstance = new ProvenanceEventsApi(defaultClient);
    String id = "id_example"; // String | The provenance event id.
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where this event exists if clustered.
    try {
      ProvenanceEventEntity result = apiInstance.getProvenanceEvent(id, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvenanceEventsApi#getProvenanceEvent");
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
 **id** | **String**| The provenance event id. |
 **clusterNodeId** | **String**| The id of the node where this event exists if clustered. | [optional]

### Return type

[**ProvenanceEventEntity**](ProvenanceEventEntity.md)

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

<a name="submitReplay"></a>
# **submitReplay**
> ProvenanceEventEntity submitReplay(body)

Replays content from a provenance event

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.ProvenanceEventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    ProvenanceEventsApi apiInstance = new ProvenanceEventsApi(defaultClient);
    SubmitReplayRequestEntity body = new SubmitReplayRequestEntity(); // SubmitReplayRequestEntity | The replay request.
    try {
      ProvenanceEventEntity result = apiInstance.submitReplay(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvenanceEventsApi#submitReplay");
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
 **body** | [**SubmitReplayRequestEntity**](SubmitReplayRequestEntity.md)| The replay request. |

### Return type

[**ProvenanceEventEntity**](ProvenanceEventEntity.md)

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

