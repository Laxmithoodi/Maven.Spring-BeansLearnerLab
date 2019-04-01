package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired @Qualifier("students")
    Students currentStudents;


    @Test
    public void TestUsaInstructors(){
        int expected = 4;

        int actual = currentStudents.size();

        Assert.assertEquals(expected, actual);


    }


    @Test
    public  void currentStudentName(){
      Students students = applicationContext.getBean("previousStud", Students.class);
      Assert.assertEquals(students.size(), 4);
    }



}
