package lab4_4;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchStrTestCheck {

	@Test
	void testSearch() {
		BinarySearchStr b = new BinarySearchStr();
		assertTrue(b.search("Hello",'o'));
	}
	
}
