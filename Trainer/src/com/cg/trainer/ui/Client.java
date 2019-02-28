package com.cg.trainer.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.trainer.bean.Trainer;
import com.cg.trainer.exception.NoTrainerWithThisRatingException;
import com.cg.trainer.service.ITrainerService;
import com.cg.trainer.service.TrainerService;

public class Client {
	static Scanner scanner = new Scanner(System.in);
	static ITrainerService trainerservice = new TrainerService();

	public static void main(String[] args) {
		while (true) {
			System.out.println("1) Enter Details");
			System.out.println("2) Display by rating");
			System.out.println("3) Exit");
			System.out.println("Enter Choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addDetails();
				break;
			case 2:
				getDetails();
				break;
			case 3:System.exit(0);break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}

	
	private static void addDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Trainer Name");
		String name = scanner.next();

		System.out.println("Enter Course Name");
		String Cname = scanner.next();

		System.out.println("Enter StartDate");
		String StartDate = scanner.next();

		System.out.println("Enter EndDate");
		String EndDate = scanner.next();

		System.out.println("Enter Rating");
		int rating = scanner.nextInt();

		Trainer trainer = new Trainer(name, Cname, StartDate, EndDate, rating);
		trainerservice.addFeedback(trainer);
	}


	private static void getDetails() {
		// TODO Auto-generated method stub
		Map<Integer, Trainer> map = new HashMap<Integer, Trainer>();
		System.out.println("Enter Rating");
		int rating = scanner.nextInt();
		try {
			System.out.println(trainerservice.getTrainerList(rating));
		} catch (NoTrainerWithThisRatingException e) {
			// TODO Auto-generated catch block
		System.out.println("There is no trainer with this rating ");
		}
		/*for(Map.Entry<Integer,Trainer> a:map.entrySet())
			System.out.println(a.getValue().getTrainerName());*/
	
	}
}
