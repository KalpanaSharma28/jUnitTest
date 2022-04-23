package jUnitTest1Package;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testNumbers.class, testStrings.class })
public class AllTests {

}
