package com.simple.programmer;

import org.hibernate.Session;

public class Program {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
//		persistir
		session.beginTransaction();
		
		User user = new User();
		
		user.setName("teste");
		user.setGoal(250);
		
		session.save(user);
		
		session.getTransaction().commit();
		
//		resgatar
		session.beginTransaction();
		
		User loadeUser = (User) session.load(User.class, 1); // também poderia usar session.get(User.class, 1)
		System.out.println(loadeUser);
		
//		pode-se alterar um atributo 
		loadeUser.setTotal( loadeUser.getTotal() + 50);
		
		System.out.println(loadeUser);
		
		session.getTransaction().commit();
		
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}
}
