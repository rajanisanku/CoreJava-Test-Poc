import org.junit.Assert;
import org.junit.Test;
import test.example.Test_assert;;
public class Test_Assert_imp {
	
	
	@Test
	 public void print_basic() {
		int arr[] = new int[50];
		for(int i= 0; i<50;i++) {
			arr[i] = i;
		}
		
		Assert.assertArrayEquals(expecteds, actuals);(arr, Test_assert.print_basic());

	}
}
