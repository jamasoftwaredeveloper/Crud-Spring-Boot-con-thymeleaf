package com.jmh.primerawebspringboot.repository;

import com.jmh.primerawebspringboot.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
