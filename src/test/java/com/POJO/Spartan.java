package com.POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@JsonIgnoreProperties(value = "id",allowSetters = true)
public class Spartan {

    @JsonProperty("id")
    private int SPARTANid;

    private String name;
    private String gender;
    private long phone;
}
