package com.detroitlabs.LearnSomething.Service;

import com.detroitlabs.LearnSomething.Model.AnimalFacts;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AnimalFactService {
    public static AnimalFacts fetchAnimalFactsData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://zoo-animal-api.herokuapp.com/animals/rand",
                AnimalFacts.class);
    }
}
