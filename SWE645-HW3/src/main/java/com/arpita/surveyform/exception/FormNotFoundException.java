package com.arpita.surveyform.exception;

public class FormNotFoundException extends RuntimeException{
	
	  public FormNotFoundException(Long id) {
	    super("Could not find employee " + id);
	  }

}
