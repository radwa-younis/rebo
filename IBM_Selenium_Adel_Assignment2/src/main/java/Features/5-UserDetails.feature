Feature: Card Items

  Scenario: 5- The all info of your Adress are correct
  

    Given Poplar Dresses
    When Add Less Price Dress to Card
    Then Saller Dresses
    Then Add Max Price Dress to Card
	When Women Dresses Displayed
	Then  Add discound Dresses to Card
	Then Register
	Then Assert on user data
  
    