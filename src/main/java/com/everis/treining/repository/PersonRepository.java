package com.everis.treining.repository;

import com.everis.treining.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

  public Person findByDocument(String document);

}
