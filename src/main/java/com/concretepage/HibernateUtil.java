package com.concretepage;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
     private static SessionFactory sessionFactory ;
     static {
    	 // Configuration Solution 1:
    	Configuration configuration = new Configuration().configure();
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(builder.build());
    	 
    	 // Configuration Solution 2:
//        sessionFactory = new Configuration().configure().buildSessionFactory();
     }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
} 