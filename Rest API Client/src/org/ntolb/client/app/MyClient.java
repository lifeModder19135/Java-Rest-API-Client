package org.ntolb.client.app;



import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ntolb.client.model.PortalTitleDTO;
import org.ntolb.client.model.ProductData;
import org.ntolb.client.service.Dao;
import org.ntolb.client.service.RequestBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.ntolb.client.test.TesterService;



public class MyClient {

	public static void main(String[] args) {
		
        /*
         *   To quickly test app functionality, you can run the app using only a small list of titles. 
         *   In order to do this, comment out lines 32 & 36, then uncomment lines 16, 30, 31, & 37. 
         * 
         * */

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Client client = ClientBuilder.newClient();
		RequestBuilder builder = new RequestBuilder();
		
		//TesterService tester = new TesterService();
		//List<String> testlist = tester.getTestlist();
		List<String> isbnList = ProductData.getIsbnList();
		List<PortalTitleDTO> books = new ArrayList<PortalTitleDTO>();
		Dao dao = new Dao();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		for (String isbn:isbnList) {
		//for (String isbn:testlist) {
			 
			int lastindex; 
			
			PortalTitleDTO response = builder.BuildRequest(client,isbn);
			//Book response = builder.BuildRequest(client,isbn);
					
			dao.createToDatabase(session, response); 
			
		    
			books.add(response);
		   
		    lastindex = books.size() - 1;
			System.out.println(lastindex);
			System.out.println(books.get(lastindex).getState());
		}
		
		session.close();
		
		//tester.readListSample(books);
		
		//tester.testRequests(client, "9780787902445");
		client.close();
	

	}

}
