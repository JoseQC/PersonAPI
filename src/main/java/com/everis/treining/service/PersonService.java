package com.everis.treining.service;

import com.everis.treining.entity.Person;
import com.everis.treining.repository.PersonRepository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  /**
   * Method Comment.
   * 
   */
  @Transactional
  public Person getPersonByDocument(String document) throws Exception {
    return personRepository.findByDocument(document);
  }

  /**
   * Method Comment.
   * 
   */
  @Transactional
  public Person updatePerson(Person person) {
    return personRepository.save(person);
  }

}
