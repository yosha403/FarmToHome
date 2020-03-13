/**
 * File Name: OrderHeader.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.*;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrderHeader
 *
 */

@Entity
@NamedQueries({
@NamedQuery(query="select h from OrderHeader h",name ="FindAllOrders"),
@NamedQuery(query="select d from OrderHeader d WHERE d.customer.customerId=:id",name ="FindByCustId"),
@NamedQuery(query="delete from OrderHeader h WHERE h.orderId=:id",name="DeleteOrderbyId")
})
public class OrderHeader implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")	
	private Integer orderId;
	
	private String address;
	private String city;
	private String state;
	private String country;
	@Column(name="zip_code")
	private String zipCode;
	@Column(name="order_date")
	private Date orderDate;
	@Column(name="order_status")
	private String orderStatus;	
	
	@OneToMany(targetEntity = OrderDetails.class)
	private List<OrderDetails> detailList;
	
	@ManyToOne
	private Customer customer;

	public OrderHeader() {
		super();
	} 	
	/**
	 * @param address
	 * @param city
	 * @param state
	 * @param country
	 * @param zipCode
	 * @param orderDate
	 * @param orderStatus
	 * @param detailList
	 * @param customer
	 */
	public OrderHeader(String address, String city, String state, String country, String zipCode, Date orderDate,
			String orderStatus, List<OrderDetails> detailList, Customer customer) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.detailList = detailList;
		this.customer = customer;
	}
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}   
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}   
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}   
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}   
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}   
	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the detailList
	 */
	public List<OrderDetails> getDetailList() {
		return detailList;
	}


	/**
	 * @param detailList the detailList to set
	 */
	public void setDetailList(List<OrderDetails> detailList) {
		this.detailList = detailList;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderHeader [orderId=" + orderId + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zipCode=" + zipCode + ", orderDate=" + orderDate + ", orderStatus="
				+ orderStatus + ", detailList=" + detailList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((detailList == null) ? 0 : detailList.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof OrderHeader))
			return false;
		OrderHeader other = (OrderHeader) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (detailList == null) {
			if (other.detailList != null)
				return false;
		} else if (!detailList.equals(other.detailList))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}
   
}
