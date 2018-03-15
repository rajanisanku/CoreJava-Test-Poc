import org.junit.Assert;
import org.junit.Test;
import test.example.MethodOverloading_imp;

public class MethodOverloading_Test {

	@Test
	public void overloading_test() {
		Assert.assertEquals("hello A", MethodOverloading_imp.hello());
		Assert.assertEquals("hello B", MethodOverloading_imp.hello("hello", 4));
	}
  
}
