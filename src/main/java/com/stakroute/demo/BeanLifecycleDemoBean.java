package com.stakroute.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifecycleDemoBean {
    /**
     * The method is invoked after initializing the bean.
     */
    @PostConstruct
    private void customInit() {
        System.out.println("customInit(): After Initializing bean.");
    }

    /**
     * The method is invoked before destroying the bean.
     */
    @PreDestroy
    private void customDestroy() {
        System.out.println("customDestroy(): Before destroying the bean.");
    }

}
