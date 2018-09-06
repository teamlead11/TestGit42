package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DemoQA {

public static WebDriver driver;


@Given("^The user is in demoqa home page$")
public void the_user_is_in_demoqa_home_page() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\selvamani\\DemoQACucumber\\driver\\chromedriver.exe");
	driver = new ChromeDriver(); 
    driver.get("http://demoqa.com/registration/");
   }
@When("^The user enters fname and lname$")
public void the_user_enters_fname_and_lname() {
   driver.findElement(By.id("name_3_firstname")).sendKeys("Selva");
   driver.findElement(By.id("name_3_lastname")).sendKeys("mani");
	
}
@Then("^The user verifies the entered text in fname and lname field$")
public void the_user_verifies_the_entered_text_in_fname_and_lname_field() {
	Assert.assertEquals("Selva", driver.findElement(By.id("name_3_firstname")).getAttribute("value"));
	Assert.assertEquals("mani", driver.findElement(By.id("name_3_lastname")).getAttribute("value"));
}
}
