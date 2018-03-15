import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

import test.example.ArrayListExmple;

public class ArrayListExampleTest {
	

	private static final ArrayList<String> NULL = null;

	@Test
	public void findMax(){  
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i = 0; i<5;i++) {
			l.add(i);
		}
		assertEquals(4,ArrayListExmple.findMax(l));

}
	
	@Test
	public void testString() {
		String s = "Hi";
		String s1 = "Hello";
		assertTrue(s == s1);
	}
	@Test
	public void testList() {
		ArrayList<String> l = new ArrayList<String>(); 
		l.add("hello");
		l.add("java");
		assertEquals(l,ArrayListExmple.list_list());
		assertFalse(l == NULL);
	}
	
	@Test
	public void Reverse() {
		String s ="bhoomika java" ;
		Assert.assertEquals(s, ArrayListExmple.Reverse_one("bhoomika java"));
	}
	
	
}
