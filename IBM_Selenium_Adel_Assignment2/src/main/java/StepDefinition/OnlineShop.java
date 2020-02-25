package StepDefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.CardAction;
import Pages.CardPage;
import Pages.HomeAction;
import Pages.HomePage;
import Pages.WomenAction;
import Pages.Womenpage;
import Utilities.Base;
import Utilities.ExcelUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class OnlineShop {


	@Before 
	
	public void SetBrowser() throws IOException {

		Base.ItemAdd.clear();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		Base.driver = new ChromeDriver(); Base.driver.manage().window().maximize();
		Base.driver.get(ExcelUtil.ReadExcel(0,0, 1));
		Base.driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;

	}
	@After
	public void TearDown() throws IOException {

		Base.ItemNum = 0;
		Base.TotalPrice =0.0;
		Base.ItemAdd.clear();
		Base.newList.clear();
		CardAction.Expectedprice.clear();
		Base.PriceAdd.clear();
		Base.newPriceList.clear();


		
	}

	// Test(priority ... ) will work if you use Testng suit and enable before suite in OnlineShop Class



}
