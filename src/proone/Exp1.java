package proone;

public class Exp1 {

	int a;
	int b;
	int c;

	public void method1(int c) {

		a = 9;
		b = 2;

		c = a + b;
		

		System.out.println(c);
		System.out.println(this.c);//instance variable
		System.out.println(c);

	}
	

	public void method2() {

		a = 9;
		b = 2;

		c = a + b;
		int c=23;

		System.out.println(c);
		System.out.println(this.c);
		System.out.println(c);
		

	}

}









