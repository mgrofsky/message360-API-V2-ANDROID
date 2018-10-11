/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

import com.ytel.api.*;
import com.ytel.api.models.*;
import com.ytel.api.exceptions.*;
import com.ytel.api.http.client.HttpClient;
import com.ytel.api.http.client.HttpContext;
import com.ytel.api.http.request.HttpRequest;
import com.ytel.api.http.response.HttpResponse;
import com.ytel.api.http.response.HttpStringResponse;
import com.ytel.api.http.client.APICallBack;

public class SubAccountController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static SubAccountController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SubAccountController class 
     */
    public static SubAccountController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new SubAccountController();
            }
        }
        return instance;
    }

    /**
     * Suspend or unsuspend
     * @param    subAccountSID    Required parameter: The SubaccountSid to be activated or suspended
     * @param    mActivate    Required parameter: 0 to suspend or 1 to activate
     * @return    Returns the void response from the API call 
     */
    public void createToggleSubaccountStatusAsync(
                final String subAccountSID,
                final MActivateEnum mActivate,
                final APICallBack<String> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/user/subaccountactivation.json");
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 9024873901054908219L;
                    {
                        put( "user-agent", "APIMATIC 2.0" );
                    }
                };

                //load all fields for the outgoing API request
                Map<String, Object> _parameters = new HashMap<String, Object>() {
                    private static final long serialVersionUID = -377152785L;
                    {
                        put( "SubAccountSID", subAccountSID );
                        put( "mActivate", (mActivate != null) ? mActivate.value() : null );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                                Configuration.basicAuthUserName, Configuration.basicAuthPassword);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Delete sub account or merge numbers into parent
     * @param    subAccountSID    Required parameter: The SubaccountSid to be deleted
     * @param    mergeNumber    Required parameter: 0 to delete or 1 to merge numbers to parent account.
     * @return    Returns the void response from the API call 
     */
    public void createDeleteSubaccountAsync(
                final String subAccountSID,
                final MergeNumberEnum mergeNumber,
                final APICallBack<String> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/user/deletesubaccount.json");
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 9024873901054908219L;
                    {
                        put( "user-agent", "APIMATIC 2.0" );
                    }
                };

                //load all fields for the outgoing API request
                Map<String, Object> _parameters = new HashMap<String, Object>() {
                    private static final long serialVersionUID = -1223702957L;
                    {
                        put( "SubAccountSID", subAccountSID );
                        put( "MergeNumber", (mergeNumber != null) ? mergeNumber.value() : null );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                                Configuration.basicAuthUserName, Configuration.basicAuthPassword);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Create a sub user account under the parent account
     * @param    firstName    Required parameter: Sub account user first name
     * @param    lastName    Required parameter: sub account user last name
     * @param    email    Required parameter: Sub account email address
     * @param    friendlyName    Required parameter: Descriptive name of the sub account
     * @param    password    Required parameter: The password of the sub account.  Please make sure to make as password that is at least 8 characters long, contain a symbol, uppercase and a number.
     * @return    Returns the void response from the API call 
     */
    public void createSubaccountAsync(
                final String firstName,
                final String lastName,
                final String email,
                final String friendlyName,
                final String password,
                final APICallBack<String> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/user/createsubaccount.json");
                //validate and preprocess url
                String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

                //load all headers for the outgoing API request
                Map<String, String> _headers = new HashMap<String, String>() {
                    private static final long serialVersionUID = 9024873901054908219L;
                    {
                        put( "user-agent", "APIMATIC 2.0" );
                    }
                };

                //load all fields for the outgoing API request
                Map<String, Object> _parameters = new HashMap<String, Object>() {
                    private static final long serialVersionUID = 7817137385985862667L;
                    {
                        put( "FirstName", firstName );
                        put( "LastName", lastName );
                        put( "Email", email );
                        put( "FriendlyName", friendlyName );
                        put( "Password", password );
                    }
                };

                //prepare and invoke the API call request to fetch the response
                final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters),
                                                Configuration.basicAuthUserName, Configuration.basicAuthPassword);

                //invoke the callback before request if its not null
                if (getHttpCallBack() != null)
                {
                    getHttpCallBack().OnBeforeRequest(_request);
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _result = ((HttpStringResponse)_response).getBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
                        {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}