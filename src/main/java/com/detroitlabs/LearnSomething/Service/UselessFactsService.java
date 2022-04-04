package com.detroitlabs.LearnSomething.Service;

import com.detroitlabs.LearnSomething.Data.UselessFacts;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UselessFactsService {
    public static UselessFacts fetchUselessFactsData() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://uselessfacts.jsph.pl/random.json?language=en",
                UselessFacts.class);
    }
}
