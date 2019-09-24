import java.util.ArrayList;
import java.text.DecimalFormat;

public class ShoppingCart {

	private ArrayList<Item> itemList = new ArrayList<Item>();
	DecimalFormat twoDecimals = new DecimalFormat("0.00");

	public ShoppingCart() {

	}

	public void add(Product product, int quantity) {

		itemList.add(new Item(product, quantity));
	}

	public void remove(Product product) {

		for (int i = 0; i < itemList.size(); i++) {
			if (itemList.get(i).getProduct().equals(product)) {
				itemList.remove(i);
			}
		}

	}

	public double getTotalPrice() {

		double sumTotal = 0;
		for (int i = 0; i < itemList.size(); i++) {
			sumTotal += itemList.get(i).getSubtotal();
		}

		return sumTotal;

	}

	public String toString() {

		String print = "";

		if (getTotalPrice() == 0) {

			print = "There are no items in the shopping cart.\n";

		} else {

			print = "=== Shopping cart ===\n";

			for (int i = 0; i < itemList.size(); i++) {
				print += itemList.get(i).getProduct().getId() + ": " + itemList.get(i).getProduct().getName()
						+ ", quantity: " + itemList.get(i).getQuantity() + ", unit price: "
						+ twoDecimals.format(itemList.get(i).getProduct().getPrice()) + ", subtotal: "
						+ twoDecimals.format(itemList.get(i).getSubtotal()) + " \n";

			}

			print += "TOTAL PRICE: " + twoDecimals.format(getTotalPrice()) + " euros\n";
		}

		return print;

	}

}

//for (int i = 0; i < itemList.size(); i++) {
//	print += itemList.get(i).getProduct().getId() + ": " + itemList.get(i).getProduct().getName()
//			+ ", quantity: " + itemList.get(i).getQuantity() + ", unit price: "
//			+ itemList.get(i).getProduct().getPrice() + ", subtotal: " + itemList.get(i).getSubtotal()
//			+ " \n";
//	
////	twoDecimals.format()
//
//}
