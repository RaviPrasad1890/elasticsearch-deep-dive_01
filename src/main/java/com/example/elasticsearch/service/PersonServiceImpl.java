package com.example.elasticsearch.service;

import com.example.elasticsearch.documents.Person;
import com.example.elasticsearch.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public Person findById(String id) {
        return personRepository.findById(id).orElse(null);
    }
}
