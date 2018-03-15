import test.example.Code;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;
public class Codetest {

	@Test
	public void findDuplicateString() {
		char arr[] = new char[50];
		arr[0] = 'a';
		arr[1] = 'v';
		arr[2] = 'j';
		Assert.assertArrayEquals(arr, Code.findDuplicateString());
	}
	
	@Test
	public void DuplicateList() {
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		//s1.add(3);
	    Assert.assertEquals(s1, Code.Duplicate_list());
	}	
	
}
