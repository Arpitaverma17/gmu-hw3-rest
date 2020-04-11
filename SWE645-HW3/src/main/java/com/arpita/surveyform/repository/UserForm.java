package com.arpita.surveyform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arpita.surveyform.entity.*;;


public interface UserForm extends JpaRepository<Form, Long> {

}
