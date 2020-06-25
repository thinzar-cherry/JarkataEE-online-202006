package com.jdc.online.jpa.entity;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

@Table(name = "student_tbl")
@SequenceGenerator(name = "student_seq")
public class Student implements Serializable {

	public enum Gender{Male,Female};
	   
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "student_seq")
	private int id;
	private String name;
	private Gender gender;
	
	@Temporal(DATE)
	private Date dateOfBirth;
	private String phone;
	
	public SecurityInfo getSecurity() {
		return security;
	}
	public void setSecurity(SecurityInfo security) {
		this.security = security;
	}

	private SecurityInfo security;
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	private String email;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
   
}
