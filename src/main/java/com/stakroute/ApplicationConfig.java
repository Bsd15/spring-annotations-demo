package com.stakroute;

import com.stakroute.domain.Actor;
import com.stakroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public Actor actor() {
        return new Actor("Actor 1", "Male", 24);
    }

    @Bean
    public Movie movie() {
        return new Movie(actor());
    }
}
