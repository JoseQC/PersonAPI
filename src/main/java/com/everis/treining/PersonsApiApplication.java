package com.everis.treining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@EnableAutoConfiguration
@SpringBootApplication
public class PersonsApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(PersonsApiApplication.class, args);
  }

}
