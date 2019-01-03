package org.ntolb.client.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.ntolb.client.model.Book;
import org.ntolb.client.model.PortalTitleDTO;



public class Dao {
	
	
	
	public void createToDatabase(SessionFactory sessionFactory, PortalTitleDTO book) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}
	
	
	public void createToDatabase(Session session, PortalTitleDTO book) {
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();	
	}
	
	public Book readFromDatabase(SessionFactory sessionFactory, PortalTitleDTO book) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Book result = session.get(Book.class, book.getIsbn());
		session.getTransaction().commit();
		session.close();
		return result;			
	}
	
	public Book readFromDatabase(Session session, PortalTitleDTO book) {
		session.beginTransaction();
		Book result = session.get(Book.class, book.getIsbn());
		session.getTransaction().commit();
		return result;
	}
	
   //DO NOT USE -- Incomplete
	public void updateDatabase(SessionFactory sessionFactory, PortalTitleDTO book) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.getTransaction().commit();
		session.close();
	}

   //DO NOT USE -- Incomplete
	public void updateDatabase(Session session, PortalTitleDTO book) {
		session.beginTransaction();
		
		session.getTransaction().commit();
	}
	
	public void deleteFromDatabase(SessionFactory sessionFactory, PortalTitleDTO book) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(book);
		session.getTransaction().commit();
		session.close();
	}
	
    public void deleteFromDatabase(Session session, PortalTitleDTO book) {
    	session.beginTransaction();
		session.delete(book);		
		session.getTransaction().commit();
    }
    
}
