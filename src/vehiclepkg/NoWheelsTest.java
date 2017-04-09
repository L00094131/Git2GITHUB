package vehiclepkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class NoWheelsTest {

	@Test
	public void noWheelsCarTest() {
		Car nuCar = new Car();
		nuCar.setNoWheels(5);
		assertEquals(5, nuCar.getNoWheels());
	}

}
