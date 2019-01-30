package Lab12;

import java.util.ArrayList;
import java.util.Scanner;

import week3.Validator;

public class CarApp {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		ArrayList<UsedCar> carList = new ArrayList<>();

		carList.add(new UsedCar("(1)" + " Chevrolet", "Cruze", 2018, 27743.90, 0));
		carList.add(new UsedCar("(2)" + " Toyota", "Corolla", 2019, 45298.43, 0));
		carList.add(new UsedCar("(3)" + " Tesla", "Model S", 2019, 128649.60, 0));
		carList.add(new UsedCar("(4)" + " Mercedes-Benz", "E350", 2008, 15000.20, 77392.4));
		carList.add(new UsedCar("(5)" + " Ford", "Fiesta", 2011, 1529.80, 123456.7));
		carList.add(new UsedCar("(6)" + " Porsche", "356", 1960, 88724.40, 12197.3));

		do {
		System.out.println("Welcome to Grand Circus Motor admin Console!");
		System.out.printf("%-20s %-10s %-10s %-10s %-10s\n", "      Make", "Model", "Year", " Price", "Mileage");																										// formatting
		System.out.printf("%-20s %-10s %-10s %-10s %-10s\n", "    ~~~~~~~~", "~~~~~~", "~~~~~~", "~~~~~~~", "~~~~~~~");

		for (UsedCar carz : carList) {
			System.out.printf("%-20s %-10s %-10d $%-10.2f %-10.1f\n", carz.getMake(), carz.getModel(), carz.getYear(),
					carz.getPrice(), carz.getMileage());
		}
		System.out.println();
		System.out.println("Which car would you like?");
		int enter = userInput.nextInt();
		int i = 1;
		for (UsedCar numbers : carList) {
			if (i == enter) {
				System.out.println(numbers);
			}
			i++;
		}
		}while (Validator.getStringMatchingRegex(userInput, "Would you like to buy this car? (y/n): ", "[yY]")
				.equalsIgnoreCase("y"));
		
		System.out.println();	
		System.out.println("Excellent! Our finance department will be in touch shortly.");
		
		userInput.close();
		}
}

//		System.out.println("Would you like to buy this car? (y/n): ");
//		String money = userInput.nextLine();
//
//		for (UsedCar buys : carList) {
//			if (money.equalsIgnoreCase("y")) {
//				System.out.println(buys);
//			} else {
//				System.out.println("Excellent! Our finance department will be in touch shortly.");
//			}
//		}


