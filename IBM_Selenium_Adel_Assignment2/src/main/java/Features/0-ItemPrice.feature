Feature: Card Items
 
  Scenario: 6-	The dresses names with the prices display correctly in the summary page
  
    Given Poplar Dresses
    When Add Less Price Dress to Card
    Then Saller Dresses
    Then Add Max Price Dress to Card
	When Women Dresses Displayed
	Then  Add discound Dresses to Card
    Then Check item Price
  
    