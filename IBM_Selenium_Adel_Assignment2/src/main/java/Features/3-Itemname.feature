Feature: Card Items
 
  Scenario: 3-	The dresses names display correctly in the summary page
  
    Given Poplar Dresses
    When Add Less Price Dress to Card
    Then Saller Dresses
    Then Add Max Price Dress to Card
	When Women Dresses Displayed
	Then  Add discound Dresses to Card
    Then Check item Name
  
    