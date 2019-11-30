package proone;

public class ExpLaunch2 {

	public static void main(String[] args) {


		Exp2 e=new Exp2();
		System.out.println(e.a);
		//System.out.println(a); can not access static variable directly
		System.out.println(Exp2.a);
		System.out.println(e);// Garbage value
		
		//method1();can not access static method directly
		Exp2.method1();
		
		e.method2();
		System.out.println(e);//Garbage value	
		

	}

}
