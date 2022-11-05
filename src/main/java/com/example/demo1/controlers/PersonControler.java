package com.example.demo1.controlers;

import com.example.demo1.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/person")
public class PersonControler {

    @GetMapping   // Return List of objects
    public List<Person> getPersons() {
        return List.of(new Person(1,"pppp"));
    }
}
