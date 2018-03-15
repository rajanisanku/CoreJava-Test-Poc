package test.example;


class A { 
	public static String hello () {
		return "hello A";
	}
}
 
class B extends A {
	public static String hello (String h, int g) {
		
		return "hello B";
	}
	
}

class C extends B{
	static int sum;
	static double addition;
	public static String hello(int h, String g) {
		return "hello C";
	}
	
	public static int sum(int a ,int b) {
		sum = a+b ; 
		return sum;
	}
	
	public static double sum(double a, double b) {
		addition = a+b;
		return addition;
	}
}



public class MethodOverloading_imp extends C {
	
	public static void main(String[] args)
	{
		hello("hi",1);
		hello();
		hello(1, "hello");
		sum(4,5);
		sum(4.5,5.6);
	}

}
