package jUnitTest1Package;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testStrings {

	@Test
	public void test() {
		jUnitTest1Functions junitstring = new jUnitTest1Functions();
		String result = junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject",result);
	}

}
