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
public class TestInstructorConfig {

    @Autowired
    private ApplicationContext applicationContext;
    @Autowired @Qualifier("UsaIns")
    Instructors instructors;


    @Test
    public void usaInstructorsTest() {
        int expected =3;

        int actual = instructors.size();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void ukInstructorsTest(){
        Instructors instructors = applicationContext.getBean("UkIns", Instructors.class);
        Assert.assertEquals(3, instructors.size());

    }


}
