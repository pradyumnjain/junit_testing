package junit_testing_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddnumber {

	@Test
	void test() {
		junit_function junit = new junit_function();
		int res = junit.add_num(100, 200);
		assertEquals(300,res);
		
	}

}
