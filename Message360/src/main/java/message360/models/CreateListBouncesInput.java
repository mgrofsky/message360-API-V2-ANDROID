/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListBouncesInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5759900127448641864L;
    private String responseType = "json";
    private String offset;
    private String limit;
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
 
    /** GETTER
     * The record to start the list at
     */
    @JsonGetter("offset")
    public String getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * The record to start the list at
     */
    @JsonSetter("offset")
    public void setOffset (String value) { 
        this.offset = value;
        notifyObservers(this.offset);
    }
 
    /** GETTER
     * The maximum number of records to return
     */
    @JsonGetter("limit")
    public String getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * The maximum number of records to return
     */
    @JsonSetter("limit")
    public void setLimit (String value) { 
        this.limit = value;
        notifyObservers(this.limit);
    }
 
}
 