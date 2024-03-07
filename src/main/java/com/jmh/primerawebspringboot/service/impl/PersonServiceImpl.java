package com.jmh.primerawebspringboot.service.impl;

import com.jmh.primerawebspringboot.entities.Person;
import com.jmh.primerawebspringboot.repository.PersonRepository;
import com.jmh.primerawebspringboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Override
    public List<Person> getPersonAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findOnePerson(Long id) {
        Person person = personRepository.findById(id).orElse(null);
        if(person != null){
            return person;
        }
        return null;
    }

    @Override
    public Person updatePerson(Long id, Person person) {
        Person personUpdate = personRepository.findById(id).orElse(null);
        if (personUpdate != null){
            personUpdate.setName(person.getName());
            personUpdate.setAge(person.getAge());
            return personRepository.save(personUpdate);
        }
        return null;

    }

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public Long countPerson() {
        return personRepository.count();
    }
}
