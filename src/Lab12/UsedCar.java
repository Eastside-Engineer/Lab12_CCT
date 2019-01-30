package Lab12;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class UsedCar extends Car {
	
	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}
	
	
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}


	NumberFormat twopoints = new DecimalFormat("0.00");

	@Override
	public String toString() {
		return  "Make: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear() + ", Price: $" + twopoints.format(getPrice()) + ", Mileage: " + twopoints.format(mileage);
	}
	
	
}
