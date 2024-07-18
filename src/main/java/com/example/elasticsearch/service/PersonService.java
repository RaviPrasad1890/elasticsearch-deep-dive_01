package com.example.elasticsearch.service;


import com.example.elasticsearch.documents.Person;

public interface PersonService {

     void save(Person person);

     Person findById(String id);

}
