package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    private final Students students;
    private final Instructors instructors;


    public Alumni(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootcamp(){
        for(Teacher instructor: instructors){
            instructor.lecture(students,1200);
        }

    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
