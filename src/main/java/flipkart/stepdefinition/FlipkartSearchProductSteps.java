package flipkart.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;

import flipkart.base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSearchProductSteps extends BaseClass {
	
	@When("Type {string} in SearchBox")
	public void type_in_search_box(String product) {
		try {
			driver.findElement(By.name("q")).sendKeys(product+Keys.ENTER);
		}catch(StaleElementReferenceException e) {
			driver.findElement(By.name("q")).sendKeys(product+Keys.ENTER);	
		}
	}
	
	@Then("Validate {string} Displayed")
	public void validate_displayed(String product) {
		boolean status = driver.findElement(By.xpath("//span[contains(text(),'results for')]//span[text()='"+product+"']")).isEnabled();
		if(status) {
			System.out.println(product+" Validation is Success");
		}else {
			System.out.println(product+" Validation is not Success");
			throw new RuntimeException();
		}
	}

}
