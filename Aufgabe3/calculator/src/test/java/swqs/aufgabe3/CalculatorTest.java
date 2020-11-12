package swqs.aufgabe3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calc;
	
	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		calc = null;
	}

	@Test
	public void testAdd() {
		int x = -5;
		int y = -2;
		
		int actualResult = calc.add(x, y);
		
		assertEquals(-7, actualResult);
	}

	@Test
	public void testSub() {
		int x = 1;
		int y = -5;
		
		int actualResult = calc.sub(x, y);
		
		assertEquals(6, actualResult);
	}

	@Test
	public void testMult() {
		int x = 2;
		int y = -4;
		
		int actualResult = calc.mult(x, y);
		
		assertEquals(-8, actualResult);
	}

	@Test(expected=java.lang.ArithmeticException.class)
	public void testDiv() {
		int x = 2;
		int y = 0;
		
		int actualResult = calc.div(x, y);
	}

}
