import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsPizzaArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();

		pizzaList.add(new Pizza("Diavolo", 8.75));
		pizzaList.add(new Pizza("Frutti al Mare", 9.00));
		pizzaList.add(new Pizza("Alla Pollo", 7.50));

		for (Pizza pizzaObject : pizzaList) {
			System.out.println(pizzaObject.getName() + " (" + twoDecimals.format(pizzaObject.getPrice()) + " euros)");
		}

		input.close();
	}

}