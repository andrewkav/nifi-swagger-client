# DataTransferApi

All URIs are relative to *http://http:/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commitInputPortTransaction**](DataTransferApi.md#commitInputPortTransaction) | **DELETE** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
[**commitOutputPortTransaction**](DataTransferApi.md#commitOutputPortTransaction) | **DELETE** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
[**createPortTransaction**](DataTransferApi.md#createPortTransaction) | **POST** /data-transfer/{portType}/{portId}/transactions | Create a transaction to the specified output port or input port
[**extendInputPortTransactionTTL**](DataTransferApi.md#extendInputPortTransactionTTL) | **PUT** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
[**extendOutputPortTransactionTTL**](DataTransferApi.md#extendOutputPortTransactionTTL) | **PUT** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
[**receiveFlowFiles**](DataTransferApi.md#receiveFlowFiles) | **POST** /data-transfer/input-ports/{portId}/transactions/{transactionId}/flow-files | Transfer flow files to the input port
[**transferFlowFiles**](DataTransferApi.md#transferFlowFiles) | **GET** /data-transfer/output-ports/{portId}/transactions/{transactionId}/flow-files | Transfer flow files from the output port


<a name="commitInputPortTransaction"></a>
# **commitInputPortTransaction**
> TransactionResultEntity commitInputPortTransaction(responseCode, portId, transactionId)

Commit or cancel the specified transaction

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.DataTransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    DataTransferApi apiInstance = new DataTransferApi(defaultClient);
    Integer responseCode = 56; // Integer | The response code. Available values are BAD_CHECKSUM(19), CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15).
    String portId = "portId_example"; // String | The input port id.
    String transactionId = "transactionId_example"; // String | The transaction id.
    try {
      TransactionResultEntity result = apiInstance.commitInputPortTransaction(responseCode, portId, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTransferApi#commitInputPortTransaction");
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
 **responseCode** | **Integer**| The response code. Available values are BAD_CHECKSUM(19), CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15). |
 **portId** | **String**| The input port id. |
 **transactionId** | **String**| The transaction id. |

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

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
**503** | NiFi instance is not ready for serving request, or temporarily overloaded. Retrying the same request later may be successful |  -  |

<a name="commitOutputPortTransaction"></a>
# **commitOutputPortTransaction**
> TransactionResultEntity commitOutputPortTransaction(responseCode, checksum, portId, transactionId)

Commit or cancel the specified transaction

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.DataTransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    DataTransferApi apiInstance = new DataTransferApi(defaultClient);
    Integer responseCode = 56; // Integer | The response code. Available values are CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15).
    String checksum = "checksum_example"; // String | A checksum calculated at client side using CRC32 to check flow file content integrity. It must match with the value calculated at server side.
    String portId = "portId_example"; // String | The output port id.
    String transactionId = "transactionId_example"; // String | The transaction id.
    try {
      TransactionResultEntity result = apiInstance.commitOutputPortTransaction(responseCode, checksum, portId, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTransferApi#commitOutputPortTransaction");
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
 **responseCode** | **Integer**| The response code. Available values are CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15). |
 **checksum** | **String**| A checksum calculated at client side using CRC32 to check flow file content integrity. It must match with the value calculated at server side. |
 **portId** | **String**| The output port id. |
 **transactionId** | **String**| The transaction id. |

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

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
**503** | NiFi instance is not ready for serving request, or temporarily overloaded. Retrying the same request later may be successful |  -  |

<a name="createPortTransaction"></a>
# **createPortTransaction**
> TransactionResultEntity createPortTransaction(portType, portId)

Create a transaction to the specified output port or input port

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.DataTransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    DataTransferApi apiInstance = new DataTransferApi(defaultClient);
    String portType = "portType_example"; // String | The port type.
    String portId = "portId_example"; // String | 
    try {
      TransactionResultEntity result = apiInstance.createPortTransaction(portType, portId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTransferApi#createPortTransaction");
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
 **portType** | **String**| The port type. | [enum: input-ports, output-ports]
 **portId** | **String**|  |

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

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
**503** | NiFi instance is not ready for serving request, or temporarily overloaded. Retrying the same request later may be successful |  -  |

<a name="extendInputPortTransactionTTL"></a>
# **extendInputPortTransactionTTL**
> TransactionResultEntity extendInputPortTransactionTTL(portId, transactionId)

Extend transaction TTL

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.DataTransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    DataTransferApi apiInstance = new DataTransferApi(defaultClient);
    String portId = "portId_example"; // String | 
    String transactionId = "transactionId_example"; // String | 
    try {
      TransactionResultEntity result = apiInstance.extendInputPortTransactionTTL(portId, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTransferApi#extendInputPortTransactionTTL");
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
 **portId** | **String**|  |
 **transactionId** | **String**|  |

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

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

<a name="extendOutputPortTransactionTTL"></a>
# **extendOutputPortTransactionTTL**
> TransactionResultEntity extendOutputPortTransactionTTL(portId, transactionId)

Extend transaction TTL

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.DataTransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    DataTransferApi apiInstance = new DataTransferApi(defaultClient);
    String portId = "portId_example"; // String | 
    String transactionId = "transactionId_example"; // String | 
    try {
      TransactionResultEntity result = apiInstance.extendOutputPortTransactionTTL(portId, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTransferApi#extendOutputPortTransactionTTL");
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
 **portId** | **String**|  |
 **transactionId** | **String**|  |

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

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
**503** | NiFi instance is not ready for serving request, or temporarily overloaded. Retrying the same request later may be successful |  -  |

<a name="receiveFlowFiles"></a>
# **receiveFlowFiles**
> String receiveFlowFiles(portId, transactionId)

Transfer flow files to the input port

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.DataTransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    DataTransferApi apiInstance = new DataTransferApi(defaultClient);
    String portId = "portId_example"; // String | The input port id.
    String transactionId = "transactionId_example"; // String | 
    try {
      String result = apiInstance.receiveFlowFiles(portId, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTransferApi#receiveFlowFiles");
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
 **portId** | **String**| The input port id. |
 **transactionId** | **String**|  |

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
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |
**503** | NiFi instance is not ready for serving request, or temporarily overloaded. Retrying the same request later may be successful |  -  |

<a name="transferFlowFiles"></a>
# **transferFlowFiles**
> Object transferFlowFiles(portId, transactionId)

Transfer flow files from the output port

### Example
```java
// Import classes:
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.models.*;
import com.github.andrewkav.api.DataTransferApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://http:/nifi-api");

    DataTransferApi apiInstance = new DataTransferApi(defaultClient);
    String portId = "portId_example"; // String | The output port id.
    String transactionId = "transactionId_example"; // String | 
    try {
      Object result = apiInstance.transferFlowFiles(portId, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTransferApi#transferFlowFiles");
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
 **portId** | **String**| The output port id. |
 **transactionId** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | There is no flow file to return. |  -  |
**400** | NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. |  -  |
**401** | Client could not be authenticated. |  -  |
**403** | Client is not authorized to make this request. |  -  |
**404** | The specified resource could not be found. |  -  |
**409** | The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. |  -  |
**503** | NiFi instance is not ready for serving request, or temporarily overloaded. Retrying the same request later may be successful |  -  |

