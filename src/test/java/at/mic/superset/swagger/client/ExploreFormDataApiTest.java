/*
 * Superset
 * Superset
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package at.mic.superset.swagger.client;

import at.mic.superset.swagger.ApiException;
import at.mic.superset.swagger.client.model.FormDataPostSchema;
import at.mic.superset.swagger.client.model.FormDataPutSchema;
import at.mic.superset.swagger.client.model.InlineResponse20025;
import at.mic.superset.swagger.client.model.InlineResponse20035;
import at.mic.superset.swagger.client.model.InlineResponse20110;
import at.mic.superset.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExploreFormDataApi
 */
@Ignore
public class ExploreFormDataApiTest {

    private final ExploreFormDataApi api = new ExploreFormDataApi();

    /**
     * 
     *
     * Deletes a form_data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1ExploreFormDataKeyDeleteTest() throws ApiException {
        String key = null;
        InlineResponse20025 response = api.apiV1ExploreFormDataKeyDelete(key);

        // TODO: test validations
    }
    /**
     * 
     *
     * Retrives a form_data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1ExploreFormDataKeyGetTest() throws ApiException {
        String key = null;
        InlineResponse20035 response = api.apiV1ExploreFormDataKeyGet(key);

        // TODO: test validations
    }
    /**
     * 
     *
     * Updates an existing form_data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1ExploreFormDataKeyPutTest() throws ApiException {
        FormDataPutSchema body = null;
        String key = null;
        Integer tabId = null;
        InlineResponse20110 response = api.apiV1ExploreFormDataKeyPut(body, key, tabId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Stores a new form_data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1ExploreFormDataPostTest() throws ApiException {
        FormDataPostSchema body = null;
        Integer tabId = null;
        InlineResponse20110 response = api.apiV1ExploreFormDataPost(body, tabId);

        // TODO: test validations
    }
}
