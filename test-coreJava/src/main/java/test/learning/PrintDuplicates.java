package test.learning;
import java.util.HashMap;
import java.util.Map;
public class PrintDuplicates {
	
	public static void main(String[] args) {
			String s = "Hi! This is Bhoomika Joshi";
			Map<Character,Integer> m1 = new HashMap<Character,Integer>();
			for(int i = 0; i<=s.length()-1 ;i++) {
				char c = s.charAt(i);				
				if(m1.containsKey(c)) {
					int cnt = m1.get(c);
					m1.put(c,++cnt);
			}
			else {
					m1.put(c,1);
				}
			}
			for(Character name : m1.keySet()) {
				int value = m1.get(name);
				if(value>1) {
				System.out.println(value+" "+name);
				}
}
}
}
