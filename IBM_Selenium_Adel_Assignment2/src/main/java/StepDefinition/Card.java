package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.text.DecimalFormat;
import java.util.stream.Collectors;

import org.apache.commons.math3.util.Precision;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.CardAction;
import Pages.CardPage;
import Pages.Womenpage;
import Utilities.Base;
import Utilities.ExcelUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Card {


	@Then ("^Check Total Price")
	public void CheckPrice() throws Throwable {
		CardAction.MoveClick(CardPage.AddCardButton(Base.driver));
		//.......assert on Total Price....................

		int ExpectPrice= (int) (Base.TotalPrice	+CardAction.GetPrice(CardPage.TotalShipping(Base.driver))) ;

		int ActualPrice=(int) CardAction.GetPrice(CardPage.CardTotalPrice(Base.driver));

		System.out.println(ExpectPrice+"..."+ActualPrice);
		assertEquals(ExpectPrice,ActualPrice);


	}	
	//..............................................................



	// Cucumber anotaion will work if you use runner class and enable before in OnlineShop Class
	@Then ("^Check Item added to Card")
	public void CheckCardItem() throws Throwable {
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) Base.driver;
		 * js.executeScript("window.scrollBy(0,-1000)");
		 */

		//		Base.ScrolltoElement(CardPage.ItemNUM(Base.driver),Base.driver);
		Base.ScrolltoElement(CardPage.ItemNUM(Base.driver),Base.driver);

		int card_itemsNUM = Integer.parseInt(CardPage.ItemNUM(Base.driver).getText());

		assertEquals(card_itemsNUM,Base.ItemNum);


	}



	@Then ("^Check item Name$")

	public void CheckName() throws Throwable {

		CardAction.MoveClick(CardPage.AddCardButton(Base.driver));


		for (String i : CardAction.ItemName(CardPage.CardListName(Base.driver))) {
			CardAction.ExpectedItem.add(i);
		}

		Collections.sort(CardAction.ExpectedItem);	

		Collections.sort(Base.newList);


		for (int i = 0; i < CardAction.ExpectedItem.size(); i++) {

			assertEquals(CardAction.ExpectedItem.get(i).replaceAll("\\s", "")
					,Base.newList.get(i).replaceAll("\\s", ""));

		}	

		
		
	}

	//....................	
	@Then ("^Check item Price$")
	public void CheckItemPrice() throws Throwable {

		CardAction.MoveClick(CardPage.AddCardButton(Base.driver));



		for (Double i : CardAction.ItemPrice(CardPage.CardListPrice(Base.driver))) {
			CardAction.Expectedprice.add(i);
		}

		Collections.sort(CardAction.Expectedprice);	

		Collections.sort(Base.newPriceList);

		
		
		
		
		for (int i = 0; i < CardAction.ExpectedItem.size(); i++) {

			assertEquals(Base.newPriceList.get(i),CardAction.Expectedprice.get(i));

		}


	}



	//...........................

	@Then ("^Register$")
	public void Register() throws Throwable {
		CardAction.MoveClick(CardPage.AddCardButton(Base.driver));

		CardAction.MoveClick(CardPage.ProceedCheckOut1(Base.driver));

		CardAction.CreateAccount();

	}

	
	@Then ("^Assert on user data$")
	public void CheckUserData() throws Throwable {
		
		assertEquals(CardPage.name(Base.driver).getText()
				,ExcelUtil.ReadExcel(4,0, 1)+" "+ExcelUtil.ReadExcel(4,0, 1) );
		

		assertEquals(CardPage.address(Base.driver).getText()
				,ExcelUtil.ReadExcel(4,12, 1) );
		
		assertEquals(CardPage.state(Base.driver).getText()
		,ExcelUtil.ReadExcel(4,14, 1 )+", Arkansas 11311");	

		
		//added by system
	/*	assertEquals(CardPage.city(Base.driver).getText()
				,CardAction.Country);	
		
		*/
		
		assertEquals(CardPage.Mobile(Base.driver).getText()
				,"0100000000000");	
	}
	
	
	
	
	
	
	
	
	
	
	
	@Then ("^Selcet Pay methoud$")
	public void Check() throws Throwable {
		CardAction.Agrement();

		CardAction.CheckPay();
	}

	// Test(priority ... ) will work if you use Testng suit and enable before suite in OnlineShop Class
	@Test(priority = 4 )

	// Cucumber anotaion will work if you use runner class and enable before in OnlineShop Class
	@Then("^Check Payment message$")
	public void Confirm() throws Throwable {

		CardAction.Confirm();
		Assert.assertEquals(ExcelUtil.ReadExcel(9,1, 1),CardPage.OrderCompleleted(Base.driver).getText());

	}

}
