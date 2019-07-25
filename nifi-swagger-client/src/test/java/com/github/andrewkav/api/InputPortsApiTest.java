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

import com.github.andrewkav.ApiException;
import com.github.andrewkav.model.PortEntity;
import com.github.andrewkav.model.PortRunStatusEntity;
import com.github.andrewkav.model.ProcessorEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InputPortsApi
 */
@Ignore
public class InputPortsApiTest {

    private final InputPortsApi api = new InputPortsApi();

    
    /**
     * Gets an input port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInputPortTest() throws ApiException {
        String id = null;
        PortEntity response = api.getInputPort(id);

        // TODO: test validations
    }
    
    /**
     * Deletes an input port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeInputPortTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        Boolean disconnectedNodeAcknowledged = null;
        PortEntity response = api.removeInputPort(id, version, clientId, disconnectedNodeAcknowledged);

        // TODO: test validations
    }
    
    /**
     * Updates an input port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInputPortTest() throws ApiException {
        String id = null;
        PortEntity body = null;
        PortEntity response = api.updateInputPort(id, body);

        // TODO: test validations
    }
    
    /**
     * Updates run status of an input-port
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRunStatusTest() throws ApiException {
        String id = null;
        PortRunStatusEntity body = null;
        ProcessorEntity response = api.updateRunStatus(id, body);

        // TODO: test validations
    }
    
}