package com.brokaw.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.brokaw.dao.AccountDao;
import com.brokaw.model.Account;

@Repository
public class AccountDaoImpl implements AccountDao {
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(Account student) {
		session.getCurrentSession().save(student);
	}

	@Override
	public void edit(Account student) {
		session.getCurrentSession().update(student);
	}

	@Override
	public void delete(int studentId) {		
		session.getCurrentSession().delete(getStudent(studentId));
	}

	@Override
	public Account getStudent(int studentId) {
		return (Account)session.getCurrentSession().get(Account.class, studentId);
	}

	@Override
	public List getAllStudent() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

}
