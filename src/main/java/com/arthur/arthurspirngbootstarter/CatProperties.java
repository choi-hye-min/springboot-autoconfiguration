package com.arthur.arthurspirngbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("cat")
public class CatProperties {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
