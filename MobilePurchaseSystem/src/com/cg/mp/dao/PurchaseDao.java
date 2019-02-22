package com.cg.mp.dao;

import java.util.ArrayList;
import java.util.LinkedList;

import com.cg.mp.bean.Mobile;
import com.cg.mp.util.MobDetails;

public class PurchaseDao implements IPurchaseDao {
	LinkedList<Mobile> linkedlist = new LinkedList<Mobile>();


	@Override
	public void showByrange(int minprice, int maxprice) {
		linkedlist = new MobDetails().getMobileList();
		ArrayList<String> mobName = new ArrayList<String>();
		ArrayList<Integer> mobStock = new ArrayList<Integer>();
		ArrayList<Double> mobPrice = new ArrayList<Double>();

		for (int i = 0; i < linkedlist.size(); i++) {
			int f = 0;
			if (linkedlist.get(i).getMobilePrice() >= minprice && linkedlist.get(i).getMobilePrice() <= maxprice) {
				mobName.add(linkedlist.get(i).getMobileName());
				mobStock.add(linkedlist.get(i).getStock());
				mobPrice.add(linkedlist.get(i).getMobilePrice());
			}
			if (f == 1) {
				System.out.println("MobileName :" + mobName);
				System.out.println("MobileStock:" + mobStock);
				System.out.println("MobilePrice :" + mobPrice);
			}
		}

	}

	@Override
	public int purchase(int mobileName) {

		return 0;
	}

}
