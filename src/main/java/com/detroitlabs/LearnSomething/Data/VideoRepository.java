package com.detroitlabs.LearnSomething.Data;

import com.detroitlabs.LearnSomething.Model.Videos;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class VideoRepository {
    Random random = new Random();
    int indexVideos = random.nextInt();

    public final List<Videos> ALL_VIDEOS = Arrays.asList(
            new Videos("https://www.youtube.com/embed/cr4ncMR5EVQ"),
            new Videos("https://www.youtube.com/embed/FJ3N_2r6R-o"),
            new Videos("https://www.youtube.com/embed/RMoh5hZAaZk"),
            new Videos("https://www.youtube.com/embed/c7Iaz_r2t-g")
    );

    public List<Videos> getALL_VIDEOS() {

        return ALL_VIDEOS;
    }

    public String getRandomVideo() {
        Videos randVideo = ALL_VIDEOS.get(random.nextInt(2));
        return randVideo.getUrl();

    }
}
