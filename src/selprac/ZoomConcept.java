package selprac;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String zoom = "document.body.style.zoom = '125%'";
		js.executeScript(zoom);

	}

}
