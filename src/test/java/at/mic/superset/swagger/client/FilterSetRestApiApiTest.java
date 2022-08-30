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
import at.mic.superset.swagger.client.model.FilterSetRestApiPost;
import at.mic.superset.swagger.client.model.FilterSetRestApiPut;
import at.mic.superset.swagger.client.model.InlineResponse20017;
import at.mic.superset.swagger.client.model.InlineResponse20018;
import at.mic.superset.swagger.client.model.InlineResponse2015;
import at.mic.superset.swagger.client.model.InlineResponse400;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilterSetRestApiApi
 */
@Ignore
public class FilterSetRestApiApiTest {

    private final FilterSetRestApiApi api = new FilterSetRestApiApi();

    /**
     * 
     *
     * Get a dashboard&#x27;s list of filter sets
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1DashboardDashboardIdFiltersetsGetTest() throws ApiException {
        Integer dashboardId = null;
        List<InlineResponse20017> response = api.apiV1DashboardDashboardIdFiltersetsGet(dashboardId);

        // TODO: test validations
    }
    /**
     * 
     *
     * Deletes a Dashboard.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1DashboardDashboardIdFiltersetsPkDeleteTest() throws ApiException {
        Integer dashboardId = null;
        Integer pk = null;
        InlineResponse400 response = api.apiV1DashboardDashboardIdFiltersetsPkDelete(dashboardId, pk);

        // TODO: test validations
    }
    /**
     * 
     *
     * Changes a Dashboard&#x27;s Filter set.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1DashboardDashboardIdFiltersetsPkPutTest() throws ApiException {
        FilterSetRestApiPut body = null;
        Integer dashboardId = null;
        Integer pk = null;
        InlineResponse20018 response = api.apiV1DashboardDashboardIdFiltersetsPkPut(body, dashboardId, pk);

        // TODO: test validations
    }
    /**
     * 
     *
     * Create a new Dashboard&#x27;s Filter Set.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiV1DashboardDashboardIdFiltersetsPostTest() throws ApiException {
        FilterSetRestApiPost body = null;
        Integer dashboardId = null;
        InlineResponse2015 response = api.apiV1DashboardDashboardIdFiltersetsPost(body, dashboardId);

        // TODO: test validations
    }
}
