package com.arpita.surveyform.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.text.*;

@Entity
public class Form {

    
    private @Id @GeneratedValue long id;
    private String firstname;
    private String lastname;
    private String street;
    private String city;
    private String state;
    private String email;
    private Integer zip;
    private Integer phone;
    private String  date;
    private String checkbox;
    private String radiobox;
    private String dropdown;
    

   
   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZip() {
		return zip;
	}

	public void setZip(Integer zip) {
		this.zip = zip;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}

	public String getRadiobox() {
		return radiobox;
	}

	public void setRadiobox(String radiobox) {
		this.radiobox = radiobox;
	}

	public String getDropdown() {
		return dropdown;
	}

	public void setDropdown(String dropdown) {
		this.dropdown = dropdown;
	}
}