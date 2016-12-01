/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSendSMSInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5114442844497100807L;
    private int fromcountrycode = 1;
    private String from;
    private int tocountrycode = 1;
    private String to;
    private String body;
    private HttpAction method;
    private String messagestatuscallback;
    private String responseType = "json";
    /** GETTER
     * From Country Code
     */
    @JsonGetter("fromcountrycode")
    public int getFromcountrycode ( ) { 
        return this.fromcountrycode;
    }
    
    /** SETTER
     * From Country Code
     */
    @JsonSetter("fromcountrycode")
    public void setFromcountrycode (int value) { 
        this.fromcountrycode = value;
        notifyObservers(this.fromcountrycode);
    }
 
    /** GETTER
     * SMS enabled Message360 number to send this message from
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * SMS enabled Message360 number to send this message from
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
        notifyObservers(this.from);
    }
 
    /** GETTER
     * To country code
     */
    @JsonGetter("tocountrycode")
    public int getTocountrycode ( ) { 
        return this.tocountrycode;
    }
    
    /** SETTER
     * To country code
     */
    @JsonSetter("tocountrycode")
    public void setTocountrycode (int value) { 
        this.tocountrycode = value;
        notifyObservers(this.tocountrycode);
    }
 
    /** GETTER
     * Number to send the SMS to
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * Number to send the SMS to
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
        notifyObservers(this.to);
    }
 
    /** GETTER
     * Text Message To Send
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * Text Message To Send
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
        notifyObservers(this.body);
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required URL once SMS sent.
     */
    @JsonGetter("method")
    public HttpAction getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once SMS sent.
     */
    @JsonSetter("method")
    public void setMethod (HttpAction value) { 
        this.method = value;
        notifyObservers(this.method);
    }
 
    /** GETTER
     * URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
     */
    @JsonGetter("messagestatuscallback")
    public String getMessagestatuscallback ( ) { 
        return this.messagestatuscallback;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
     */
    @JsonSetter("messagestatuscallback")
    public void setMessagestatuscallback (String value) { 
        this.messagestatuscallback = value;
        notifyObservers(this.messagestatuscallback);
    }
 
    /** GETTER
     * Response type format xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type format xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
        notifyObservers(this.responseType);
    }
 
}
 