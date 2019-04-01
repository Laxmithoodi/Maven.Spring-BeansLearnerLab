package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person >implements Iterable <PersonType>{

    List<PersonType> personList ;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People(PersonType...persons){
        this(new ArrayList<>(Arrays.asList(persons)));
    }

    public void add(PersonType person){
        personList.add(person);
    }

    public void remove (PersonType person){
        personList.remove(person);
    }

    public int size(){
       return  personList.size();
    }

    public void clear(){
        personList.clear();
    }



   public void addAll(Iterable<? extends PersonType> iterable) {
        iterable.forEach(person -> personList.add(person));
    }


    public PersonType findById(Long id ){
        return personList.stream()
                        .filter(person -> person.getId().equals(id))
                        .findFirst().get();
    }


    public List<PersonType> findAll(){
        return personList;

    }


    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}

