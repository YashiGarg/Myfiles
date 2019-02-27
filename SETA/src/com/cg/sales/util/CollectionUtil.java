package com.cg.sales.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.cg.sales.bean.Sales;

public class CollectionUtil {
public static Map<Integer,Sales> sales=new HashMap<Integer,Sales>();
public static Sales getCollection(int ProductCode) {
	for(Map.Entry<Integer, Sales> map:sales.entrySet())
	if(map.getKey().equals(ProductCode)) {
		return sales.get(ProductCode);
	}
return null;
}
public HashMap<Integer,Sales> insertdetails(Sales sale){
	Random random=new Random();
	int k=random.nextInt(1000)+1;
	sales.put(k,sale);
	return (HashMap<Integer, Sales>) sales;
	
}
}
