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
		user.getHistory().put("GL123", new UserHistory(new Date(), "Set name to Teste"));
		user.getProteinData().setGoal(250);
		user.getHistory().put("GL124", new UserHistory(new Date(), "Set the goal to 250"));
		session.save(user);
		
		session.getTransaction().commit();
		
//		resgatar
		session.beginTransaction();
		
		User loadeUser = (User) session.load(User.class, 1); // também poderia usar session.get(User.class, 1)
		System.out.println(loadeUser);
		
		for(Entry<String, UserHistory> history : loadeUser.getHistory().entrySet()){
			System.out.println("Key Value: " + history.getKey());
			System.out.println(history.getValue().getEntryTime().toString() + " " + history.getValue().getEntry());
		}
		
//		pode-se alterar um atributo 
		loadeUser.getProteinData().setTotal( loadeUser.getProteinData().getTotal() + 50);
		loadeUser.getHistory().put("GL125", new UserHistory(new Date(), "Added 50 protein"));
		System.out.println(loadeUser);
		
		session.getTransaction().commit();
		
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}
}
