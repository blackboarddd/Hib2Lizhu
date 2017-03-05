package com.concretepage;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class TestMain {
	
  public static void main(String[] args) {
	 Person person = new Person();
	 person.setId(3);
	 person.setName("Xiaozhu");

	 
	 SETS bizhu = new SETS();
	 bizhu.setName("Zhu Bingjie");
	 bizhu.setTitle("Senior SET");
	 bizhu.setYear("5");
//	 bizhu.setId(10);
	 

	 Session session = HibernateUtil.getSessionFactory().openSession();
	 session.beginTransaction();
	 
//	 session.save(person);
//	 session.persist(person);
	 
	 List<Person> personS = session.createQuery(" select p from Person as p").list();
//	 session.save(bizhu);
	 List<SETS> sets = session.createQuery("select c from SETS c" + " where c.id < :MaxID").setParameter("MaxID",100).setFirstResult(0).setMaxResults(2).list();
	 Number count = (Number)session.createQuery("select count(c) from SETS as c").uniqueResult();
	 SQLQuery sqlR = session.createSQLQuery("select * from SET1");
	 List<SETS> sets2 = sqlR.addEntity(SETS.class).list();
	 
	 session.getTransaction().commit();
	 session.close();
	 
	 for(SETS one: sets2){
		 System.out.println(one.getId() +
				 ": " +
				 one.getName() +
				 " !"
				 );
	 }
	 
	 for(Person one: personS){
		 System.out.println(one.getId() +
				 ": " +
				 one.getName() +
				 " !"
				 );
	 }
	 System.out.println("Number of SET is " + count);
	 
  }
} 