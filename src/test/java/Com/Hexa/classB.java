package Com.Hexa;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

public class classB {
	
	public static WebDriver driver;
	
	
	@org.junit.Before
	public void Before() {
		System.out.println(System.currentTimeMillis());
	}

	
	@AfterClass
    public static void Afterclass() {
		driver.quit();
	}

}
