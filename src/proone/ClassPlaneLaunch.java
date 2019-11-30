package proone;

public class ClassPlaneLaunch {

	public static void main(String[] args) {

		ClassPlane cp = new ClassPlane();
		ClassCargoPlane cc = new ClassCargoPlane();
		ClassFighterPlane cf = new ClassFighterPlane();

		System.out.println("---------------------------non polymorphism------------------------------");

		cp.takeOff();
		cp.fly();
		cp.land();

		System.out.println("---------------------------");

		cc.takeOff();
		cc.fly();
		cc.land();
		cc.cargoLand();

		System.out.println("---------------------------");

		cf.takeOff();
		cf.fly();
		cf.land();
		cf.fighterLand();

		System.out.println("---------------------------polymorphism------------------------------");

		cp.takeOff();
		cp.fly();
		cp.land();

		System.out.println("---------------------------");

		cp = cc;
		cp.takeOff();
		cp.fly();
		cp.land();
		// cp.cargoLand(); Parent reference can not access specialized methods DIRECTLY

		System.out.println("---------------------------");
		cp = cf;
		cp.takeOff();
		cp.fly();
		cp.land();
		// cp.fighterLand(); Parent reference can not access specialized methods
		// DIRECTLY

		System.out.println("---------------------------polymorphism with down casting------------------------------");

		cp.takeOff();
		cp.fly();
		cp.land();

		System.out.println("---------------------------");

		cp = cc;
		cp.takeOff();
		cp.fly();
		cp.land();
		((ClassCargoPlane) (cp)).cargoLand();// Down Casting needs to be done because this is specialized method
		// cp.cargoLand(); Parent reference can not access specialized methods DIRECTLY

		System.out.println("---------------------------");
		cp = cf;
		cp.takeOff();
		cp.fly();
		cp.land();
		((ClassFighterPlane) (cp)).fighterLand();// Down Casting needs to be done because this is specialized method
		// cp.fighterLand(); Parent reference can not access specialized methods
		// DIRECTLY
		
		System.out.println("---------------------------polymorphism with Flexibility by creating an Extra Class------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
