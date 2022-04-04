package com.detroitlabs.LearnSomething.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnimalFacts {
    private String name;
    private String latin_name;
    private String animal_type;
    private String lifespan;
    private String habitat;
    private String diet;
    private String geo_range;
    private String image_link;



    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public String getLatin_name() {
        return latin_name;
    }

    @JsonProperty
    public void setLatin_name(String latin_name) {
        this.latin_name = latin_name;
    }

    @JsonProperty
    public String getAnimal_type() {
        return animal_type;
    }

    @JsonProperty
    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    @JsonProperty
    public String getLifespan() {
        return lifespan;
    }

    @JsonProperty
    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    @JsonProperty
    public String getHabitat() {
        return habitat;
    }

    @JsonProperty
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @JsonProperty
    public String getDiet() {
        return diet;
    }

    @JsonProperty
    public void setDiet(String diet) {
        this.diet = diet;
    }

    @JsonProperty
    public String getGeo_range() {
        return geo_range;
    }

    @JsonProperty
    public void setGeo_range(String geo_range) {
        this.geo_range = geo_range;
    }

    @JsonProperty
    public String getImage_link() {
        return image_link;
    }

    @JsonProperty
    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }


}
