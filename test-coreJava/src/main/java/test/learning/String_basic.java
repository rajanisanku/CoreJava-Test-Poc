package test.learning;
import java.lang.StringBuffer;


public class String_basic {
	
public static void Reverse_one(StringBuffer s) {
		System.out.println(" \n \nString Reverse without Reverse Function: :");
		String rev = new String();
		for(int i=s.length()-1; i >=0 ; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);   
	}

	
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("Bhoomika");
		StringBuffer t = new StringBuffer("hello");
		System.out.println("String Reverse Using Reverse Function: ");
		System.out.println(s.reverse());
		
		Reverse_one(t);  //using direct function

	}

		
}

