package lab4_4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class unihugygyt {

	@Test
	public void testHello() {
		//HelloWorld b = new HelloWorld();
		assertEquals("Hello", HelloWorld.Hello());
	}
	
	@Test
	public void testJoin() {		
		assertEquals("fppmpp",HelloWorld.join("fpp", "mpp"));
	}
	
	@Test
	public void testMultiply() {		
		assertEquals(20,HelloWorld.multiply(4,5));
	}

}
