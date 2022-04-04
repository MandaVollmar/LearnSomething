package com.detroitlabs.LearnSomething.Service;

import com.detroitlabs.LearnSomething.Data.FunFacts;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FunFactService {
    public static FunFacts fetchFunFactsData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://asli-fun-fact-api.herokuapp.com",
                FunFacts.class);

    }
}
