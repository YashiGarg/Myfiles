package com.cg.sales.dao;

import java.util.HashMap;

import com.cg.sales.bean.Sales;

public interface ISalesDao {
	public HashMap<Integer,Sales> insertdetails(Sales sale);
	public Sales getAllDetails(int ProductCode);
}
