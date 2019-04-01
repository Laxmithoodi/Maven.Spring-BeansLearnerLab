package com.example.demo;



import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {


   @Bean(name = "currCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){

    return new Classroom(instructors, students);
    }


    @Bean(name = "prevCohort")
    @DependsOn({"instructors", "students"})
    public Classroom previousCohort(Instructors instructors, Students students ){


        return new Classroom(instructors, students);
    }
}
