package org.ntolb.client.model;

import javax.persistence.Entity;
import java.math.BigDecimal;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/*
 *
 * This class is not used in final build.
 * It is the DTO that I was using before I realized that the structure
 * on the server contained a nested class for the price info. I just 
 * left it in to "show my work".
 *
 */

@XmlRootElement
@Entity
@Table(name="BOOKS")
public class Book {
	
	@Id
	private String isbn;
	private String title;
	private BigDecimal purchaseNewPrice;
	private BigDecimal purchaseUsedPrice;
	private BigDecimal rentNewPrice;
	private BigDecimal rentUsedPrice;
	
	//Used for logging/testing purposes
	@Transient
	private String state;
	
	
	
	
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
	public BigDecimal getPurchaseNewPrice() {
		return purchaseNewPrice;
	}
	public void setPurchaseNewPrice(BigDecimal purchaseNewPrice) {
		this.purchaseNewPrice = purchaseNewPrice;
	}
	public BigDecimal getPurchaseUsedPrice() {
		return purchaseUsedPrice;
	}
	public void setPurchaseUsedPrice(BigDecimal purchaseUsedPrice) {
		this.purchaseUsedPrice = purchaseUsedPrice;
	}
	public BigDecimal getRentNewPrice() {
		return rentNewPrice;
	}
	public void setRentNewPrice(BigDecimal rentNewPrice) {
		this.rentNewPrice = rentNewPrice;
	}
	public String getRentUsedPrice() {
		return rentUsedPrice.toPlainString();
	}
	public void setRentUsedPrice(BigDecimal rentUsedPrice) {
		this.rentUsedPrice = rentUsedPrice;
	}
	
	public String getState() {
		
		return "isbn: " + isbn + "; title: " + title + "; purchaseNewPrice:" + purchaseNewPrice + "; purchaseUsedPrice:" + purchaseUsedPrice + "; rentNewPrice:" + rentNewPrice + "; rentUsedPrice:" + rentUsedPrice ;
	     
	}
	

}
