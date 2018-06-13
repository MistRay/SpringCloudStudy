package com.example.eventserver.domain;

import java.io.Serializable;

/**
 * @author MistLight
 * @create 2018-04-25 19:46
 * @desc
 */
public class User implements Serializable{
    private String name;
    private  int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
