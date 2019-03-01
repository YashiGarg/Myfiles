package com.cg.wallet.ui;

import com.cg.wallet.service.IServiceDao;
import com.cg.wallet.service.ServiceDao;

public class Main {
	static IServiceDao servicedao = new ServiceDao();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		servicedao.createAccount("YAshi", "9720592108", 24590);
		servicedao.showByBalance("9720592108");
		servicedao.find("9720592108");
	}

}
