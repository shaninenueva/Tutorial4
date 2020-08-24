package tutorial4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalc {
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testAdd() {
		assertEquals(55, new Calc().Add(20, 35));
	}
	
	@Test
	void testSubtract() {
		assertEquals(15, new Calc().Subtract(20, 5));
	}

}
