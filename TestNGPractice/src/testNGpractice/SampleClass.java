package testNGpractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleClass {
	
	@BeforeTest
    public void setUp()
    {
       
    }
	
	@Test
    public void test1()
    {
		System.out.println("Test1");
    }

}
