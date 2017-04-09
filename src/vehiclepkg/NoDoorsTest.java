package vehiclepkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class NoDoorsTest {

	@Test
	public void getNoDoorstest() {
		int j = Car.getNoDoors();
		assertEquals(1,j);
	}
	
	@Test
	public void setNoDoorstest(){
		Car.setNoDoors(2);
		int j = Car.getNoDoors();
		assertEquals(2, j);
	}

}
