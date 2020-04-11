package com.arpita.surveyform.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arpita.surveyform.entity.*;
import com.arpita.surveyform.repository.*;
import com.arpita.surveyform.exception.*;


/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class FormController {

     
  private final UserForm repository;

  FormController(UserForm repository) {
    this.repository = repository;
  }

  // Aggregate root

  @GetMapping("/forms")
  List<Form> all() {
    return repository.findAll();
  }

  @PostMapping("/forms")
  Form newForm(@RequestBody Form newForm) {
    return repository.save(newForm);
  }

  // Single item

  @GetMapping("/forms/{id}")
  Form one(@PathVariable Long id) {

    return repository.findById(id)
      .orElseThrow(() -> new FormNotFoundException(id));
  }

  

  }