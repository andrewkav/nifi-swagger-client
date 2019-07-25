# FlowfileQueuesApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDropRequest**](FlowfileQueuesApi.md#createDropRequest) | **POST** /flowfile-queues/{id}/drop-requests | Creates a request to drop the contents of the queue in this connection.
[**createFlowFileListing**](FlowfileQueuesApi.md#createFlowFileListing) | **POST** /flowfile-queues/{id}/listing-requests | Lists the contents of the queue in this connection.
[**deleteListingRequest**](FlowfileQueuesApi.md#deleteListingRequest) | **DELETE** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Cancels and/or removes a request to list the contents of this connection.
[**downloadFlowFileContent**](FlowfileQueuesApi.md#downloadFlowFileContent) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid}/content | Gets the content for a FlowFile in a Connection.
[**getDropRequest**](FlowfileQueuesApi.md#getDropRequest) | **GET** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Gets the current status of a drop request for the specified connection.
[**getFlowFile**](FlowfileQueuesApi.md#getFlowFile) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid} | Gets a FlowFile from a Connection.
[**getListingRequest**](FlowfileQueuesApi.md#getListingRequest) | **GET** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Gets the current status of a listing request for the specified connection.
[**removeDropRequest**](FlowfileQueuesApi.md#removeDropRequest) | **DELETE** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Cancels and/or removes a request to drop the contents of this connection.


<a name="createDropRequest"></a>
# **createDropRequest**
> DropRequestEntity createDropRequest(id)

Creates a request to drop the contents of the queue in this connection.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowfileQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowfileQueuesApi apiInstance = new FlowfileQueuesApi(defaultClient);
    String id = "id_example"; // String | The connection id.
    try {
      DropRequestEntity result = apiInstance.createDropRequest(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowfileQueuesApi#createDropRequest");
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

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**202** | The request has been accepted. A HTTP response header will contain the URI where the response can be polled. |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="createFlowFileListing"></a>
# **createFlowFileListing**
> ListingRequestEntity createFlowFileListing(id)

Lists the contents of the queue in this connection.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowfileQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowfileQueuesApi apiInstance = new FlowfileQueuesApi(defaultClient);
    String id = "id_example"; // String | The connection id.
    try {
      ListingRequestEntity result = apiInstance.createFlowFileListing(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowfileQueuesApi#createFlowFileListing");
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

[**ListingRequestEntity**](ListingRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |
**202** | The request has been accepted. A HTTP response header will contain the URI where the response can be polled. |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |

<a name="deleteListingRequest"></a>
# **deleteListingRequest**
> ListingRequestEntity deleteListingRequest(id, listingRequestId)

Cancels and/or removes a request to list the contents of this connection.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowfileQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowfileQueuesApi apiInstance = new FlowfileQueuesApi(defaultClient);
    String id = "id_example"; // String | The connection id.
    String listingRequestId = "listingRequestId_example"; // String | The listing request id.
    try {
      ListingRequestEntity result = apiInstance.deleteListingRequest(id, listingRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowfileQueuesApi#deleteListingRequest");
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
 **listingRequestId** | **String**| The listing request id. |

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

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

<a name="downloadFlowFileContent"></a>
# **downloadFlowFileContent**
> Object downloadFlowFileContent(id, flowfileUuid, clientId, clusterNodeId)

Gets the content for a FlowFile in a Connection.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowfileQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowfileQueuesApi apiInstance = new FlowfileQueuesApi(defaultClient);
    String id = "id_example"; // String | The connection id.
    String flowfileUuid = "flowfileUuid_example"; // String | The flowfile uuid.
    String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
    try {
      Object result = apiInstance.downloadFlowFileContent(id, flowfileUuid, clientId, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowfileQueuesApi#downloadFlowFileContent");
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
 **flowfileUuid** | **String**| The flowfile uuid. |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
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

<a name="getDropRequest"></a>
# **getDropRequest**
> DropRequestEntity getDropRequest(id, dropRequestId)

Gets the current status of a drop request for the specified connection.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowfileQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowfileQueuesApi apiInstance = new FlowfileQueuesApi(defaultClient);
    String id = "id_example"; // String | The connection id.
    String dropRequestId = "dropRequestId_example"; // String | The drop request id.
    try {
      DropRequestEntity result = apiInstance.getDropRequest(id, dropRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowfileQueuesApi#getDropRequest");
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
 **dropRequestId** | **String**| The drop request id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

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

<a name="getFlowFile"></a>
# **getFlowFile**
> FlowFileEntity getFlowFile(id, flowfileUuid, clusterNodeId)

Gets a FlowFile from a Connection.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowfileQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowfileQueuesApi apiInstance = new FlowfileQueuesApi(defaultClient);
    String id = "id_example"; // String | The connection id.
    String flowfileUuid = "flowfileUuid_example"; // String | The flowfile uuid.
    String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
    try {
      FlowFileEntity result = apiInstance.getFlowFile(id, flowfileUuid, clusterNodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowfileQueuesApi#getFlowFile");
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
 **flowfileUuid** | **String**| The flowfile uuid. |
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

[**FlowFileEntity**](FlowFileEntity.md)

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

<a name="getListingRequest"></a>
# **getListingRequest**
> ListingRequestEntity getListingRequest(id, listingRequestId)

Gets the current status of a listing request for the specified connection.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowfileQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowfileQueuesApi apiInstance = new FlowfileQueuesApi(defaultClient);
    String id = "id_example"; // String | The connection id.
    String listingRequestId = "listingRequestId_example"; // String | The listing request id.
    try {
      ListingRequestEntity result = apiInstance.getListingRequest(id, listingRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowfileQueuesApi#getListingRequest");
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
 **listingRequestId** | **String**| The listing request id. |

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

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

<a name="removeDropRequest"></a>
# **removeDropRequest**
> DropRequestEntity removeDropRequest(id, dropRequestId)

Cancels and/or removes a request to drop the contents of this connection.

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.FlowfileQueuesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    FlowfileQueuesApi apiInstance = new FlowfileQueuesApi(defaultClient);
    String id = "id_example"; // String | The connection id.
    String dropRequestId = "dropRequestId_example"; // String | The drop request id.
    try {
      DropRequestEntity result = apiInstance.removeDropRequest(id, dropRequestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FlowfileQueuesApi#removeDropRequest");
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
 **dropRequestId** | **String**| The drop request id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

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

