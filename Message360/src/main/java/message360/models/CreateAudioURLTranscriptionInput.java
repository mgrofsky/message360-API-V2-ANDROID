/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateAudioURLTranscriptionInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4911636816101019929L;
    private String audioUrl;
    private String responseType = "json";
    /** GETTER
     * Audio url
     */
    @JsonGetter("AudioUrl")
    public String getAudioUrl ( ) { 
        return this.audioUrl;
    }
    
    /** SETTER
     * Audio url
     */
    @JsonSetter("AudioUrl")
    public void setAudioUrl (String value) { 
        this.audioUrl = value;
        notifyObservers(this.audioUrl);
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
 