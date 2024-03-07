package com.jmh.primerawebspringboot.controller;

import com.jmh.primerawebspringboot.entities.Person;
import com.jmh.primerawebspringboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping()
    public String getPersonAll(Model model){
        List<Person> persons = personService.getPersonAll();
        model.addAttribute("personsList", persons);
        return "personList";
    }

    @GetMapping("/new")
    public String formPerson(Model model){
        model.addAttribute("person", new Person());
        model.addAttribute("action", "/persons/new");
        return "formPerson";
    }

    @PostMapping("/new")
    public String savePerson(@ModelAttribute Person person){
        personService.createPerson(person);
        return  "redirect:/persons";
    }

    @GetMapping("/edit/{id}")
    public String editPerson(@PathVariable Long id, @ModelAttribute Person person,Model model){
        model.addAttribute("person", person);
        model.addAttribute("action", "/persons/edit/"+id);
        return "formPerson";
    }
    @PostMapping("/edit/{id}")
    public String updatePerson(@PathVariable Long id, @ModelAttribute Person person){
        personService.updatePerson(id,person);
        return  "redirect:/persons";
    }

    @GetMapping("/show/{id}")
    public String showPerson(@PathVariable Long id, Model model){
        Person person = personService.findOnePerson(id);
        model.addAttribute("person", person);
        return "showPerson";
    }
    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
        return  "redirect:/persons";
    }

}
