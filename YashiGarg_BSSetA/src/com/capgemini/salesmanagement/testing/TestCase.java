package com.capgemini.salesmanagement.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;


import com.capgemini.salesmanagement.beans.*;
import com.capgemini.salesmanagement.exception.*;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;


class TestCase {
  
	ISaleDAO isaledao = new SaleDAO();
	ISaleService isaleservice = new SaleService(isaledao);
	@Before
	public void setUp() throws Exception {
		isaleservice = new SaleService(isaledao);
	}

	public void testAddDonarDetails1() throws ProductCodeException {
		
		assertEquals(1006, isaledao.create(null));
	}
	
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
