package com.cg.wallet.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.wallet.bean.Customer;
import com.cg.wallet.bean.Wallet;
import com.cg.wallet.dao.IWalletDao;
import com.cg.wallet.dao.WalletDao;

public class ServiceDao implements IWalletService {
	IWalletDao walletdao = new WalletDao();
	Wallet wallet = new Wallet();

	Map<String, Customer> myMap = new HashMap<String, Customer>();

	
	@Override
	public Customer createAccount(String cusName, String cusPhone, int balance) {
		wallet.setWalBAlance(balance);
		Customer customer = new Customer(cusName, cusPhone, wallet);
		// myMap.put(customer.getCusPhone(), arg1)
		myMap.put(cusPhone, customer);
		// myMap.put(customer.getCusPhone(),);
		
		if (walletdao.save(customer))
			return customer;
		return null;
	}

	
	@Override
	public Customer showByBalance(String cusphone) {
		// Map<String, Customer> myMap3 = new HashMap<String, Customer>();
		for (Map.Entry<String, Customer> myMap2 : myMap.entrySet()) {
			if (myMap2.getValue().getCusPhone().equals(cusphone))
				// myMap3.put(myMap2.getKey(), myMap2.getValue());
				return myMap2.getValue();
		}
		return null;
		// return null;
	}

	
	@Override
	public Customer find(String cusPhone) {
		Customer customer2 = walletdao.findByPhone(cusPhone);
		return customer2;
	}

}
