package com.ab.springRestfull.dao;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import com.ab.springRestfull.entity.Employee;

public class EmployeeHibernateDao {

	@Autowired
	SessionFactory sessionFactory;

	@Cacheable(value="employeeCache")
	@SuppressWarnings("unchecked")
	public ArrayList<Employee> fetchingEmployeeDetails(){
		String hql = "from Employee";
		Query query = sessionFactory.openSession().createQuery(hql);
		ArrayList<Employee> employees = (ArrayList<Employee>) query.list();
		return employees;
	}
	
}
