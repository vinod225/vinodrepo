package com.javawebtutor;

import java.util.Date;

import org.hibernate.Session;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		User user = new User();

		user.setUserId(3);
		user.setUsername("Mukesh1");
		user.setCreatedBy("Google1");
		user.setCreatedDate(new Date());

		//session.save(user);
		session.getTransaction().commit();
		
		User user2 = (User) session.
		System.out.println(user2);

	}

}
