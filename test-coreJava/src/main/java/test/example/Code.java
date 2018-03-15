package test.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Code {
	public static char[] findDuplicateString() {
		char k [] = new char[50];
		String s = "java java";
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
		int i = 0;
		for(Character name : m1.keySet()) {
			//int value = m1.get(name);
			if(m1.get(name)>1) {
			//System.out.println(value+" "+name);
			k[i++] = name;
			
			}
	}
		//System.out.println(k);
		return k ;
}
	
	
	public static Set<Integer> Duplicate_list() {
		
		ArrayList <Integer>  li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(1);
		li.add(1);
		li.add(3);
		li.add(2);
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		
		for(int i =0;i<li.size();i++) {
			if(set.contains(li.get(i))) {
				set1.add(li.get(i));
			}else {
				set.add(li.get(i));
			}
			
		}
		//System.out.println(set1);		
		return set1;
	}	
}