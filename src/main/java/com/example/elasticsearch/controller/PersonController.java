package com.example.elasticsearch.controller;

import com.example.elasticsearch.documents.Person;
import com.example.elasticsearch.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
@AllArgsConstructor
public class PersonController {
    private final PersonService service;


    @PostMapping
    public void save(@RequestBody Person person) {
        service.save(person);
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable(value = "id") String id) {
        return service.findById(id);
    }
}
