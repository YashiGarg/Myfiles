package com.cg.mra.ui;

import java.util.Scanner;

import com.cg.mra.beans.Account;
import com.cg.mra.exception.AccountNotExistException;
import com.cg.mra.service.AccountService;
import com.cg.mra.service.AccountServiceImpl;

public class MainUI {
	static AccountService accountService = new AccountServiceImpl();// achieving runtime polymorphism
	static Scanner scanner = new Scanner(System.in);

	// showing menu to the user
	public static void main(String[] args) throws AccountNotExistException {

		showMenu();
	}

	public static void showMenu() throws AccountNotExistException {
		while (true) {
			System.out.println("1) Account Balance Enquiry");
			System.out.println("2) Recharge Account");
			System.out.println("3) Exit");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				getAccountBalance();
				break;
			case 2:
				updateBalance();
				break;
			case 3:
				System.out.println("Thank You!");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}

	// for recharging account
	private static void updateBalance() throws AccountNotExistException {
		System.out.println("Enter MobileNo:");
		String mobileNo = scanner.next();

		System.out.println("Enter the Amount");
		double amount = scanner.nextDouble();
		double balance = 0;
		Account a = accountService.getAccountDetails(mobileNo);
		try {
			balance = accountService.rechargeAccount(mobileNo, amount);
		} catch (AccountNotExistException e) {
			System.err.println(mobileNo + " does not exist");
		}
		System.out.println("Your Account Recharged Successfully : ");
		System.out.println("Hello " + a.getCustomerName() + ", Available Balance is: " + balance);

	}

	// getting account details
	private static void getAccountBalance() {
		System.out.println("Enter MobileNo");
		String mobileNo = scanner.next();
		try {
			Account a=accountService.getAccountDetails(mobileNo);
			System.out.println("Your Current Balance is: " +a.getAccountBalance());
		} catch (AccountNotExistException e) {

			System.err.println(mobileNo + " does not exist");
		}
	}

}
