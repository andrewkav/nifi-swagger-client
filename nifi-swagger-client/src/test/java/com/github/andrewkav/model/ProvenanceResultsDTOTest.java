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

import com.github.andrewkav.model.ProvenanceEventDTO;
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
 * Model tests for ProvenanceResultsDTO
 */
public class ProvenanceResultsDTOTest {
    private final ProvenanceResultsDTO model = new ProvenanceResultsDTO();

    /**
     * Model tests for ProvenanceResultsDTO
     */
    @Test
    public void testProvenanceResultsDTO() {
        // TODO: test ProvenanceResultsDTO
    }

    /**
     * Test the property 'provenanceEvents'
     */
    @Test
    public void provenanceEventsTest() {
        // TODO: test provenanceEvents
    }

    /**
     * Test the property 'total'
     */
    @Test
    public void totalTest() {
        // TODO: test total
    }

    /**
     * Test the property 'totalCount'
     */
    @Test
    public void totalCountTest() {
        // TODO: test totalCount
    }

    /**
     * Test the property 'generated'
     */
    @Test
    public void generatedTest() {
        // TODO: test generated
    }

    /**
     * Test the property 'oldestEvent'
     */
    @Test
    public void oldestEventTest() {
        // TODO: test oldestEvent
    }

    /**
     * Test the property 'timeOffset'
     */
    @Test
    public void timeOffsetTest() {
        // TODO: test timeOffset
    }

    /**
     * Test the property 'errors'
     */
    @Test
    public void errorsTest() {
        // TODO: test errors
    }

}