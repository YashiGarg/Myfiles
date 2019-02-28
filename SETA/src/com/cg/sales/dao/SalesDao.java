package com.cg.sales.dao;

import java.util.HashMap;

import com.cg.sales.bean.Sales;
import com.cg.sales.util.CollectionUtil;

public class SalesDao implements ISalesDao{
CollectionUtil collectionutil=new CollectionUtil();

	@Override
	public HashMap<Integer, Sales> insertdetails(Sales sale) {
		// TODO Auto-generated method stub
		return collectionutil.insertdetails(sale) ;
	}

	@Override
	public Sales getAllDetails(int ProductCode) {
		// TODO Auto-generated method stub
		return collectionutil.getCollection(ProductCode);
	}

}
