package com.brokaw.service;

import com.brokaw.model.Account;

public class AccountReg {
	
	int accountId;
	String emailId;
	String socMedia;
	
	
	public int getAccountId() {
		return accountId;
	}


	public void setAccountId(int accountId) {
		this.accountId = accountId;
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


	public Account createAccount() {
        return new Account(getAccountId(),getEmailId(),getSocMedia());
	}

}
