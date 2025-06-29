package flipkart.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;

import flipkart.base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSearchPageSteps extends BaseClass {

	@When("Type Iphone in Textbox")
	public void type_iphone_in_textbox() {
		try {
			driver.findElement(By.name("q")).sendKeys("Iphone"+Keys.ENTER);
		}catch(StaleElementReferenceException e) {
			driver.findElement(By.name("q")).sendKeys("Iphone"+Keys.ENTER);	
		}
	}
	@Then("Validate Iphone is Present")
	public void validate_iphone_is_present() {
		boolean status = driver.findElement(By.xpath("//span[contains(text(),'results for')]//span[text()='Iphone']")).isEnabled();
		if(status) {
			System.out.println("Iphone Validation is Success");
		}else {
			System.out.println("Iphone Validation is not Success");
			throw new RuntimeException();
		}
	}

}
