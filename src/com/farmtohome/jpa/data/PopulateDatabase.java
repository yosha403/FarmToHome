/**
 * File Name: PopulateDatabase.java
 * Author :Yosha Kunnummal
 * Date: 3/12/2020
 *
 */
package com.farmtohome.jpa.data;

import java.util.ArrayList;
import java.util.List;

public class PopulateDatabase {

	private CategoryService categoryService;
	private CustomerService customerService;
	private ProductService productService;
	private OrderHeaderService orderheaderService;
	private OrderDetailsService orderdetailsService;

	private PopulateDatabase() {
		categoryService = new CategoryService();
		customerService = new CustomerService();
		productService = new ProductService();
		orderheaderService = new OrderHeaderService();
		orderdetailsService = new OrderDetailsService();
	}

	public static void main(String[] args) {
		PopulateDatabase pd = new PopulateDatabase();
		pd.run();
	}

	private void run() {
		List<Product> productList = new ArrayList<>();
		List<OrderHeader> orderList = new ArrayList<>();
		List<OrderDetails> detailList = new ArrayList<>();
		List<OrderDetails> dList = new ArrayList<>();
	
		Product p1 = new Product(1, "Tilapia fish", "Tilapia", 5.59, 10, dList);
		Product p2 = new Product(2, "Whole cut chicken", "Whole chicken", 6.59, 9, dList);
		Product p3 = new Product(3, "Meat", "Steak", 3.59, 8, dList);
		Product p4 = new Product(4, "Meat", "Pork", 5.59, 9, dList);
		productService.add(p1);
		productService.add(p2);
		productService.add(p3);
		productService.add(p4);
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);

		Category c1 = new Category(1, "Fish", productList);
		Category c2 = new Category(2, "Chicken", productList);
		Category c3 = new Category(3, "Meat", productList);
		categoryService.add(c1);
		categoryService.add(c2);
		categoryService.add(c3);
		

		
	}

}
