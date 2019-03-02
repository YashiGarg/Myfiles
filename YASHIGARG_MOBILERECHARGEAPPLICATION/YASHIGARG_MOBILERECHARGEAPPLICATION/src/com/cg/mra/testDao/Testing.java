package com.cg.mra.testDao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;
import com.cg.mra.exception.AccountNotExistException;

public class Testing {
	AccountDao daoRef;
//Run each time before each test case
	@Before
	public void Before() {
		daoRef = new AccountDaoImpl();
		System.out.println("Runs each time before each test case");
	}
//First test case
	@Test(expected = AccountNotExistException.class)
	public void Test1Dao() throws AccountNotExistException {
		daoRef.getAccountDetails("7895764778");

	}
//Second Test Case
	@Test
	public void Test2Dao() throws AccountNotExistException {
		daoRef.getAccountDetails("7895764776");

	}
//Third Test Case 
	@Test
	public void Test3Dao() throws AccountNotExistException {
		daoRef.rechargeAccount("7895764776", 10);
	}
//Forth Test Case
	@Test(expected = AccountNotExistException.class)
	public void Test4Dao() throws AccountNotExistException {
		daoRef.rechargeAccount("7895764778", 10);
	}

}
