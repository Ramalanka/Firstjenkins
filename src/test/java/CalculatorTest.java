import static org.junit.Assert.*;


import org.junit.Test;


public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(5,new Calculator().add(2,3));
	}

}
