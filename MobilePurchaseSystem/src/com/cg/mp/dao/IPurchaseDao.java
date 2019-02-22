package com.cg.mp.dao;

public interface IPurchaseDao {
void showByrange(int minprice,int maxprice);
int purchase(int mobileName);
}
