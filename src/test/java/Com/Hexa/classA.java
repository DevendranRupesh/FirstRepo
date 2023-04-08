package Com.Hexa;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class classA {
	
	@Before
	public void before() {
		System.out.println("Start Time");
	}

	@AfterClass
	public static void Afterclass() {
		System.out.println("Quit Browse");
	}
	
	@org.junit.After
	public void After() {
		System.out.println("End time");
	}
	
	@org.junit.BeforeClass
	public static void BeforeClass() {
		System.out.println("launch Browser");
	}
	
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
}
