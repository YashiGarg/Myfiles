package com.cg.sales.ui;

import java.time.LocalDate;
import java.util.Scanner;


import com.cg.sales.bean.Sales;
import com.cg.sales.dao.ISalesDao;
import com.cg.sales.dao.SalesDao;
import com.cg.sales.service.ISalesService;
import com.cg.sales.service.SaleService;

public class Customer {
	static Scanner scanner = new Scanner(System.in);

	
	static ISalesService saleservice = new SaleService();
	public static void main(String[] args) {
	 while(true) {
		 System.out.println("Enter product details");
		 System.out.println("Exit");
		 int choice=scanner.nextInt();
		 switch(choice) {
		 case 1: getAllDetails();
		 break;
		 case 2:System.exit(0);
		 break;
		 default:System.out.println("wrong choice");
		 }
	 }

	
}
private static void getAllDetails() {
	// TODO Auto-generated method stub
	System.out.println("Enter The Product Code:");
	int productCode = scanner.nextInt();
	while(!saleservice.ValidateCode(productCode)) {
		System.out.println("product code Invalid :");
		productCode = scanner.nextInt();
		

	}
	 
		System.out.println("Enter The Quantity:");
		int quantity = scanner.nextInt();
		while(!saleservice.ValidateQuantity(quantity)) {
			System.out.println("product quantity Invalid :: Enter Again:");
			quantity = scanner.nextInt();
		}
		
	System.out.println("Enter The Product Category:");
	String category = scanner.next();
	while(!saleservice.ValidateCategory(category)) {
		System.out.println("product category Invalid :");
		category = scanner.next();
	}
	
	System.out.println("Enter The Product Price:");
	float productPrice = scanner.nextFloat();
	while(!saleservice.ValidatePrice(productPrice)) {
		System.out.println("product Price Invalid :: Enter Again:");
		productPrice = scanner.nextFloat();
	}
	
	Sales s1 = new Sales( productCode, productName,  category, LocalDate.now(),  quantity,
			0);
	int lineTotal = (int) (s1.getQuantity()*productPrice);
	s1.setLineTotal(lineTotal);
	saleservice.insertdetails(s1);
	Sales s = saleservice.getAllDetails(productCode);
	System.out.println("Product Name:"+ s.getProductName());
	System.out.println("Product Category:" + s.getCategory());
	System.out.println("Product price:"+ productPrice);
	System.out.println("Product Quantity:"+ s.getQuantity());
	System.out.println("Line Total(Rs):" +s.getLineTotal());
	
}
}
