package selprac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningRightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions builder = new Actions(driver);
		builder.contextClick(rightClick).perform();

	}

}


