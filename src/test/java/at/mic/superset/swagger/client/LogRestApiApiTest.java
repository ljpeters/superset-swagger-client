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
import at.mic.superset.swagger.client.model.GetItemSchema;
import at.mic.superset.swagger.client.model.GetListSchema;
import at.mic.superset.swagger.client.model.InlineResponse20036;
import at.mic.superset.swagger.client.model.InlineResponse20037;
import at.mic.superset.swagger.client.model.InlineResponse20112;
import at.mic.superset.swagger.client.model.InlineResponse400;
import at.mic.superset.swagger.client.model.LogRestApiPost;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogRestApiApi
 */
@Ignore
public class LogRestApiApiTest {

    private final LogRestApiApi api = new LogRestApiApi();

    /**
     * 
     *
     * Get a list of models
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1LogGetTest() throws ApiException {
        GetListSchema q = null;
        InlineResponse20036 response = api.apiV1LogGet(q);

        // TODO: test validations
    }
    /**
     * 
     *
     * Get an item model
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1LogPkGetTest() throws ApiException {
        Integer pk = null;
        GetItemSchema q = null;
        InlineResponse20037 response = api.apiV1LogPkGet(pk, q);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1LogPostTest() throws ApiException {
        LogRestApiPost body = null;
        InlineResponse20112 response = api.apiV1LogPost(body);

        // TODO: test validations
    }
}
