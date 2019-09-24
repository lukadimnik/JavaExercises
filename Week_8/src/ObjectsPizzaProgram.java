public class ObjectsPizzaProgram {

	public static void main(String[] args) {
		Pizza Diavolo = new Pizza("Diavolo", 8.75);
		Pizza Frutti = new Pizza("Frutti al Mare", 9.00);
		Pizza Alla = new Pizza("Alla Pollo", 7.50);

		System.out.println(Diavolo.toString());
		System.out.println(Frutti.toString());
		System.out.println(Alla.toString());

	}

}