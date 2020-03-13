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
	
		Product p1 = new Product(1, "Tilapia fillet", "Tilapia fillet", 6.99, 20, dList);
		Product p2 = new Product(2, "Salmon", "Salmon", 5.99, 20, dList);
		Product p3 = new Product(3, "Tuna", "Tuna", 8.99, 20, dList);
		Product p4 = new Product(4, "Chicken drumstick", "Chicken drumstick", 7.99, 20, dList);
		Product p5 = new Product(5, "Whole chicken", "Whole chicken", 5.99, 20, dList);
		Product p6 = new Product(6, "Boneless chicken", "Boneless chicken", 8.99, 20, dList);
		Product p7 = new Product(7, "Pork belly", "Pork belly", 6.99, 20, dList);
		Product p8 = new Product(8, "Beef steak", "Beef steak", 8.99, 20, dList);
		Product p9 = new Product(9, "Beef rib", "Beef rib", 9.99, 20, dList);
		productService.add(p1);
		productService.add(p2);
		productService.add(p3);
		productService.add(p4);
		productService.add(p5);
		productService.add(p6);
		productService.add(p7);
		productService.add(p8);
		productService.add(p9);
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);
		productList.add(p7);
		productList.add(p8);
		productList.add(p9);

		Category c1 = new Category(1, "Fish", productList);
		Category c2 = new Category(2, "Chicken", productList);
		Category c3 = new Category(3, "Meat", productList);
		categoryService.add(c1);
		categoryService.add(c2);
		categoryService.add(c3);	
		
	}
}
