package test.learning;

import java.util.*;

public class DuplicateRemove{
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(2);
		l.add(3);
		l.add(1);
		findDuplicate(l);
	
	}
	public static void findDuplicate(List<Integer> l) {
		Set<Integer> i = new HashSet<Integer>(); 
		for(int j = 0;j<l.size();j++) {
			i.add(l.get(j));
	}
		System.out.println(i);
	
	}
}
