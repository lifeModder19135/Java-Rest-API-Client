package org.ntolb.client.model;


/* 
 *Each instance of this class is being used by Hibernate as a value object
 *(instead of an entity) as it depends completely
 *on the corresponding PortalTitleDTO object for meaning
 *
 */

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "price")
@Embeddable
public class PortalPriceDTO {
   
	@Transient
	private BigDecimal listPrice;
	@Column(name="purchase_new")
	private BigDecimal purchaseNew;
	@Column(name="purchase_used")
	private BigDecimal purchaseUsed;
	@Column(name="rent_new")
	private BigDecimal rentNew;
	@Column(name="rent_used")
	private BigDecimal rentUsed;
    @Transient
    private final List<DigitalPriceDTO> digitalPrices = new ArrayList<DigitalPriceDTO>();
    @Transient
    private Boolean usedInStock;
	
    
    public BigDecimal getListPrice() {
		return listPrice;
	}
	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}
	public BigDecimal getPurchaseNew() {
		return purchaseNew;
	}
	public void setPurchaseNew(BigDecimal purchaseNew) {
		this.purchaseNew = purchaseNew;
	}
	public BigDecimal getPurchaseUsed() {
		return purchaseUsed;
	}
	public void setPurchaseUsed(BigDecimal purchaseUsed) {
		this.purchaseUsed = purchaseUsed;
	}
	public BigDecimal getRentNew() {
		return rentNew;
	}
	public void setRentNew(BigDecimal rentNew) {
		this.rentNew = rentNew;
	}
	public BigDecimal getRentUsed() {
		return rentUsed;
	}
	public void setRentUsed(BigDecimal rentUsed) {
		this.rentUsed = rentUsed;
	}
	public Boolean getUsedInStock() {
		return usedInStock;
	}
	public void setUsedInStock(Boolean usedInStock) {
		this.usedInStock = usedInStock;
	}
	public List<DigitalPriceDTO> getDigitalPrices() {
		return digitalPrices;
	}
    
}