package com.jmh.primerawebspringboot.service;

import com.jmh.primerawebspringboot.entities.Person;

import java.util.List;

public interface PersonService {

    List<Person> getPersonAll();

    Person findOnePerson(Long id);

    Person createPerson(Person person);

    Person updatePerson(Long id, Person person);

    void  deletePerson(Long id);

    Long countPerson();

}
