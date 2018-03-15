package test.example;

class Area{
	public static double circle(double r) {
		System.out.println("In super Class");
		double area = 3.14*r*r;
		return area;
	}
	
	public static int square(int a) {
	//	System.out.println("In super class");
		int area = (a+1)*(a+1);
		return area;
	}
}

class Square extends Area {
	public static int square(int ar) {
		//System.out.println("In Sub Class");
		int area = ar*ar;
		return area;
	}
}
public class overriding_T extends Square {

	public static void main(String[] args) {
	//	circle(4.5);
		//square(4);
		
	}
 
}