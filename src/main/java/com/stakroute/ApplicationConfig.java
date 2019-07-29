package com.stakroute;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.stakroute")
@PropertySource("classpath:actors.properties")
public class ApplicationConfig {
//    Empty Class body as ComponentScan is used.
}
