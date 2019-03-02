package com.cg.mra.service;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.AccountNotExistException;

public class AccountServiceImpl implements AccountService {
	AccountDao accountRef;

	public AccountServiceImpl() {
		accountRef = new AccountDaoImpl();
	}

	// Method created for getting account details
	@Override
	public Account getAccountDetails(String mobileNo) throws AccountNotExistException {
		if (validateMobNo(mobileNo)) {
			return accountRef.getAccountDetails(mobileNo);
		} else
			System.err.println("Number should be of 10 digits");
		return null;
	}

	// Method created for recharge the account
	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) throws AccountNotExistException {
		if (validateMobNo(mobileNo)) {
			return accountRef.rechargeAccount(mobileNo, rechargeAmount);
		} else
			System.err.println("Number should be of 10 digits");
		return 0;
	}

	public boolean validateMobNo(String mobNo) {
		//using pattern for validation
		Pattern pat = Pattern.compile("[6-9][0-9]{9}");
		Matcher mat = pat.matcher(mobNo);
		return mat.matches();
	}

}
