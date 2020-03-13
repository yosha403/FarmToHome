/**
 * File Name: Item.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

public class Item {
	private String itemName;
	private double itemPrice;
	private int itemQuantity;

	/**
	 * @param itemName
	 * @param itemPrice
	 * @param itemQuantity	
	 */
	public Item(String itemName, double itemPrice, int itemQuantity) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemQuantity = itemQuantity;
	}	

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the itemPrice
	 */
	public double getItemPrice() {
		return itemPrice;
	}
	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	/**
	 * @return the itemQuantity
	 */
	public int getItemQuantity() {
		return itemQuantity;
	}
	/**
	 * @param itemQuantity the itemQuantity to set
	 */
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}	

}
