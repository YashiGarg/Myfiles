package com.cg.mra.dao;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountNotExistException;

//interface is created with abstract methods
public interface AccountDao {
	Account getAccountDetails(String mobileNo) throws AccountNotExistException;

	double rechargeAccount(String mobileNo, double rechargeAmount) throws AccountNotExistException;
}
