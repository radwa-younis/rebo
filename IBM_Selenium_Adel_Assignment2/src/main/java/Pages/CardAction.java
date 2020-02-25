package Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utilities.Base;
import Utilities.ExcelUtil;

public class CardAction {

	public static List<String> ExpectedItem = new ArrayList<String>();
	public static List<Double> Expectedprice = new ArrayList<Double>();
	public static String Country;
	
	public static void MoveClick( WebElement Card) throws IOException 
	{

		Base.ScrolltoElement(Card,Base.driver);
		Card.click();

	}


	public static List<String>  ItemName(List<WebElement> list) 

	{		

		List<String> CartItemName = new ArrayList<String>();

		for (WebElement element : list)
		{

			CartItemName.add(element.getText());

		}




		return CartItemName;
	}


	public static List<Double>  ItemPrice(List<WebElement> list) 

	{		

		List<Double> CartItemPrice = new ArrayList<Double>();

		for (WebElement element : list)
		{

	
			CartItemPrice.add(GetPrice(element));

		}




		return CartItemPrice;
	}


	//	public static double  GetPrice( WebElement Pricefield) throws IOException
	public static double  GetPrice(WebElement Pricefield) 

	{

		String PriceS =Pricefield.getText();
		double Price =Double.parseDouble(PriceS.replaceAll("[$]", ""));


		return Price;
	}



	/*
	 * public static void Countinue( WebElement ProceedCheckOut) throws IOException
	 * {
	 * 
	 * // WebElement ProceedCheckOut1=
	 * Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(0,19, 1)));
	 * Base.ScrolltoElement(ProceedCheckOut,Base.driver); ProceedCheckOut.click();
	 * 
	 * }
	 */

	public static void CreateAccount() throws IOException {


		//WebElement EmailCreate=	driver.findElement(By.id("email_create"));

		Base.ScrolltoElement(CardPage.EmailCreate(Base.driver),Base.driver);

		// Generate random integers in range 0 to 999 

		Random rand = new Random(); 
		int rand_int1 = rand.nextInt(1000);
		String RandNum = String.valueOf(rand_int1);

		CardPage.EmailCreate(Base.driver).sendKeys(ExcelUtil.ReadExcel(4,0, 1)+RandNum+RandNum+ExcelUtil.ReadExcel(4,1, 1));

		CardPage.SubmitCreate(Base.driver).click();

		Base.ScrolltoElement(CardPage.MrsRadio(Base.driver),Base.driver);
		CardPage.MrsRadio(Base.driver).click();		

		CardPage.Firstname(Base.driver).sendKeys(ExcelUtil.ReadExcel(4,0, 1));

		CardPage.Lastname(Base.driver).sendKeys(ExcelUtil.ReadExcel(4,0, 1));

		CardPage.Password(Base.driver).sendKeys(ExcelUtil.ReadExcel(4,7, 1));

		CardPage.Day(Base.driver).selectByIndex(13);

		CardPage.Month(Base.driver).selectByIndex(5);

		CardPage.Years(Base.driver).selectByIndex(19);
		//...........................
		Base.ScrolltoElement(CardPage.Address(Base.driver),Base.driver);
		CardPage.Address(Base.driver).sendKeys(ExcelUtil.ReadExcel(4,12, 1));

		CardPage.City(Base.driver).sendKeys(ExcelUtil.ReadExcel(4,14, 1));

		CardPage.State(Base.driver).selectByIndex(4);

		Country=CardPage.CountryAfterSelect(Base.driver).getText();
				
		CardPage.PostCode(Base.driver).sendKeys("11311");

		//	WebElement PhoneMobile=	Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,18, 1)));
		//	PhoneMobile.sendKeys(ExcelUtil.ReadExcel(4,19, 1));
		CardPage.PhoneMobile(Base.driver).sendKeys("0100000000000");

		//	WebElement Alias=	Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,20, 1)));
		Base.ScrolltoElement(CardPage.Alias(Base.driver),Base.driver);
		CardPage.Alias(Base.driver).sendKeys(ExcelUtil.ReadExcel(4,21, 1));

		//	WebElement Register=	Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,22, 1)));
		CardPage.Register(Base.driver).click();
		Base.driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;  



	}


	public static void Agrement() throws IOException 
	{

		//		WebElement ProceedCheckOut2=	Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(5,0, 1)));
		Base.ScrolltoElement(CardPage.ProceedCheckOut2(Base.driver),Base.driver);
		CardPage.ProceedCheckOut2(Base.driver).click();

		//	WebElement Agreement=	Base.driver.findElement(By.id(ExcelUtil.ReadExcel(6,0, 1)));
		CardPage.Agreement(Base.driver).click();

		//	WebElement ProceedCheckOut3=	Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(6,1, 1)));
		Base.ScrolltoElement(CardPage.ProceedCheckOut3(Base.driver),Base.driver);
		CardPage.ProceedCheckOut3(Base.driver).click();

	}



	public static void CheckPay() throws IOException 
	{

		//	WebElement PayByCheck=	Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(7,0, 1)));
		Base.ScrolltoElement(CardPage.PayByCheck(Base.driver),Base.driver);
		CardPage.PayByCheck(Base.driver).click();


	}
	public static void Confirm() throws IOException 
	{

		//	WebElement Confirm=	Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(8,0, 1)));


		MoveClick(CardPage.Confirm(Base.driver));

		Base.driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;  

		//		WebElement OrderCompleleted=	Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(9,0, 1)));

	

	}





}
