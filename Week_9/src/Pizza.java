import java.text.DecimalFormat;

public class Pizza {
	DecimalFormat twoDecimals = new DecimalFormat("0.00");

	private String name;
	private double price;

	public Pizza(String pizzaName, double pizzaPrice) {
		name = pizzaName;
		price = pizzaPrice;

	}

	public String getName() {
		return name;

	}

	public double getPrice() {
		return price;

	}

	public String toString() {
		return name + " (" + twoDecimals.format(price) + " euros)";

	}
}