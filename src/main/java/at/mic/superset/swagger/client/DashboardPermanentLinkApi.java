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

import at.mic.superset.swagger.ApiCallback;
import at.mic.superset.swagger.ApiClient;
import at.mic.superset.swagger.ApiException;
import at.mic.superset.swagger.ApiResponse;
import at.mic.superset.swagger.Configuration;
import at.mic.superset.swagger.Pair;
import at.mic.superset.swagger.ProgressRequestBody;
import at.mic.superset.swagger.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import at.mic.superset.swagger.client.model.DashboardPermalinkPostSchema;
import at.mic.superset.swagger.client.model.InlineResponse20016;
import at.mic.superset.swagger.client.model.InlineResponse2017;
import at.mic.superset.swagger.client.model.InlineResponse400;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DashboardPermanentLinkApi {
    private ApiClient apiClient;

    public DashboardPermanentLinkApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DashboardPermanentLinkApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for apiV1DashboardPermalinkKeyGet
     * @param key  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV1DashboardPermalinkKeyGetCall(String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v1/dashboard/permalink/{key}"
            .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV1DashboardPermalinkKeyGetValidateBeforeCall(String key, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling apiV1DashboardPermalinkKeyGet(Async)");
        }
        
        com.squareup.okhttp.Call call = apiV1DashboardPermalinkKeyGetCall(key, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Retrives dashboard state associated with a permanent link.
     * @param key  (required)
     * @return InlineResponse20016
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse20016 apiV1DashboardPermalinkKeyGet(String key) throws ApiException {
        ApiResponse<InlineResponse20016> resp = apiV1DashboardPermalinkKeyGetWithHttpInfo(key);
        return resp.getData();
    }

    /**
     * 
     * Retrives dashboard state associated with a permanent link.
     * @param key  (required)
     * @return ApiResponse&lt;InlineResponse20016&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse20016> apiV1DashboardPermalinkKeyGetWithHttpInfo(String key) throws ApiException {
        com.squareup.okhttp.Call call = apiV1DashboardPermalinkKeyGetValidateBeforeCall(key, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse20016>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrives dashboard state associated with a permanent link.
     * @param key  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV1DashboardPermalinkKeyGetAsync(String key, final ApiCallback<InlineResponse20016> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiV1DashboardPermalinkKeyGetValidateBeforeCall(key, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse20016>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for apiV1DashboardPkPermalinkPost
     * @param body  (required)
     * @param pk  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call apiV1DashboardPkPermalinkPostCall(DashboardPermalinkPostSchema body, String pk, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/dashboard/{pk}/permalink"
            .replaceAll("\\{" + "pk" + "\\}", apiClient.escapeString(pk.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call apiV1DashboardPkPermalinkPostValidateBeforeCall(DashboardPermalinkPostSchema body, String pk, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling apiV1DashboardPkPermalinkPost(Async)");
        }
        // verify the required parameter 'pk' is set
        if (pk == null) {
            throw new ApiException("Missing the required parameter 'pk' when calling apiV1DashboardPkPermalinkPost(Async)");
        }
        
        com.squareup.okhttp.Call call = apiV1DashboardPkPermalinkPostCall(body, pk, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Stores a new permanent link.
     * @param body  (required)
     * @param pk  (required)
     * @return InlineResponse2017
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InlineResponse2017 apiV1DashboardPkPermalinkPost(DashboardPermalinkPostSchema body, String pk) throws ApiException {
        ApiResponse<InlineResponse2017> resp = apiV1DashboardPkPermalinkPostWithHttpInfo(body, pk);
        return resp.getData();
    }

    /**
     * 
     * Stores a new permanent link.
     * @param body  (required)
     * @param pk  (required)
     * @return ApiResponse&lt;InlineResponse2017&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InlineResponse2017> apiV1DashboardPkPermalinkPostWithHttpInfo(DashboardPermalinkPostSchema body, String pk) throws ApiException {
        com.squareup.okhttp.Call call = apiV1DashboardPkPermalinkPostValidateBeforeCall(body, pk, null, null);
        Type localVarReturnType = new TypeToken<InlineResponse2017>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Stores a new permanent link.
     * @param body  (required)
     * @param pk  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call apiV1DashboardPkPermalinkPostAsync(DashboardPermalinkPostSchema body, String pk, final ApiCallback<InlineResponse2017> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = apiV1DashboardPkPermalinkPostValidateBeforeCall(body, pk, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InlineResponse2017>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
