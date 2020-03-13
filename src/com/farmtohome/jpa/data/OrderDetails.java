/**
 * File Name: OrderDetails.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import java.io.Serializable;
import java.lang.Integer;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderDetails
 *
 */
@Entity
@NamedQueries({
@NamedQuery(query="select d from OrderDetails d",name ="FindAllDetails"),
@NamedQuery(query="delete from OrderDetails d WHERE d.detailId=:id",name="DeleteDetailbyId")
})

public class OrderDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "detail_id")	
	private Integer detailId;	
	
	private Integer quantity;
	@Column(name="line_price")
	private double linePrice;


	public OrderDetails() {
		super();
	}   
	
	
	/**
	 * @param detailId
	 * @param quantity
	 * @param linePrice
	 */
	public OrderDetails(Integer quantity, double linePrice) {
		this();		
		this.setQuantity(quantity);
		this.setLinePrice(linePrice);	
	}
	
	public Integer getDetailId() {
		return this.detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}   	
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}   
	public double getLinePrice() {
		return this.linePrice;
	}

	public void setLinePrice(double linePrice) {
		this.linePrice = linePrice;
	}
	@Override
	public String toString() {
		return "OrderDetails [detailId=" + detailId + ", quantity=" + quantity + ", linePrice=" + linePrice + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((detailId == null) ? 0 : detailId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(linePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof OrderDetails))
			return false;
		OrderDetails other = (OrderDetails) obj;
		if (detailId == null) {
			if (other.detailId != null)
				return false;
		} else if (!detailId.equals(other.detailId))
			return false;
		if (Double.doubleToLongBits(linePrice) != Double.doubleToLongBits(other.linePrice))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}
   
}
