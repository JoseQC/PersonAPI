package com.everis.treining.controller;

import com.everis.treining.entity.Person;
import com.everis.treining.service.PersonService;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "core/")
public class PersonController {

  @Autowired
  private PersonService personService;

  /**
   * Method Comment.
   * 
   * @throws Exception
   * 
   * 
   */
  @GetMapping("/persons")
  public Single<Person> getPerson(@RequestParam("documentNumber") String docuNum) throws Exception {
    return Single.just(personService.getPersonByDocument(docuNum));
  }

  @PutMapping("/update/{document}")
  public void updatePerson(@RequestBody Person person, @PathVariable String document) {
    personService.updatePerson(person);
  }

}
