package com.brokaw.dao;

import java.util.List;

import com.brokaw.model.Account;

public interface AccountDao {
	public void add(Account student);
	public void edit(Account student);
	public void delete(int studentId);
	public Account getStudent(int studentId);
	public List getAllStudent();
}
