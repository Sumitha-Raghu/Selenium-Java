package selprac;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		List<Integer> listOfPrice=new ArrayList<>();
		for (WebElement each : price) {
			String text = each.getText();
			String replaceAll = text.replaceAll(",", "");
			if (!replaceAll.isEmpty()) {
				int parseInt = Integer.parseInt(replaceAll);
				listOfPrice.add(parseInt);
			}
		}
		Collections.sort(listOfPrice);
		System.out.println(listOfPrice);
		System.out.println("The least value :"+listOfPrice.get(0));
		// Taking screenshot of chrome browser
		// File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
       // File destination = new File("./target/screeshots/ss.png");

		//driver.quit();

	}

}
