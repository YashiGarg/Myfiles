package com.cg.sales.service;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.sales.bean.Sales;
import com.cg.sales.dao.ISalesDao;
import com.cg.sales.dao.SalesDao;

public class SaleService implements ISalesService{
ISalesDao salesdao=(ISalesDao) new SalesDao();
	@Override
	public HashMap<Integer, Sales> insertdetails(Sales sale) {
		// TODO Auto-generated method stub
		return salesdao.insertdetails(sale);
	}

	@Override
	public boolean ValidateCode(int prodCode) {
		// TODO Auto-generated method stub
		String code=Integer.toString(prodCode);
		Pattern pattern=Pattern.compile("[1]{1}[0]{2}[1-4]{1}");
		Matcher match=pattern.matcher(code);
		if(match.matches())
		return true;
		else
			return false;
		
	}

	@Override
	public boolean ValidateName(String productName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ValidateCategory(String category) {
		// TODO Auto-generated method stub
		if(category.equals("Electronics") || category.equals("Toys"))
		return true;
		else
		return false;
	}

	@Override
	public Sales getAllDetails(int ProductCode) {
		// TODO Auto-generated method stub
		return salesdao.getAllDetails(ProductCode);
	}

	@Override
	public boolean ValidateQuantity(int quantity) {
		if(quantity>0 || quantity<5)
		return true;
		else
			return false;
	}

	@Override
	public boolean ValidatePrice(float productPrice) {
		if(productPrice>200f)
		return true;
		else
			return false;
	}

}
