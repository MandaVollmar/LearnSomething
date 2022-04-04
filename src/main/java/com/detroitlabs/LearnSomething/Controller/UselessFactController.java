package com.detroitlabs.LearnSomething.Controller;

import com.detroitlabs.LearnSomething.Data.UselessFacts;
import com.detroitlabs.LearnSomething.Service.UselessFactsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UselessFactController {



    @RequestMapping("/useless")
    public String displayUselessFact(ModelMap modelMap) {
        UselessFacts uselessFact = UselessFactsService.fetchUselessFactsData();
        modelMap.put("uselessFact", uselessFact.getText());
        return "useless";
    }

}
