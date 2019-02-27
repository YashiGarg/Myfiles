package com.cg.sales.service;

import java.util.HashMap;

import com.cg.sales.bean.Sales;

public interface ISalesService {
public HashMap<Integer,Sales> insertdetails(Sales sale);
public boolean ValidateCode(int  prodCode);
public boolean ValidateName(String productName);
public boolean ValidateCategory(String category );
public Sales getAllDetails(int ProductCode);
public boolean ValidateQuantity(int quantity);
public boolean ValidatePrice(float productPrice);
}
