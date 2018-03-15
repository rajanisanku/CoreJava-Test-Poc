package test.learning;

import java.util.*;

public class Set_basic {
	public static void main(String[] args) {
		
		int a[] = {1,2,1,3,3,4};
		HashSet<Integer> i = new HashSet<Integer>();
		System.out.println("Integer set");
		for(int j=0;j<a.length;j++) {
			
		i.add(a[j]);
		}
		
		System.out.println(i);
		System.out.println("Character set ");
		HashSet<String> h = new HashSet<String>();
		h.add("bhoomika");
		h.add("gunakshi");
		h.add("gunakshi");
		h.add("Bhoomika");
		
		System.out.println(h);
	}

}
