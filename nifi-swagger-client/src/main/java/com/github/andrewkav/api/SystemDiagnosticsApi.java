/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * The version of the OpenAPI document: 1.9.2
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.andrewkav.api;

import com.github.andrewkav.ApiCallback;
import com.github.andrewkav.ApiClient;
import com.github.andrewkav.ApiException;
import com.github.andrewkav.ApiResponse;
import com.github.andrewkav.Configuration;
import com.github.andrewkav.Pair;
import com.github.andrewkav.ProgressRequestBody;
import com.github.andrewkav.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.andrewkav.model.SystemDiagnosticsEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemDiagnosticsApi {
    private ApiClient localVarApiClient;

    public SystemDiagnosticsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SystemDiagnosticsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getSystemDiagnostics
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSystemDiagnosticsCall(Boolean nodewise, String clusterNodeId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/system-diagnostics";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (nodewise != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("nodewise", nodewise));
        }

        if (clusterNodeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("clusterNodeId", clusterNodeId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSystemDiagnosticsValidateBeforeCall(Boolean nodewise, String clusterNodeId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSystemDiagnosticsCall(nodewise, clusterNodeId, _callback);
        return localVarCall;

    }

    /**
     * Gets the diagnostics for the system NiFi is running on
     * 
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return SystemDiagnosticsEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
     </table>
     */
    public SystemDiagnosticsEntity getSystemDiagnostics(Boolean nodewise, String clusterNodeId) throws ApiException {
        ApiResponse<SystemDiagnosticsEntity> localVarResp = getSystemDiagnosticsWithHttpInfo(nodewise, clusterNodeId);
        return localVarResp.getData();
    }

    /**
     * Gets the diagnostics for the system NiFi is running on
     * 
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @return ApiResponse&lt;SystemDiagnosticsEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SystemDiagnosticsEntity> getSystemDiagnosticsWithHttpInfo(Boolean nodewise, String clusterNodeId) throws ApiException {
        okhttp3.Call localVarCall = getSystemDiagnosticsValidateBeforeCall(nodewise, clusterNodeId, null);
        Type localVarReturnType = new TypeToken<SystemDiagnosticsEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets the diagnostics for the system NiFi is running on (asynchronously)
     * 
     * @param nodewise Whether or not to include the breakdown per node. Optional, defaults to false (optional, default to false)
     * @param clusterNodeId The id of the node where to get the status. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSystemDiagnosticsAsync(Boolean nodewise, String clusterNodeId, final ApiCallback<SystemDiagnosticsEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSystemDiagnosticsValidateBeforeCall(nodewise, clusterNodeId, _callback);
        Type localVarReturnType = new TypeToken<SystemDiagnosticsEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
