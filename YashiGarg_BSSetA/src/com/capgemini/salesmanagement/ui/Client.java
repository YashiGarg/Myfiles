package com.capgemini.salesmanagement.ui;

import java.util.List;
import java.util.Scanner;

import com.capgemini.salesmanagement.service.SaleService;
import com.capgemini.salesmanagement.beans.Sale;
import com.capgemini.salesmanagement.service.ISaleService;

public class Client {
 public static void main(String[] args) {
		
		ISaleService service = new SaleService(null);
		Scanner sc = new Scanner(System.in);
		List<Sale> sales = service.findAll();
		
		System.out.println("Enter 1 to See product information");
		
		
		int choice = sc.nextInt();
		

		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter id to see product:");
			int idd = sc.nextInt();
			service.findAll();
		break;
		}
		default:
		{
			System.out.println("Wrong choice");
		}
		}
		
		
		
		
		
		
		
		
		
		
 }
}
