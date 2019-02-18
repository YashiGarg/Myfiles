package com.capgemini.salesmanagement.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.capgemini.salesmanagement.beans.Sale;

public class CollectionUtil {
public static Map<Integer,Sale> sales= new HashMap<Integer,Sale>();
public static  HashMap<Integer,Sale> getColletion(){
	return (HashMap<Integer, Sale>) sales;
	
}
private  Map<Integer, Sale> saleDetails;

public CollectionUtil() {
	
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

}
