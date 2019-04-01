package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClassroomConfig {

    Students currStudents, prevStudents;
    Classroom currentCohort, prevCohort;
    Instructors instructors;

    @Autowired
    ClassroomConfig classroomConfig;

    @Test
    public void currCohortTest() {

        currStudents = new Students(
                new Student(1l, "laxmi"),
                new Student(2l, "Swapna"));

        prevStudents = new Students(
                new Student(11l, "sophia"),
                new Student(12l, "naline"));


        instructors = new Instructors(new Instructor(11l, "inst1"),
                                        new Instructor(12l, "inst2"));

        currentCohort = classroomConfig.currentCohort(instructors,currStudents);
        prevCohort = classroomConfig.previousCohort(instructors, prevStudents);

        Assert.assertEquals(currentCohort, classroomConfig.currentCohort(instructors, currStudents));
        Assert.assertNotEquals(currentCohort, prevCohort);


    }


    @Test
    public void prevCohortTest() {

        currStudents = new Students(
                new Student(1l, "laxmi"),
                new Student(2l, "Swapna"));

        prevStudents = new Students(
                new Student(11l, "sophia"),
                new Student(12l, "naline"));


        instructors = new Instructors(new Instructor(11l, "inst1"),
                new Instructor(12l, "inst2"));

        currentCohort = classroomConfig.currentCohort(instructors,currStudents);
        prevCohort = classroomConfig.previousCohort(instructors, prevStudents);
        Assert.assertEquals(prevCohort, classroomConfig.previousCohort(instructors, currStudents));
        Assert.assertNotEquals(currentCohort, prevCohort);


    }



}
