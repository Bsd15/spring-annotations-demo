package com.stakroute;

import com.stakroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring - Annotations Tasks
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Movie movie1 = context.getBean("movie", Movie.class);
        System.out.println("Movie 1 : " + movie1.toString());
        Movie movie2 = context.getBean("movie", Movie.class);
        System.out.println("Movie 2: " + movie2.toString());
        System.out.println("Movie1 == Movie2: " + (movie1 == movie2));
        Movie prototypeScopeMovie1 = context.getBean("prototypeScopeMovie", Movie.class);
        Movie prototypeScopeMovie2 = context.getBean("prototypeScopeMovie", Movie.class);
        System.out.println("Movie with Scope as prototype");
        System.out.println("Movie1 == Movie2: " + (prototypeScopeMovie1 == prototypeScopeMovie2));
        context.close();
    }
}
