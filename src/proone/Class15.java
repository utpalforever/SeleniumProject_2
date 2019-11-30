package proone;

public class Class15 {

	public static void main(String[] args) {

		String s1 = "Circle";
		String s2 = new String("Square");
		char c = 'a';
		char d[] = new char[3];
		char f[] = { 'a', 'b', 'd', 'e' };
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
		System.out.println(f[3]);

		String s = new String(f);
		System.out.println(f);

		System.out.println("-----\t-----");

		String f1 = "abcd";
		String f2 = "efgh";
		String f3 = "abcd";
		String f4 = new String("Abcd");
		String f5 = new String("efgh");

		if (f1 == f3)

			System.out.println("refereces are equal");

		else
			System.out.println("refereces are not equal");

		if (f2.equals(f5))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		if (f1.equalsIgnoreCase(f4))
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");

	}

}
