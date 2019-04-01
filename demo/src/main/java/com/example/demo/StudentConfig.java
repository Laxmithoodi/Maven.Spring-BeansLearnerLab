package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        return new Students(
                new Student(01l, "Laxmi"),
                new Student(02l, "Suchi"),
                new Student(03l, "Nirmala"),
                new Student(04l, "Swapna"));
    }


    @Bean(name = "previousStud")
    public Students previousStudents(){

        return new Students(
                new Student(101l, "Rosy"),
                new Student(102l, "Mary"),
                new Student(103l, "Par"),
                new Student(104l, "Sitara"));
    }
}
