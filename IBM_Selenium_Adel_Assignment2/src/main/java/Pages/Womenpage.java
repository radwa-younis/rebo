package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.Base;
import Utilities.ExcelUtil;

public class Womenpage {


	private static WebElement element = null;
	static List<WebElement> elementlist=null;


	public static WebElement WomenTap(WebDriver driver) throws IOException{
		return element = driver.findElement(By.cssSelector(ExcelUtil.ReadExcel(2,0, 1)));
	}

	public static WebElement DressesButton (WebDriver driver) throws IOException{
		return element = driver.findElement(By.xpath(ExcelUtil.ReadExcel(2,1, 1)));
	}

	public static List<WebElement> WomenDressesList(WebDriver driver) throws IOException{
		return elementlist = driver.findElements(By.cssSelector(ExcelUtil.ReadExcel(2,2, 1)));
	}


	public static List<WebElement> DiscoundLabel(WebDriver driver) throws IOException{
		return	elementlist=Base.driver.findElements(By.xpath(ExcelUtil.ReadExcel(2,3, 1)));

	}

	

	
	



}
