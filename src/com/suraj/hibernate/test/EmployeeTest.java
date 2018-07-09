package com.suraj.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suraj.hibernate.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee employee = new Employee();
		employee.setEmployeeId(1001);
		employee.setEmployeeName("suraj");
		employee.setSalary(35000);
		
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		
		session.close();
		factory.close();
		
	}
}
