package com.detroitlabs.LearnSomething.Controller;

import com.detroitlabs.LearnSomething.Data.VideoRepository;
import com.detroitlabs.LearnSomething.Model.Videos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class VideoController {



    @RequestMapping("/video")
    public String displayVideo(ModelMap modelMap) {
        VideoRepository videoRepository= new VideoRepository();
        String randomURL = videoRepository.getRandomVideo();
        modelMap.put("video", randomURL);
        return "video";
    }
}
