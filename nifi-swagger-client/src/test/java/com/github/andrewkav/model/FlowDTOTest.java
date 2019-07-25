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


package com.github.andrewkav.model;

import com.github.andrewkav.model.ConnectionEntity;
import com.github.andrewkav.model.FunnelEntity;
import com.github.andrewkav.model.LabelEntity;
import com.github.andrewkav.model.PortEntity;
import com.github.andrewkav.model.ProcessGroupEntity;
import com.github.andrewkav.model.ProcessorEntity;
import com.github.andrewkav.model.RemoteProcessGroupEntity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for FlowDTO
 */
public class FlowDTOTest {
    private final FlowDTO model = new FlowDTO();

    /**
     * Model tests for FlowDTO
     */
    @Test
    public void testFlowDTO() {
        // TODO: test FlowDTO
    }

    /**
     * Test the property 'processGroups'
     */
    @Test
    public void processGroupsTest() {
        // TODO: test processGroups
    }

    /**
     * Test the property 'remoteProcessGroups'
     */
    @Test
    public void remoteProcessGroupsTest() {
        // TODO: test remoteProcessGroups
    }

    /**
     * Test the property 'processors'
     */
    @Test
    public void processorsTest() {
        // TODO: test processors
    }

    /**
     * Test the property 'inputPorts'
     */
    @Test
    public void inputPortsTest() {
        // TODO: test inputPorts
    }

    /**
     * Test the property 'outputPorts'
     */
    @Test
    public void outputPortsTest() {
        // TODO: test outputPorts
    }

    /**
     * Test the property 'connections'
     */
    @Test
    public void connectionsTest() {
        // TODO: test connections
    }

    /**
     * Test the property 'labels'
     */
    @Test
    public void labelsTest() {
        // TODO: test labels
    }

    /**
     * Test the property 'funnels'
     */
    @Test
    public void funnelsTest() {
        // TODO: test funnels
    }

}
