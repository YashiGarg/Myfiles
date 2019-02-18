package com.capgemini.salesmanagement.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.capgemini.salesmanagement.beans.Sale;




public class SaleDAO implements ISaleDAO{
  
	public HashMap<Integer,Sale> insertSalesDetails(Sale sale){
		return null;
	}
	private  Map<Integer, Sale> saleDetails;

    public SaleDAO() {
    	
    saleDetails = new TreeMap<>();

	Sale sale1 = new Sale();
	 sale1.setSaleId(1);
	 sale1.setQuantity(2);
	 sale1.setCategory("Electronics");
	 sale1.setProdCode(1001);
	 sale1.setProductName("iphone");
	 sale1.setQuantity(2);
	 sale1.setLineTotal(700000);
	 
	 
	saleDetails.put(sale1.getSaleId(), sale1);
    
    }

	public List<Sale> findAll() {
		List<Sale> sales= new ArrayList<>(saleDetails.values());
		return sales;
		
		
	}

	@Override
	public boolean create(Sale sale) {
	     saleDetails.put(sale.getProdCode(),sale);
		return true;
	}

	
	
}
