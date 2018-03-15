package test.example;
import java.util.ArrayList;

public class ArrayListExmple {	
	 public static int findMax(ArrayList<Integer> l){
		 int max = l.get(0);
		 for(int i=0;i<l.size();i++) {
			 if(max < l.get(i)) {
				 max = l.get(i);
			 }
		 }
		return max;}  
	 
	 public static String Reverse_one(String string) {
			String rev = new String();
			for(int i=string.length()-1; i >=0 ; i--) {
				rev = rev + string.charAt(i);
			}
			return string;
		}


	 public static ArrayList<String> list_list() {
		 ArrayList<String> s = new ArrayList<String>();
		 s.add("hello");
		 s.add("java");
		 return s;
	 }
}
