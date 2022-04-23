package jUnitTest1Package;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testNumbers {

	@Test
	public void test() {
		jUnitTest1Functions junit = new jUnitTest1Functions();
		int result = junit.addNumbers(100, 200);
		assertEquals(300,result);
	}

}
