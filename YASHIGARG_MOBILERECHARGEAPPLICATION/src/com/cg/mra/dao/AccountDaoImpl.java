package com.cg.mra.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountNotExistException;

//AccountDaoImpl implements interface AccountDAo
public class AccountDaoImpl implements AccountDao {
	Map<String, Account> accountEntry;

	public AccountDaoImpl() {
		accountEntry = new HashMap<>();
		accountEntry.put("9010210131", new Account("Prepaid", "Vaishali", 200));
		accountEntry.put("9823920123", new Account("Prepaid", "Megha", 453));
		accountEntry.put("9932012345", new Account("Prepaid", "Vikas", 631));
		// Key is changed as there is duplicate key in question paper
		accountEntry.put("7895764776", new Account("Prepaid", "Anuj", 521));
		// Key is changed as there is duplicate key in question paper
		accountEntry.put("8445489546", new Account("Prepaid", "Tushar", 632));
	}

	// Method for getting all account details
	@Override
	public Account getAccountDetails(String mobileNo) throws AccountNotExistException {
		Account account = accountEntry.get(mobileNo);
		if (account != null)
			return account;
		else
			throw new AccountNotExistException();
	}

	// Method for recharging account
	@Override
	public double rechargeAccount(String mobileNo, double rechargeAmount) throws AccountNotExistException {
		Account account = accountEntry.get(mobileNo);
		if (account == null)
			throw new AccountNotExistException();
		else {
			account.setAccountBalance(account.getAccountBalance() + rechargeAmount);
			return account.getAccountBalance();
		}
	}

}
