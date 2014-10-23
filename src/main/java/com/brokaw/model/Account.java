package com.brokaw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@Column
	//@GeneratedValue(strategy = GenerationType.IDENTITY) //for autonumber
	private int accountId;
	@Column
	private String emailId;
	@Column
	private String socMedia;
	
	
	public Account(){}
	


	public Account(int studentId, String emailId,String socMedia) {
		super();
		this.accountId = studentId;
		this.emailId = emailId;
		this.socMedia=socMedia;
	}



	public int getStudentId() {
		return accountId;
	}


	public void setStudentId(int studentId) {
		this.accountId = studentId;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}



	public String getSocMedia() {
		return socMedia;
	}



	public void setSocMedia(String socMedia) {
		this.socMedia = socMedia;
	}
	
	
	
	
}
