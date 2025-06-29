package flipkart.stepdefinition;

import flipkart.base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FlipkartHomePageSteps extends BaseClass {

	String title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
	@Given("Open Browser and Navigate to Flipkart")
	public void open_browser_and_navigate_to_flipkart() {
		openBrowserAndNavigateUrl("Chrome", "https://www.flipkart.com/");
	}

	@Then("Validate Home Page Title")
	public void validate_home_page_title() {
		String title = driver.getTitle();
		if(title.equals(title)) {
			System.out.println("Title Validation is Success");
			System.out.println(title);
		}else {
			System.out.println("Title Validation is not Success");
			System.out.println(title);
			throw new RuntimeException();
		}
	}
	
	@And("Close the Browser")
	public void close_the_browser() {
		closeBrowser();
	}

}
