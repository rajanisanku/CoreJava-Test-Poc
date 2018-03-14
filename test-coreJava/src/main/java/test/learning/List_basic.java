package test.learning;
import java.util.*;

public class List_basic {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		List<String> s = new ArrayList<String>();
		for(int i = 0; i<5;i++) {
			l.add(i);
		}
		System.out.println("arrayList of integers : "+l);
		System.out.println("arrayList of Strings: ");
		s.add("This");
		s.add("is");
		s.add("List");
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		l.clear();
		System.out.println("arrayList of integers : "+l);
	}

}
