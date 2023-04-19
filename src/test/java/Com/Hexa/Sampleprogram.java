package Com.Hexa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampleprogram {
	
	public static void main(String[]args) {
		//change567
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops= new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(ops);
		
		driver.get("https://www.amazon.com/");
		driver.get ("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("greens");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("greens@123");
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
		
		driver.manage().windows().maximize();
			
		driver.get ("https://www.Amazon.com/");
		
		//just a comment
	}

}
