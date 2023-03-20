package selprac;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationsTest {
	
	@BeforeSuite
	//suite> class >methods
	// DB connection- created only once, reports initiliazation
	public void beforeSuite() {
	System.out.println("in before suite");	
		}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("in before test");
	}
	@BeforeClass
	// executed only once
	//Class> methods
	public void beforeClass() {
	System.out.println("in before class");	
		}
	
	@BeforeMethod
	// launch the browser
	public void setUp() {
	System.out.println("in before method");	
	}
	
	//@Test(description = " To check the test 1")
	//@Test(invocationCount = 10, threadPoolSize = 5, timeOut = 3L)

	//threadPoolSize is to run the tests in parallel
	// Test executed 10 times along with the method and class annotations
	// tests //collections of multiple tests
	
	@Test(dependsOnMethods = "iamImportant")
	public void test1() throws InterruptedException {
		//Thread.sleep(5000);
	System.out.println("in test 1");
		
	}
	@Test(groups= {"login","smoke"})
	public void iamImportant() {
		System.out.println("I am important");
	}
	
	@Test(priority = -3)
	// negative prioroty is preferred first
	// tests //collections of multiple tests
	public void test2() {
	System.out.println("in test 2");
		
	}
	
	@AfterMethod
	//close the browser
	
	public void tearDown() {
	System.out.println("in after method");
		
	}
	
	@AfterClass
	// not used frequently
	public void afterClass() {
	System.out.println("in after class");	
	}
	
	@AfterSuite
	// Close the DB connectoin and reports close
	public void afterSuite() {
		System.out.println("in after suite");	
			}
}
