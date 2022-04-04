package com.detroitlabs.LearnSomething.Repository;

import com.detroitlabs.LearnSomething.Data.VideoRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoRepositoryTest {

    @Test
    void shouldReturnRandomVideo() {
        VideoRepository testUrl = new VideoRepository();

        String result = testUrl.getRandomVideo("https://www.youtube.com/embed/5TTOE9QPY_4");

        assertEquals(result, "https://www.youtube.com/embed/5TTOE9QPY_4");

    }
}