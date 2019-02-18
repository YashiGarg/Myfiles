package com.capgemini.salesmanagement.dao;

import java.util.HashMap;
import java.util.List;

import com.capgemini.salesmanagement.beans.Sale;

public interface ISaleDAO {
public HashMap<Integer,Sale> insertSalesDetails(Sale sale);


public boolean create(Sale sale);



public List<Sale> findAll();






}
