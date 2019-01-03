package org.ntolb.client.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "title")
@Entity
@Table(name="book_data")

public class PortalTitleDTO {

	@Transient
	private String author;
	@Transient
    private String edition;
	@Transient
    private String imageUrl;
	@Id
    private String isbn;
    private String title;
    @Embedded
    private PortalPriceDTO price;
	
    
    public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public PortalPriceDTO getPrice() {
		return price;
	}
	public void setPrice(PortalPriceDTO price) {
		this.price = price;
	}
	
	public String getState() {
		
		PortalPriceDTO PriceObj = new PortalPriceDTO();
		return "isbn: " + isbn + "; title: " + title + "; purchaseNewPrice:" + PriceObj.getPurchaseNew() + "; purchaseUsedPrice:" + PriceObj.getPurchaseUsed() + "; rentNewPrice:" + PriceObj.getRentNew() + "; rentUsedPrice:" + PriceObj.getRentUsed() ;
	     
	}
    
    
	
}
