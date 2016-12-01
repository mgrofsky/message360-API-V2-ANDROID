/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateViewRecordingInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4688130121295972139L;
    private String recordingSid;
    private String responseType = "json";
    /** GETTER
     * Search Recording sid
     */
    @JsonGetter("RecordingSid")
    public String getRecordingSid ( ) { 
        return this.recordingSid;
    }
    
    /** SETTER
     * Search Recording sid
     */
    @JsonSetter("RecordingSid")
    public void setRecordingSid (String value) { 
        this.recordingSid = value;
        notifyObservers(this.recordingSid);
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
 