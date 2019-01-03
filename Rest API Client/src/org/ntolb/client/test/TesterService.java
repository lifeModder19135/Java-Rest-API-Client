package org.ntolb.client.test;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.ntolb.client.model.PortalTitleDTO;

public class TesterService {
	
	String testarray[] = {"9780205052769", "9780104954041", "9780020248507", "9780020442608", "9780020868309", "9780023171079"};
	
	List<String> testlist = (List<String>) Arrays.asList(testarray);
	
	
	public String[] getTestarray() {
		return testarray;
	}

	public List<String> getTestlist() {
		return testlist;
	}

	public void testRequests(Client client, String isbn) {
		WebTarget baseTarget= client.target("https://apps.treeoflifebooks.com/app-rest/portal/v1/6/catalog/title" );
	    WebTarget queryTarget = baseTarget.queryParam("searchString",isbn);
	    PortalTitleDTO obj = queryTarget.request(MediaType.APPLICATION_JSON).get().readEntity(PortalTitleDTO.class);
	    		//.getEntity(Book.class);
	    System.out.println(obj.toString());
	    System.out.println(obj.getIsbn());
	    System.out.println(obj.getTitle());
	    System.out.println(obj.getPrice().getPurchaseNew());
	    System.out.println(obj.getPrice().getPurchaseUsed());
	    System.out.println(obj.getPrice().getRentNew());
	    System.out.println(obj.getPrice().getRentUsed());
	    
	}
	
	public void readListSample(List<PortalTitleDTO> list) {
		
		for (int i = 0; i >= testlist.size(); i++) {
			
			System.out.println(list.get(i).getIsbn());
			
		/*	Book book = list.get(i);
			String isbn = book.getIsbn();
			System.out.println(isbn);      */
			
		}
			
	}
	
	
	
	

}
