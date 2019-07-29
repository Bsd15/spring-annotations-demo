package com.stakroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Controller
public class Actor {
    private String name;
    private String gender;
    private int age;

    /**
     * Read values from the properties file while creating bean.
     * @param name Name of Actor
     * @param gender Gender of Actor
     * @param age Age of Actor
     */
    public Actor(@Value("${actor.name}") String name,
                 @Value("${actor.gender}") String gender,
                 @Value("${actor.age}") int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
