package com.stakroute;

import com.stakroute.domain.Actor;
import com.stakroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationConfig {
    @Bean
    public Actor actor() {
        return new Actor("Actor 1", "Male", 24);
    }

    @Bean
    public Actor actor2() {
        return new Actor("Actor 2", "Female", 29);
    }

    @Bean
    public Actor actor3() {
        return new Actor("Actor 3", "Male", 54);
    }

    @Bean
    public Movie movie() {
        return new Movie(actor());
    }

    @Bean
    @Scope("prototype")
    public Movie prototypeScopeMovie() {
        return new Movie(actor());
    }
}
