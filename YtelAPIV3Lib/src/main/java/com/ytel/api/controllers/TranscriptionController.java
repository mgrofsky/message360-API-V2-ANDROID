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

public class TranscriptionController extends BaseController {    
    //private static variables for the singleton pattern
    private static Object syncObject = new Object();
    private static TranscriptionController instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the TranscriptionController class 
     */
    public static TranscriptionController getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new TranscriptionController();
            }
        }
        return instance;
    }

    /**
     * Transcribe an audio recording from a file.
     * @param    audiourl    Required parameter: URL pointing to the location of the audio file that is to be transcribed.
     * @return    Returns the void response from the API call 
     */
    public void createTranscribeAudioURLAsync(
                final String audiourl,
                final APICallBack<String> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/transcriptions/audiourltranscription.json");
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
                    private static final long serialVersionUID = -6657700938704353110L;
                    {
                        put( "audiourl", audiourl );
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
     * Transcribe a recording by its RecordingSid.
     * @param    recordingSid    Required parameter: The unique identifier for a recording object.
     * @return    Returns the void response from the API call 
     */
    public void createTranscribeRecordingAsync(
                final String recordingSid,
                final APICallBack<String> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/transcriptions/recordingtranscription.json");
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
                    private static final long serialVersionUID = -1265887587L;
                    {
                        put( "recordingSid", recordingSid );
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
     * Retrieve information about a transaction by its TranscriptionSid.
     * @param    transcriptionsid    Required parameter: The unique identifier for a transcription object.
     * @return    Returns the void response from the API call 
     */
    public void createViewTranscriptionAsync(
                final String transcriptionsid,
                final APICallBack<String> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/transcriptions/viewtranscription.json");
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
                    private static final long serialVersionUID = -4498052453609809010L;
                    {
                        put( "transcriptionsid", transcriptionsid );
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
     * Retrieve a list of transcription objects for your Ytel account.
     * @param    page    Optional parameter: The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     * @param    pagesize    Optional parameter: The count of objects to return per page.
     * @param    status    Optional parameter: The state of the transcription.
     * @param    dateTranscribed    Optional parameter: The date the transcription took place.
     * @return    Returns the void response from the API call 
     */
    public void createListTranscriptionsAsync(
                final Integer page,
                final Integer pagesize,
                final Status12Enum status,
                final String dateTranscribed,
                final APICallBack<String> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                //the base uri for api requests
                String _baseUri = Configuration.baseUri;

                //prepare query string for API call
                StringBuilder _queryBuilder = new StringBuilder(_baseUri);
                _queryBuilder.append("/transcriptions/listtranscription.json");
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
                    private static final long serialVersionUID = 7021061452355906960L;
                    {
                        put( "page", page );
                        put( "pagesize", pagesize );
                        put( "status", (status != null) ? status.value() : null );
                        put( "dateTranscribed", dateTranscribed );
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