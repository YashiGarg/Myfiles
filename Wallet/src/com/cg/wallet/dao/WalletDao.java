package com.cg.wallet.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
//import java.util.Set;

import com.cg.wallet.bean.Customer;

public class WalletDao implements IWalletDao {
	Map<String, Customer> map = new HashMap<String, Customer>();

	/* (non-Javadoc)
	 * @see com.cg.wallet.dao.IWalletDao#save(com.cg.wallet.bean.Customer)
	 */
	
	@Override
	public boolean save(Customer c) {
		if (map.containsValue(c.getCusPhone())) {
			return false;
		} else {
			map.put(c.getCusPhone(), c);
			return true;
		}

	}

	/* (non-Javadoc)
	 * @see com.cg.wallet.dao.IWalletDao#findByPhone(java.lang.String)
	 */
	@Override
	public Customer findByPhone(String Phone) {
		//Map<String, Customer> map2 = new HashMap<String, Customer>();
		for (Map.Entry<String, Customer> map1 : map.entrySet()) {
			if (map1.getValue().getCusPhone().equals(Phone))
				//map2.put(map1.getKey(), map1.getValue());
			return map1.getValue();
		}
		return null;

	}
}
