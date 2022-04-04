package com.detroitlabs.LearnSomething.Controller;

import com.detroitlabs.LearnSomething.Data.FunFacts;
import com.detroitlabs.LearnSomething.Service.FunFactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class FunFactController {
    @RequestMapping("/fun")
    public String displayFunFact(ModelMap modelMap) {
        FunFacts funFact = FunFactService.fetchFunFactsData();
        String fact= funFact.getData().getFact();
        modelMap.put("funFact", fact);
        return "fun";
    }
}
