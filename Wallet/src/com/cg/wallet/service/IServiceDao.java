package com.cg.wallet.service;

import com.cg.wallet.bean.Customer;

public interface IServiceDao {
Customer createAccount(String cusName,String cusPhone, int balance);
Customer showByBalance(String cusphone);
Customer find(String cusPhone);
}
