package test.learning;

interface start {
	double getrateSBI ();
	double getRateCITI();
	double getRatePNB();
	/*default void message() { System.out.println("welcome!");}*/
}

public class Interface_basic implements start {

	public double getrateSBI() {
		return 8.5;
	}

	public double getRateCITI() {
		return 9.5;
	}

	
	public double getRatePNB() {
		return 7.5;
	}
	
	public static void main(String[] args) {
		start s = new Interface_basic();
		System.out.println(s.getRateCITI());
		System.out.println(s.getRatePNB());
		System.out.println(s.getrateSBI());
		//s.message();
	}
	

}
