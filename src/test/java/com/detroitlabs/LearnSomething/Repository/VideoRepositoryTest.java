package com.detroitlabs.LearnSomething.Repository;

import com.detroitlabs.LearnSomething.Data.VideoRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoRepositoryTest {

    @Test
    void shouldReturnRandomVideo() {
        VideoRepository testUrl = new VideoRepository();

        String result = testUrl.getRandomVideo();

        assertEquals(result, "https://www.youtube.com/embed/cr4ncMR5EVQ");

    }
}