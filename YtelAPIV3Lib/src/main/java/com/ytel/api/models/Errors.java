/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Errors 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 6437312530138661L;
    private List<Error> error;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Error")
    public List<Error> getError ( ) { 
        return this.error;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Error")
    public void setError (List<Error> value) { 
        this.error = value;
        notifyObservers(this.error);
    }
 
}
 