package test.learning;

class A { 
	void hello () {
		System.out.println("hello A");
	}
}
 
class B extends A {
	void hello (String h, int g) {
		//super.hello();
		System.out.println("hello B");
	}
	
}

class C extends B{
	int sum;
	double addition;
	public static void hello(int h, String g) {
		//super.hello();
		System.out.println("hello C");
	}
	
	int sum(int a ,int b) {
		sum = a+b ; 
		return sum;
	}
	
	double sum(double a, double b) {
		addition = a+b;
		return addition;
	}
}



public class methodoverloading_basic {
	
	static int sum(int a ,int b) {
		int sum = a+b ; 
		return sum+1;
	}
	public static void main(String[] args)
	{
		C c = new C();
		c.hello("hi",1);
		c.hello();
		C.hello(1, "hello");
		System.out.println(sum(4,5));
		System.out.println(c.sum(4.5,5.6));
	}

}
