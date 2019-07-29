package com.stakroute;

import com.stakroute.demo.BeanLifecycleDemoBean;
import com.stakroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring - Annotations Tasks
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BeanLifecycleDemoBean beanLifecycleDemoBean = context.getBean("beanLifecycleDemoBean", BeanLifecycleDemoBean.class);
        context.close();
    }
}
