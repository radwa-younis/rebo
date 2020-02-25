Feature: Card Items
 
  Scenario: 2-the items are adding to the shopping cart properly 
  
    Given Poplar Dresses
    When Add Less Price Dress to Card
    Then Saller Dresses
    Then Add Max Price Dress to Card
	When Women Dresses Displayed
	Then  Add discound Dresses to Card
    Then Check Item added to Card
  
    