package com.detroitlabs.LearnSomething.Controller;

import com.detroitlabs.LearnSomething.Model.UselessFacts;
import com.detroitlabs.LearnSomething.Service.UselessFactsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FactController {

    @RequestMapping("/")
    public String displayFact(ModelMap modelMap) {
        UselessFacts uselessFact = UselessFactsService.fetchUselessFactsData();
        modelMap.put("fact", uselessFact.getText());
        return "useless";
    }
}
