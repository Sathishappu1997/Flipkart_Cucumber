Feature: To Validate Flipkart Page

@smoke @regression
Scenario: Validate Home Page Title
	Given Open Browser and Navigate to Flipkart
	Then Validate Home Page Title
	And Close the Browser
	
@sanity
Scenario: Validate Searched Prodcut
	Given Open Browser and Navigate to Flipkart
	When Type Iphone in Textbox
	Then Validate Iphone is Present
	And Close the Browser
	
@regression
Scenario: Validate Other Searched Product
	Given Open "Edge" Browser and Navigate to "https://www.flipkart.com/"
	When Type "BlackBerry" in Textbox
	Then Validate "BlackBerry" is Present
	And Close the Browser
