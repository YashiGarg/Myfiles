package com.cg.mp.util;

import java.util.LinkedList;
import java.util.Random;

import com.cg.mp.bean.Mobile;

public class MobDetails implements Details{

	
	LinkedList<Mobile> linkedlist=new LinkedList<Mobile>();
	Random random=new Random();
	public MobDetails() {
		addMobile();
	}
	@Override
	public void addMobile() {
		String mobNames[]= {"Samsung","Sony","Apple","LG","Redmi"};
		int mobStock[]= {10,12,13,11,9};
		int mobPrice[]= {15000,13000,45000,8000,10000};
		int x=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<mobStock[5];j++) {
				x=random.nextInt(999)+1000;
			linkedlist.add(new Mobile(x,mobNames[j],mobPrice[j],1));
			}
			}
		
	}
	public LinkedList<Mobile> getMobileList() {
		return linkedlist;
	}

	@Override
	public void deleteByid() {
		
		
	}

	@Override
	public int availableMobiles() {
		
		return 0;
	}

}
