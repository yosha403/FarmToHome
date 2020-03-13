/**
 * File Name: Category.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity
@NamedQueries({
@NamedQuery(query="select c from Category c",name ="FindAllCategory"),
@NamedQuery(query="delete from Category c WHERE c.categoryId=:id",name="DeleteById")
})

public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="category_id")
	private Integer categoryId;
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(targetEntity = Product.class)
	private List<Product> productList;

	public Category() {
		super();
	}   
	
	
	/**
	 * @param categoryId
	 * @param categoryName
	 */
	public Category(Integer categoryId, String categoryName, List<Product> productList) {
		this();
		this.setCategoryId(categoryId);
		this.setCategoryName(categoryName);
		this.setProductList(productList);
	}


	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}   
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the productList
	 */
	public List<Product> getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}


	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", productList=" + productList
				+ "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		result = prime * result + ((productList == null) ? 0 : productList.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (categoryId == null) {
			if (other.categoryId != null)
				return false;
		} else if (!categoryId.equals(other.categoryId))
			return false;
		if (categoryName == null) {
			if (other.categoryName != null)
				return false;
		} else if (!categoryName.equals(other.categoryName))
			return false;
		if (productList == null) {
			if (other.productList != null)
				return false;
		} else if (!productList.equals(other.productList))
			return false;
		return true;
	}
   
}
