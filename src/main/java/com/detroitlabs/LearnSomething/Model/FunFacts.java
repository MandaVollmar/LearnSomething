package com.detroitlabs.LearnSomething.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class FunFacts {
    private String fact;
    @JsonProperty
    public String getFact() {
        return fact;
    }
    @JsonProperty
    public void setFact(String fact) {
        this.fact = fact;
    }
}
