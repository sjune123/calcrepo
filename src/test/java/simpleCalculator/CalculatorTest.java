package simpleCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(10, 20);
		assertEquals(30, calc.getResult());
	}
	@Test
	public void testMulti(){
		Calculator calc=new Calculator();
		calc.multi(10, 20);
		assertEquals(200,calc.getResult());
	}
	@Test
	public void testSub() {
		Calculator calc = new Calculator();
		calc.sub(10, 20);
		assertEquals(-10, calc.getResult());
	}
public void testSquare(){//내가쓴테스트
	Calculator calc = new Calculator();
	calc.square(10);
	assertEquals(100, calc.getResult());
	}
}
