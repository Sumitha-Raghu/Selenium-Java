package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {
	
	WebDriver driver = new ChromeDriver();
	//driver.get("https://www.google.com");

	@Given("user tries to login")
	public void user_tries_to_login() {
		System.out.println("User tries to login");
	}

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("User is on the login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters the correct username and password");
	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println("User hits enter");
	}

	@Then("user is navigated to the page")
	public void user_is_navigated_to_the_page() {
		System.out.println("User is navigated to the  page");
	}




}


