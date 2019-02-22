package com.cg.mp.service;


import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Random;
import java.util.regex.Pattern;

import com.cg.mp.bean.Customer;
import com.cg.mp.bean.Mobile;
import com.cg.mp.util.MobDetails;

public class CustomerService implements ICustomerService {
	LinkedList<Mobile> linkedlist = new LinkedList<Mobile>();
	LinkedList<Customer> linkedlist1 = new LinkedList<Customer>();
	Customer customer = new Customer();

	@Override
	public void addCustomerName(String custname) {
		if (Pattern.matches("[A-Z]{1}[a-z]{19}", custname))
			customer.setCusname(custname);
		else
			System.out.println("Name is not Valid");

	}

	@Override
	public void addCustomerMailid(String custmailid) {
		if (Pattern.matches("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b", custmailid))
			customer.setCusmailid(custmailid);
		else
			System.out.println("EmailId is not valid");

	}

	@Override
	public void addCustomerPurchaseid() {
		Random random = new Random();
		customer.setCuspurchaseid(random.nextInt(99) + 1);

	}

	@Override
	public void addCustomerPurchasedate() {
		customer.setPurchaseTime(LocalDateTime.now());

	}

	@Override
	public void addCustomerPhoneno(String custphoneno) {
		if (Pattern.matches("[6789]{1}[0-9]{9}", custphoneno))
			customer.setCusphoneno(custphoneno);
		else
			System.out.println("Invalid PhoneNumber");
	}

	@Override
	public void addCustomerMobileid(String mobilename) {
		linkedlist = new MobDetails().getMobileList();
		int f = 0;
		for (int i = 0; i < linkedlist.size(); i++) {
			if (linkedlist.get(i).getMobileName().equals(mobilename))
				customer.setCusmobileid(linkedlist.get(i).getMobileId());
			f = 1;
		}
		if (f == 0) {
			System.out.println("Name doesnot match");
		}

	}

}
