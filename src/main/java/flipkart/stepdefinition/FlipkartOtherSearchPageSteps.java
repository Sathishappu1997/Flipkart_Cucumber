package flipkart.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import flipkart.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartOtherSearchPageSteps extends BaseClass {
	
	@Given("Open {string} Browser and Navigate to {string}")
	public void open_browser_and_navigate_to(String browser, String url) {
		openBrowserAndNavigateUrl(browser, url);
	}
	
	@When("Type {string} in Textbox")
	public void type_in_textbox(String product) {
		driver.findElement(By.name("q")).sendKeys(product+Keys.ENTER);
	}
	
	@Then("Validate {string} is Present")
	public void validate_is_present(String product) {
		boolean status = driver.findElement(By.xpath("//span[contains(text(),'results for')]//span[text()='"+product+"']")).isEnabled();
		if(status) {
			System.out.println(product+" Validation is Success");
		}else {
			System.out.println(product+" Validation is not Success");
			throw new RuntimeException();
		}
	}

}
