Feature: Validate Mutliple Search Products

Background: To set Pre Condition
	Given Open Browser and Navigate to Flipkart

@smoke
Scenario Outline: To Check with Multiple Product
	Then Validate Home Page Title
	When Type "<product>" in SearchBox
	Then Validate "<product>" Displayed
	
Examples:
	|product|
	|Iphone|
	|BlackBerry|
	|Redmi|
	|Oppo|

@regression	
Scenario: Validate Home Page Title
	Then Validate Home Page Title
	And Close the Browser
	
@sanity
Scenario: Validate Searched Prodcut
	When Type Iphone in Textbox
	Then Validate Iphone is Present
	And Close the Browser