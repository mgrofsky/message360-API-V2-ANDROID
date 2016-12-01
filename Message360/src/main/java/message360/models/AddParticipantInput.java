/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/01/2016
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AddParticipantInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 5268480400827775483L;
    private String conferencesid;
    private String participantnumber;
    private int tocountrycode;
    private Boolean muted;
    private Boolean deaf;
    private String responseType = "json";
    /** GETTER
     * Unique Conference Sid
     */
    @JsonGetter("conferencesid")
    public String getConferencesid ( ) { 
        return this.conferencesid;
    }
    
    /** SETTER
     * Unique Conference Sid
     */
    @JsonSetter("conferencesid")
    public void setConferencesid (String value) { 
        this.conferencesid = value;
        notifyObservers(this.conferencesid);
    }
 
    /** GETTER
     * Particiant Number
     */
    @JsonGetter("participantnumber")
    public String getParticipantnumber ( ) { 
        return this.participantnumber;
    }
    
    /** SETTER
     * Particiant Number
     */
    @JsonSetter("participantnumber")
    public void setParticipantnumber (String value) { 
        this.participantnumber = value;
        notifyObservers(this.participantnumber);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tocountrycode")
    public int getTocountrycode ( ) { 
        return this.tocountrycode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tocountrycode")
    public void setTocountrycode (int value) { 
        this.tocountrycode = value;
        notifyObservers(this.tocountrycode);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("muted")
    public Boolean getMuted ( ) { 
        return this.muted;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("muted")
    public void setMuted (Boolean value) { 
        this.muted = value;
        notifyObservers(this.muted);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("deaf")
    public Boolean getDeaf ( ) { 
        return this.deaf;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("deaf")
    public void setDeaf (Boolean value) { 
        this.deaf = value;
        notifyObservers(this.deaf);
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
 