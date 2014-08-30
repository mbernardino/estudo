package com.simple.programmer;

import java.util.Date;
import java.util.Map.Entry;

import org.hibernate.Session;

public class Program {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Session session = HibernateUtilities.getSessionFactory().openSession();
//		persistir
		session.beginTransaction();
		
		User user = new User();
		
		user.setName("teste");
		user.getHistory().add(new UserHistory(new Date(), "Set name to Teste"));
		user.getProteinData().setGoal(250);
		user.getHistory().add(new UserHistory(new Date(), "Set the goal to 250"));
		session.save(user);
		
		session.getTransaction().commit();
		
//		resgatar
		session.beginTransaction();
		
		User loadeUser = (User) session.load(User.class, 1); // também poderia usar session.get(User.class, 1)
		System.out.println(loadeUser);
		
		for(UserHistory history : loadeUser.getHistory()){
			System.out.println(history.getEntryTime().toString() + " " + history.getEntry());
		}
		
//		pode-se alterar um atributo 
		loadeUser.getProteinData().setTotal( loadeUser.getProteinData().getTotal() + 50);
		loadeUser.getHistory().add(new UserHistory(new Date(), "Added 50 protein"));
		System.out.println(loadeUser);
		
		session.getTransaction().commit();
		
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}
}
