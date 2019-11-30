package proone;

public class LaunchClass26 {

	public static void main(String[] args) {

		Class26 c = new Class26("Dog2", "White", 5000);
		System.out.println(c.getName());
		System.out.println(c.getColor());
		System.out.println(c.getCost());

		System.out.println("-------------------------------------------");

		Class26 c2 = new Class26();
		System.out.println(c2.getName());
		System.out.println(c2.getColor());
		System.out.println(c2.getCost());

	}

}
