package com.stakroute;

import com.stakroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring - Annotations Tasks
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Movie movie = context.getBean("movie", Movie.class);
        System.out.println("Movie: " + movie.toString());
        context.close();
    }
}
