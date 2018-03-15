package test.learning;

import java.util.*;

public class DuplicateInList {
	public static void main(String[] args)
	{
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
	System.out.println(set1);
}
}