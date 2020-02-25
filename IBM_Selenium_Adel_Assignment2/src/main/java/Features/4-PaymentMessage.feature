Feature: payment message
 
  Scenario: 4- Assert the successful message appear in the payment after placing your order 
  

    Given Poplar Dresses
    When Add Less Price Dress to Card
    Then Saller Dresses
    Then Add Max Price Dress to Card
	When Women Dresses Displayed
	Then  Add discound Dresses to Card
	Then Register
	Then Selcet Pay methoud
    Then Check Payment message
  
    