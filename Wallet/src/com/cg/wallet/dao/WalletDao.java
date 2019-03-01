package com.cg.wallet.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.Set;

import com.cg.wallet.bean.Customer;

public class WalletDao implements IWalletDao {
	Map<String, Customer> map = new HashMap<String, Customer>();

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public boolean save(Customer c) {
		if (map.containsValue(c.getCusPhone())) {
			return false;
		} else {
			map.put(c.getCusPhone(), c);
			return true;
		}

	}

	@Override
	public Customer findByPhone(String Phone) {
		Map<String, Customer> map2 = new HashMap<String, Customer>();
		for (Map.Entry<String, Customer> map1 : map.entrySet()) {
			if (map1.getValue().getCusPhone().equals(Phone))
				map2.put(map1.getKey(), map1.getValue());
			return (Customer) map2;
		}
		return null;

	}
}
