Feature: Card Items
 
  Scenario: 1-	the total cost is correct 
  
    Given Poplar Dresses
    When Add Less Price Dress to Card
    Then Saller Dresses
    Then Add Max Price Dress to Card
	When Women Dresses Displayed
	Then  Add discound Dresses to Card
    Then Check Total Price
  
    