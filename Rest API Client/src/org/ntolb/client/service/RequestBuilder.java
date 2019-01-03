package org.ntolb.client.service;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.ntolb.client.model.Book;
import org.ntolb.client.model.PortalTitleDTO;


public class RequestBuilder {
	
	//Client client = ClientBuilder.newClient();
	
//	public Book BuildRequest(Client client, String isbn) {
//		
//		WebTarget baseTarget= client.target("https://apps.treeoflifebooks.com/app-rest/portal/v1/6/catalog/title" );
//	    WebTarget queryTarget = baseTarget.queryParam("searchString",isbn);
//	    Book obj = queryTarget.request(MediaType.APPLICATION_JSON).get().readEntity(Book.class);
//		return obj;
//	}
	
	public PortalTitleDTO BuildRequest(Client client, String isbn) {
		
		WebTarget baseTarget= client.target("https://apps.treeoflifebooks.com/app-rest/portal/v1/6/catalog/title" );
	    WebTarget queryTarget = baseTarget.queryParam("searchString",isbn);
	    PortalTitleDTO obj = queryTarget.request(MediaType.APPLICATION_JSON).get().readEntity(PortalTitleDTO.class);
		return obj;
		
	} 

}
