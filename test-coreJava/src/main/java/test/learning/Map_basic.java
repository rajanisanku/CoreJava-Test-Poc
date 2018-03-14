package test.learning;

import java.util.*;


public class Map_basic {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(3, "Bhoomika");
		map.put(29, "Gunakshi");
		map.put(26, "sumee");
		map.put(3, "ka");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getValue()+ " " + m.getKey());
			
		}
		System.out.println(map.values());
		List<String> l1 = new ArrayList<String>();
		l1.add("Gunakshi");
		System.out.println(l1);
	}
	

}
