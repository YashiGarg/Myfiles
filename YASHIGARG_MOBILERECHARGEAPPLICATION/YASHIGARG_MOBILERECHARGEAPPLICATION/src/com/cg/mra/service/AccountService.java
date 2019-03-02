package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountNotExistException;
//interface with abstract methods
public interface AccountService {
	Account getAccountDetails(String mobileNo) throws AccountNotExistException;

	double rechargeAccount(String mobileNo, double rechargeAmount) throws AccountNotExistException;
}
