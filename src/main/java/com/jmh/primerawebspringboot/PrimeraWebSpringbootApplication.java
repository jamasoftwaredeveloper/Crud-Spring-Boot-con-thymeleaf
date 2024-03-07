package com.jmh.primerawebspringboot;

import com.jmh.primerawebspringboot.entities.Person;
import com.jmh.primerawebspringboot.repository.PersonRepository;
import com.jmh.primerawebspringboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class PrimeraWebSpringbootApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private PersonService personService;
	public static void main(String[] args)  {
		SpringApplication.run(PrimeraWebSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		/*
			personService.createPerson(new Person(
					5L,
					"Alexander",
					30
			));
			System.out.println("Número de persona de la tabla:" + personService.countPerson());
			List<Person> persons = personService.getPersonAll();
			persons.forEach(p ->  System.out.println("Nombre de la persona: " + p.getName()));
	*/
	}

}
