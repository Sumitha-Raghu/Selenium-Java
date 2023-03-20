package selprac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFrames {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://dev109273.service-now.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.switchTo().frame("gsft_main");
		 driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	}
}

	
