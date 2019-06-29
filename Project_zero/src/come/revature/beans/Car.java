package come.revature.beans;

public class Car {
	
	private String model;
	private String make;
	private int yearMade;
	private String color;
	private double currentPrice;
	
	
	
	
	
	
	public Car(String model, String make, int yearMade, String color, double currentPrice) {
		super();
		this.model = model;
		this.make = make;
		this.yearMade = yearMade;
		this.color = color;
		this.currentPrice = currentPrice;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getYearMade() {
		return yearMade;
	}
	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	@Override
	public String toString() {
		return "Car [model= " + model + ", make= " + make + ", yearMade= " + yearMade + ", color= " + color
				+ ", currentPrice= " + currentPrice + "]";
	}

}
