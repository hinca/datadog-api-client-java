package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.APIErrorResponse;
import com.datadog.api.v1.client.model.AuthenticationValidationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AuthenticationApi {
  private ApiClient apiClient;

  public AuthenticationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthenticationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<AuthenticationValidationResponse> validateWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/validate";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    // Set Operation-ID header for telemetry
    localVarHeaderParams.put("DD-OPERATION-ID", "validate");

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth" };

    GenericType<AuthenticationValidationResponse> localVarReturnType = new GenericType<AuthenticationValidationResponse>() {};
    return apiClient.invokeAPI("AuthenticationApi.validate", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIvalidateRequest {

    private APIvalidateRequest() {
    }
    

    /**
     * Execute validate request
     * @return AuthenticationValidationResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AuthenticationValidationResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute validate request with HTTP info returned
     * @return ApiResponse&lt;AuthenticationValidationResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<AuthenticationValidationResponse> executeWithHttpInfo() throws ApiException {
      return validateWithHttpInfo();
    }
  }

  /**
   * Validate API key
   * Check if the API key (not the APP key) is valid. If invalid, a 403 is returned.
   * @return validateRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIvalidateRequest validate() throws ApiException {
    return new APIvalidateRequest();
  }
}
