import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeEach
	void run()
	{
		mathUtils = new MathUtils();
	}
	@AfterEach
	void cleanup()
	{
		
	}	
	@Test
	void testAdd() {
		
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual);
		
		
	}
	
	@Test
	void testArea()
	{
		assertEquals(314, mathUtils.area(10));
	}

}
