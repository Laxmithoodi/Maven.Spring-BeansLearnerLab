package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {


    @Bean(name = "UsaIns")
    public Instructors tcUsaInstructors(){
        return new Instructors(
                new Instructor(01l, "UsaFirst"),
                new Instructor(02l, "UsaSecond"),
                new Instructor(03l, "UsaThird")) ;

    }

    @Bean(name = "UkIns")
    public Instructors tcUkInstructors(){
        return new Instructors(
                new Instructor(101l, "UkFirst"),
                new Instructor(102l, "UkSecond"),
                new Instructor(103l, "UkThird")) ;

    }

    @Bean
    @Primary
    public Instructors instructors(){

        Instructors instructors = new Instructors();
        instructors.addAll(tcUkInstructors());
        instructors.addAll(tcUsaInstructors());
        return instructors;

    }
}
