package comm.example;

public class Car {
	private double CarPrice;
	private String CarColor;
	private String Model;

	public double getCarPrice() {
		return CarPrice;
	}
	public void setCarPrice(double carPrice) {
		CarPrice = carPrice;
	}
	public String getCarColor() {
		return CarColor;
	}
	public void setCarColor(String carColor) {
		CarColor = carColor;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	@Override
	public String toString() {
		return "Car Model:" +getModel()+"Car price:" +getCarPrice()+"car color:"+getCarColor();
	}
	
	
}
