package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestModule1 {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	//before class- open browser  , start db connections
	//after class- close browser , release db connections
	//   if your test case is like opening and close browser for every test cases
	    //use open browser in before section and close browser in after section

}
