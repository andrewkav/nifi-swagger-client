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

import com.github.andrewkav.model.BulletinEntity;
import com.github.andrewkav.model.PermissionsDTO;
import com.github.andrewkav.model.PositionDTO;
import com.github.andrewkav.model.ProcessGroupDTO;
import com.github.andrewkav.model.ProcessGroupStatusDTO;
import com.github.andrewkav.model.RevisionDTO;
import com.github.andrewkav.model.VersionedFlowSnapshot;
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
 * Model tests for ProcessGroupEntity
 */
public class ProcessGroupEntityTest {
    private final ProcessGroupEntity model = new ProcessGroupEntity();

    /**
     * Model tests for ProcessGroupEntity
     */
    @Test
    public void testProcessGroupEntity() {
        // TODO: test ProcessGroupEntity
    }

    /**
     * Test the property 'revision'
     */
    @Test
    public void revisionTest() {
        // TODO: test revision
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'uri'
     */
    @Test
    public void uriTest() {
        // TODO: test uri
    }

    /**
     * Test the property 'position'
     */
    @Test
    public void positionTest() {
        // TODO: test position
    }

    /**
     * Test the property 'permissions'
     */
    @Test
    public void permissionsTest() {
        // TODO: test permissions
    }

    /**
     * Test the property 'bulletins'
     */
    @Test
    public void bulletinsTest() {
        // TODO: test bulletins
    }

    /**
     * Test the property 'disconnectedNodeAcknowledged'
     */
    @Test
    public void disconnectedNodeAcknowledgedTest() {
        // TODO: test disconnectedNodeAcknowledged
    }

    /**
     * Test the property 'component'
     */
    @Test
    public void componentTest() {
        // TODO: test component
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'versionedFlowSnapshot'
     */
    @Test
    public void versionedFlowSnapshotTest() {
        // TODO: test versionedFlowSnapshot
    }

    /**
     * Test the property 'runningCount'
     */
    @Test
    public void runningCountTest() {
        // TODO: test runningCount
    }

    /**
     * Test the property 'stoppedCount'
     */
    @Test
    public void stoppedCountTest() {
        // TODO: test stoppedCount
    }

    /**
     * Test the property 'invalidCount'
     */
    @Test
    public void invalidCountTest() {
        // TODO: test invalidCount
    }

    /**
     * Test the property 'disabledCount'
     */
    @Test
    public void disabledCountTest() {
        // TODO: test disabledCount
    }

    /**
     * Test the property 'activeRemotePortCount'
     */
    @Test
    public void activeRemotePortCountTest() {
        // TODO: test activeRemotePortCount
    }

    /**
     * Test the property 'inactiveRemotePortCount'
     */
    @Test
    public void inactiveRemotePortCountTest() {
        // TODO: test inactiveRemotePortCount
    }

    /**
     * Test the property 'versionedFlowState'
     */
    @Test
    public void versionedFlowStateTest() {
        // TODO: test versionedFlowState
    }

    /**
     * Test the property 'upToDateCount'
     */
    @Test
    public void upToDateCountTest() {
        // TODO: test upToDateCount
    }

    /**
     * Test the property 'locallyModifiedCount'
     */
    @Test
    public void locallyModifiedCountTest() {
        // TODO: test locallyModifiedCount
    }

    /**
     * Test the property 'staleCount'
     */
    @Test
    public void staleCountTest() {
        // TODO: test staleCount
    }

    /**
     * Test the property 'locallyModifiedAndStaleCount'
     */
    @Test
    public void locallyModifiedAndStaleCountTest() {
        // TODO: test locallyModifiedAndStaleCount
    }

    /**
     * Test the property 'syncFailureCount'
     */
    @Test
    public void syncFailureCountTest() {
        // TODO: test syncFailureCount
    }

    /**
     * Test the property 'inputPortCount'
     */
    @Test
    public void inputPortCountTest() {
        // TODO: test inputPortCount
    }

    /**
     * Test the property 'outputPortCount'
     */
    @Test
    public void outputPortCountTest() {
        // TODO: test outputPortCount
    }

}