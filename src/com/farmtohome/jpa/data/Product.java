/**
 * File Name: Product.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity
@NamedQueries({
@NamedQuery(query="select p from Product p",name ="FindAllProducts"),
@NamedQuery(query="delete from Product p WHERE p.productId=:id",name="DeleteProdbyId")
})

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@Column(name="product_id")
	private Integer productId;
	private String name;
	private String description;
	private double price;
	@Column(name="product_stock")
	private Integer productStock;
		
	@OneToMany(targetEntity = OrderDetails.class)
	private List<OrderDetails> dList;

	public Product() {
		super();
	}   
	
	
	/**
	 * @param productId
	 * @param name
	 * @param description
	 * @param price
	 * @param productStock
	 */
	public Product(Integer productId, String name, String description, double price,Integer productStock, List<OrderDetails> dList) {
		this();
		this.setProductId(productId);
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
		this.setProductStock(productStock);
		this.setdList(dList);
	}


	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}    
	public Integer getProductStock() {
		return this.productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}


	/**
	 * @return the dList
	 */
	public List<OrderDetails> getdList() {
		return dList;
	}


	/**
	 * @param dList the dList to set
	 */
	public void setdList(List<OrderDetails> dList) {
		this.dList = dList;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
				+ price + ", productStock=" + productStock + ", dList=" + dList + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dList == null) ? 0 : dList.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productStock == null) ? 0 : productStock.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		if (dList == null) {
			if (other.dList != null)
				return false;
		} else if (!dList.equals(other.dList))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productStock == null) {
			if (other.productStock != null)
				return false;
		} else if (!productStock.equals(other.productStock))
			return false;
		return true;
	}
   
}
