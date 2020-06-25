package com.jdc.online.jpa.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class Registration implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private RegistrationId registrationId;
	private int fees;
	private int paid;
	public RegistrationId getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(RegistrationId registrationId) {
		this.registrationId = registrationId;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getPaid() {
		return paid;
	}
	public void setPaid(int paid) {
		this.paid = paid;
	}
	
}
