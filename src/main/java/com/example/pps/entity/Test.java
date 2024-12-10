package com.example.pps.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Test {
    @JsonProperty("name")
    private String name;
}
