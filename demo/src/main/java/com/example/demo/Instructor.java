package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements Teacher {
    public Instructor( ){};


    public Instructor(Long id, String name) {
        super(id, name);
    }


    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);

    }


    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {

        List<Learner> learnerList = new ArrayList<>();
        learners.forEach(learner -> learnerList.add(learner));
        double numberOfHoursPerLearner = numberOfHours / learnerList.size();
        for(Learner learner : learners) {
            teach(learner, numberOfHoursPerLearner);
        }
    }
}
