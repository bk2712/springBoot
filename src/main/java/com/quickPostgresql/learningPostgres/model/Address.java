package com.quickPostgresql.learningPostgres.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import org.hibernate.annotations.Type;

import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address implements Serializable {


    @JsonProperty("location")
//    @Type(type = "jsonb")
    private String location;

    @JsonProperty("zip")
    private String zip;

    @JsonProperty("isRented")
    private boolean isRented;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }


    @Override
    public String toString() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{}"; // Return empty JSON on error
        }
    }

}
