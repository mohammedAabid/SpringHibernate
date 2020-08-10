package com.foodbook.DAO;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.food.DTO.LoginDTO;
import com.foodbook.DBConfigSettings.HibernateUtility;
import org.hibernate.query.Query;

@Repository
//@Transactional

public class DAO {
	/*
	 * @Autowired private LoginDTO logo;
	 */@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		//System.out.println(sessionFactory.openSession().isConnected());
		return sessionFactory.openSession();
	}
@Transactional
	public void persist(LoginDTO logo) {
		Transaction tx = null;
		getSession().flush();
		getSession().save(logo);
		
		System.out.println("in side the save");
		
		
		
		
	
	}

	public void saveEmployee(LoginDTO logo) {
		persist(logo);
		System.out.println("stored in data base");
		getSession().close();
	}
public DAO() {
	
	System.out.println("DAO initilized");
}
}