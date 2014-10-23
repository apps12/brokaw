package com.brokaw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brokaw.dao.AccountDao;
import com.brokaw.model.Account;
import com.brokaw.service.AccountService;
@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao studentDao;
	
	@Transactional
	public void add(Account student) {
		studentDao.add(student);
	}

	@Transactional
	public void edit(Account student) {
		studentDao.edit(student);
	}

	@Transactional
	public void delete(int studentId) {
		studentDao.delete(studentId);
	}

	@Transactional
	public Account getStudent(int studentId) {
		return studentDao.getStudent(studentId);
	}

	@Transactional
	public List getAllStudent() {
		return studentDao.getAllStudent();
	}

}
