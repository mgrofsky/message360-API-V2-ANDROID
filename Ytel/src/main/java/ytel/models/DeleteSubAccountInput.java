/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class DeleteSubAccountInput 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4751952881098525341L;
    private String subAccountSID;
    private MergeNumberStatusEnum mergeNumber = MergeNumberStatusEnum.DELETE;
    private String responseType = "json";
    /** GETTER
     * The SubaccountSid to be deleted
     */
    @JsonGetter("SubAccountSID")
    public String getSubAccountSID ( ) { 
        return this.subAccountSID;
    }
    
    /** SETTER
     * The SubaccountSid to be deleted
     */
    @JsonSetter("SubAccountSID")
    public void setSubAccountSID (String value) { 
        this.subAccountSID = value;
        notifyObservers(this.subAccountSID);
    }
 
    /** GETTER
     * 0 to delete or 1 to merge numbers to parent account.
     */
    @JsonGetter("MergeNumber")
    public MergeNumberStatusEnum getMergeNumber ( ) { 
        return this.mergeNumber;
    }
    
    /** SETTER
     * 0 to delete or 1 to merge numbers to parent account.
     */
    @JsonSetter("MergeNumber")
    public void setMergeNumber (MergeNumberStatusEnum value) { 
        this.mergeNumber = value;
        notifyObservers(this.mergeNumber);
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
 