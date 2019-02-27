package com.cg.sales.ui;

import java.util.Scanner;

import com.cg.sales.bean.Sales;
import com.cg.sales.dao.ISalesDao;
import com.cg.sales.dao.SalesDao;
import com.cg.sales.service.ISalesService;
import com.cg.sales.service.SaleService;

public class Customer {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 ISalesService saleservice = new SaleService();
	  Sales sale;
	 while(true) {
		 System.out.println("Enter product details");
		 System.out.println("Exit");
		 int choice=scanner.nextInt();
		 switch(choice) {
		 case 1: getAllDetails();
		 }
	 
	 
	 }
	 
}
}
