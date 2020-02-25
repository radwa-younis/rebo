package Utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static final String currentDir = System.getProperty("user.dir");

	public static String testDataExcelFileName = "TestData.xlsx";

	public static List<String> ItemAdd = new ArrayList<String>();

	public static List<String> newList = null;

	public static List<Double> PriceAdd =  new ArrayList<Double>();


	public static List<Double> newPriceList = null;
	private static WebElement element = null;

	// Web Util..............................
	public static int ItemNum = 0;

	public static Double TotalPrice = 0.0;

	public static WebDriver driver = null;

	public static WebElement Continue_shopping(WebDriver driver) throws IOException {

		return element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(ExcelUtil.ReadExcel(1,8, 1))));

	}

	// .......................................................

	public static void ScrolltoElement(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	// .................................................
	public static void MouseOver(WebElement element, WebDriver driver) {
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(element).build().perform();

	}

	// ....................................
	public static void DisplayList(List<WebElement> list, String listname) {
		System.out.println(listname);

		for (WebElement element : list) {

			System.out.println(element.getText());

		}

	}

	// ...............................................

	public static void AddItemList(List<String> list, String Item) {

		list.add(Item);
		newList = new ArrayList<String>(new HashSet<String>(list));		

		
	}
//..............................................................
	

	public static void AddPriceList(List<Double> list, Double Item) {

		list.add(Item);
		newPriceList = new ArrayList<Double>(new HashSet<Double>(list));		


	}
	
	
	
}
