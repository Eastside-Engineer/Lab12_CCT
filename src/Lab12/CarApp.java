package Lab12;

import java.util.ArrayList;
import java.util.Scanner;

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

		boolean keeplooping = true;

		System.out.println("Welcome to Grand Circus Motor admin Console!");
		do {
			System.out.printf("%-20s %-10s %-10s %-10s %-10s\n", "      Make", "Model", "Year", " Price", "Mileage"); // formatting
			System.out.printf("%-20s %-10s %-10s %-10s %-10s\n", "    ~~~~~~~~", "~~~~~~", "~~~~~~", "~~~~~~~",
					"~~~~~~~");

			for (UsedCar carz : carList) {
				System.out.printf("%-20s %-10s %-10d $%-10.2f %-10.1f\n", carz.getMake(), carz.getModel(),
						carz.getYear(), carz.getPrice(), carz.getMileage());
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
			
			
			String userAnswer = Validator.getStringMatchingRegex(userInput, "Would you like to buy this car? (y/n): ", "[yYnN]");
			
			userAnswer.equalsIgnoreCase("y");
			
			if (userAnswer.equalsIgnoreCase("y")) {
				carList.remove(enter - 1); 
				System.out.println("Excellent! Our finance department will be in touch shortly.");
			}//else if (keeplooping == false){
//				System.out.println();
//			}
			
//			System.out.println("finished A " + keeplogging);
			
			String again = Validator.getStringMatchingRegex(userInput, "Would you like to look at another car?",
					"[yYnN]");
			
			if (again.equalsIgnoreCase("n")) {
				System.out.println("Have a great day!");
				break;
			}//else if (keeplooping == true){
				
//				System.out.println();
//			}
			
			  //removes the user's choice from the cars list

//			System.out.println("finished B " + keeplogging);
//			System.out.println("again B " + again);
//			System.out.println("finished C " + keeplogging);
//			System.out.println("again C " + again);
			
		}while (keeplooping == true);
		

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
