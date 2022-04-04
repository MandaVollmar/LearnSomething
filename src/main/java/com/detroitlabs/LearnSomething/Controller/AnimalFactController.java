package com.detroitlabs.LearnSomething.Controller;

import com.detroitlabs.LearnSomething.Data.AnimalFacts;
import com.detroitlabs.LearnSomething.Service.AnimalFactService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AnimalFactController {

    @RequestMapping("/animal")
    public String displayAnimalFact(ModelMap modelMap) {
        AnimalFacts animalFact = AnimalFactService.fetchAnimalFactsData();
        modelMap.put("animalName", animalFact.getName());
        modelMap.put("animalLatin", animalFact.getLatin_name());
        modelMap.put("animalType", animalFact.getAnimal_type());
        modelMap.put("lifespan", animalFact.getLifespan());
        modelMap.put("habitat", animalFact.getHabitat());
        modelMap.put("diet", animalFact.getDiet());
        modelMap.put("geoRange", animalFact.getGeo_range());
        modelMap.put("image", animalFact.getImage_link());
        return "animal";
    }
}
