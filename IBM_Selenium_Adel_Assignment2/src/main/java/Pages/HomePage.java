package Pages;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.ExcelUtil;

public class HomePage {
	 private static WebElement element = null;
	 private static List<WebElement> elementlist=null;
	 
	 public static List<WebElement> PopularListName(WebDriver driver) throws IOException{
		 return elementlist = driver.findElements(By.xpath(ExcelUtil.ReadExcel(1,0, 1)));
			}
	 public static List<WebElement> PopularListPrice(WebDriver driver) throws IOException{
		 return elementlist = driver.findElements(By.xpath(ExcelUtil.ReadExcel(1,1, 1)));
			}
	 
	 
	 public static List<WebElement> SallerListName(WebDriver driver) throws IOException{
		 return elementlist = driver.findElements(By.xpath(ExcelUtil.ReadExcel(1,3, 1)));
			}
	 public static List<WebElement> SallerListPrice(WebDriver driver) throws IOException{
		 return elementlist = driver.findElements(By.xpath(ExcelUtil.ReadExcel(1,4, 1)));
			}
	 
	 public static WebElement BestSaller(WebDriver driver) throws IOException{

		 return element = driver.findElement(By.cssSelector(ExcelUtil.ReadExcel(1,2, 1)));
			}
	 

	 
}
