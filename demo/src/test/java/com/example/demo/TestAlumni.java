package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class TestAlumni {

    Students students;
    Instructors instructors;
    Alumni alumni;



    @Test
    public void TestExecuteBootCamp(){

        students = new Students(new Student(2l, "laxmi"));
        instructors = new Instructors(new Instructor(11l, "inst1"));
        alumni = new Alumni(students, instructors);

        alumni.executeBootcamp();
        students = alumni.getStudents();
        for(Student student :alumni.getStudents()) {
            Assert.assertEquals(1200, student.getTotalStudyTime(),0);
        }
    }
}
