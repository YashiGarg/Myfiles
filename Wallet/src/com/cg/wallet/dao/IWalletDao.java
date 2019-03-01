package com.cg.wallet.dao;

import com.cg.wallet.bean.Customer;

public interface IWalletDao {
 boolean save(Customer c);
Customer findByPhone(String Phone);
}
