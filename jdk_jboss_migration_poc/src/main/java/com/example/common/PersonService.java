package com.example.common;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    private static final Logger logger = LoggerFactory.getLogger(PersonService.class);

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getAllPersons() {
        logger.info("Fetching all persons");
        return personRepository.findAll();
    }

    public Person savePerson(Person person) {
        logger.info("Saving person: {}", person.getName());
        return personRepository.save(person);
    }
}
