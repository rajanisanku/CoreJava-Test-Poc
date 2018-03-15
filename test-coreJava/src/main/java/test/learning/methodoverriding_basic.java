package test.learning;

class Area{
	double circle(double r) {
		System.out.println("In super Class");
		double area = 3.14*r*r;
		return area;
	}
	
	int square(int a) {
		System.out.println("In super class");
		int area = a*a;
		return area;
	}
}

class Square extends Area {
	int square(int ar) {
		System.out.println("In Sub Class");
		int area = ar*ar;
		return area;
	}
}
public class methodoverriding_basic {
	public static void main(String[] args) {
		Area s = new Square();
		System.out.println("Area of Circle is "+s.circle(4.5));
		System.out.println("Area of Square is "+s.square(4));
	}
	
 
}
