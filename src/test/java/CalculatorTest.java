import org.junit.Test;

public class CalculatorTest {

	@Test(expected=IllegalArgumentException.class)
	public void testDivisionException() {
		Calculator c = new Calculator();
		int a = 5;
		int b = 0;
		c.divide(a,b);
	}

}
