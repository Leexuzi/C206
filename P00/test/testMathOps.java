import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class testMathOps {
	
	@Before
	public void setUp() throws Exception {
	}
	int a = 2;
	int b = 4;

	@Test
	public void testSub() {
		int result = a - b;
		int expected = -2;
		assertEquals(result, expected);
		System.out.println("This is the testcase for testSub");
	}
	@Test
	public void testMul() {
		int result = a * b;
		int expected = 8;
		assertEquals(result, expected);
		System.out.println("This is the testcase for testMul");
	}
	@Test
	public void testDiv() {
		int result = a / b;
		int expected = 0;
		assertEquals(result, expected);
		System.out.println("This is the testcase for testDiv");
	}
	
	
	@After
	public void tearDown() throws Exception {
	}
}
