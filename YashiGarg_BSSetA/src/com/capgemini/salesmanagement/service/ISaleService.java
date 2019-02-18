package com.capgemini.salesmanagement.service;

import java.util.HashMap;
import java.util.List;

import com.capgemini.salesmanagement.beans.Sale;
import com.capgemini.salesmanagement.exception.ProductCategoryException;
import com.capgemini.salesmanagement.exception.ProductCodeException;
import com.capgemini.salesmanagement.exception.ProductPriceException;
import com.capgemini.salesmanagement.exception.ProductQuantityException;

public interface ISaleService {

	public boolean validateProductCode(int productId) throws ProductCodeException;
	boolean validateQuantity(int qty) throws ProductQuantityException;
	public boolean validateProductcat(String prodCat) throws ProductCategoryException;
	public boolean validateProductPrice(float price) throws ProductPriceException;
	public List<Sale> findAll();
	
}
