package com.spring.learn_spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Course {
    String Id;
    String name;
    String fees;

    public Course(String id, String name, String fees) {
        Id = id;
        this.name = name;
        this.fees = fees;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", fees='" + fees + '\'' +
                '}';
    }

    @SpringBootApplication
    public static class LearnSpringBootApplication {

        public static void main(String[] args) {
            SpringApplication.run(LearnSpringBootApplication.class, args);
        }

    }
}
//logs-info ,debug ,info -main points only give
//debug-it will segrate and check each part deeply