package Com.Hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampleprogram {
	
	public static void main(String[]args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops= new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		
		driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.com/");
		
		
	}

}
