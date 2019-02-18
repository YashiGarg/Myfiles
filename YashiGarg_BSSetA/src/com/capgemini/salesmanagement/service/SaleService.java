package com.capgemini.salesmanagement.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import com.capgemini.salesmanagement.beans.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.exception.ProductCategoryException;
import com.capgemini.salesmanagement.exception.ProductCodeException;
import com.capgemini.salesmanagement.exception.ProductPriceException;
import com.capgemini.salesmanagement.exception.ProductQuantityException;


public class SaleService implements ISaleService{
	ISaleDAO isaledao;
	

	public SaleService(ISaleDAO isaledao2) {
		super();
		this.isaledao=isaledao2;
	}

	public List <Sale> findAll() {
		List<Sale> sales  = isaledao.findAll();
		return sales; 
	}

	@Override
	public boolean validateProductCode(int productId) throws ProductCodeException {
		List<String> validationErrors = new ArrayList<String>(); 
		if(productId!=1001)
		{
			validationErrors.add("NOt valid productid");
		return false;
		}
		if(productId!=1002)
		{
			validationErrors.add("NOt valid productid");
			return false;
		}
		if(productId!=1003)
		{validationErrors.add("NOt valid productid");
		return false;
			
		}
		if(productId!=1004) {
			validationErrors.add("NOt valid productid");
			return false;
		}
		if(!validationErrors.isEmpty())
			throw new ProductCodeException("Not valid productCode");
		return true;
	}

	@Override
	public boolean validateQuantity(int qty) throws ProductQuantityException {
		List<String> validationErrors = new ArrayList<String>(); 
		if(qty>0&&qty<5)
		{
		return true;
		}
		validationErrors.add("Not Valid quantity");
		if(!validationErrors.isEmpty())
			throw new ProductQuantityException("Not valid productCode");
		return false;
	}

	@Override
	public boolean validateProductcat(String prodCat) throws ProductCategoryException {
		List<String> validationErrors = new ArrayList<String>(); 
	  if(prodCat=="Electronics" || prodCat== "Toys")
		{
		  if(prodCat=="Electronics") {
			  if(prodCat=="TV" || prodCat=="Smart Phone" || prodCat=="Video Game")
			  {
				  return true;
			  }
			  
		  }
		  else if (prodCat =="Toys") {
			  if(prodCat=="Soft Toy" || prodCat=="Telescope" || prodCat=="Barbee Doll") {
				  return true;
			  }
		  }
		  else {
			  System.out.println("inavlid");
			  
		  }
		   return true;
		}
	  else {
	
	  
	  validationErrors.add("Not Valid category");
		 if(!validationErrors.isEmpty())
			throw new ProductCategoryException("Not valid productCategory");
	     return false;
	}}
	

	@Override
	public boolean validateProductPrice(float price) throws ProductPriceException {
		List<String> validationErrors = new ArrayList<String>(); 
		if(price<200) {
			
			validationErrors.add("Not Valid category");
			return false;
		}
		if(!validationErrors.isEmpty())
				throw new ProductPriceException("Not valid productPrice");
		
		return false;
	}

	

}
