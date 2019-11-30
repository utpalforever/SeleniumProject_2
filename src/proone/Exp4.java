package proone;

public class Exp4 {

	
	void method1() {
		System.out.println("Started");
		method1();// StackOverflowError
		
	}
}
