/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.controllers;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.ytel.api.models.*;
import com.ytel.api.exceptions.*;
import com.ytel.api.APIHelper;
import com.ytel.api.Configuration;
import com.ytel.api.testing.TestHelper;
import com.ytel.api.controllers.CarrierController;
import com.ytel.api.controllers.syncwrapper.APICallBackCatcher;

import com.fasterxml.jackson.core.type.TypeReference;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class CarrierControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static CarrierController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getCarrier();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Retrieve a list of carrier lookup objects.
     * @throws Throwable
     */
    @Test
    public void testTestCarrierResults() throws Throwable {
        // Parameters for the API call
        Integer page = null;
        Integer pageSize = null;

        // Set callback and perform API call
        String result = null;
        APICallBackCatcher<String> response = new APICallBackCatcher<String>();
        controller.setHttpCallBack(httpResponse);
        controller.createCarrierResultsAsync(page, pageSize, response);
        result = response.getResult();

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

    }

}