public class Shop {
	public static void main(String[] args) {
		Table table1 = new Table("wood", "circle", 1);

		Table table2 = new Table("glass and steel", "rectangle", 4);

		System.out.println(
				"Specification for the table no.1: \n material: " + table1.material + ", number of legs: " + table1.numberOfLegs + " and table shape: " + table1.shape + ".");
		System.out.println(
				"Specification for the table no.1: \n material: " + table2.material + ", number of legs: " + table2.numberOfLegs + " and table shape: " + table2.shape + ".");
	}
}
