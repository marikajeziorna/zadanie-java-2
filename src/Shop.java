public class Shop {
	public static void main(String[] args) {
		Table table1 = new Table();
		table1.material = "wood";
		table1.numberOfLegs = 1;
		table1.shape = "circle";

		Table table2 = new Table();
		table2.material = "glass and steel";
		table2.numberOfLegs = 4;
		table2.shape = "rectangle";

		System.out.println(
				"Specification for the table no.1: \n material: " + table1.material + ", number of legs: " + table1.numberOfLegs + " and table shape: " + table1.shape + ".");
		System.out.println(
				"Specification for the table no.1: \n material: " + table2.material + ", number of legs: " + table2.numberOfLegs + " and table shape: " + table2.shape + ".");
	}
}
