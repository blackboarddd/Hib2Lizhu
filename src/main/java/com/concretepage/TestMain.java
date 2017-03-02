package com.concretepage;

import org.hibernate.Session;

public class TestMain {
	
  public static void main(String[] args) {
	 Person person = new Person();
	 person.setId(2);
	 person.setName("Huazhu");
	 Session session = HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
	 session.save(person);
	 session.getTransaction().commit();
	 session.close();
	 System.out.println("Done");
  }
} 