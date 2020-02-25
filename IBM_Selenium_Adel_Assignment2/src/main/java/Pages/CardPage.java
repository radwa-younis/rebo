package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utilities.Base;
import Utilities.ExcelUtil;

public class CardPage {
	private static WebElement element = null;
	private static List<WebElement> elementlist=null;
	private static Select select_drop= null;  




	public static WebElement AddCardButton (WebDriver driver) throws IOException{
		return element = driver.findElement(By.xpath(ExcelUtil.ReadExcel(3,0, 1)));
	}
	public static WebElement ProceedCheckOut1 (WebDriver driver) throws IOException{
		return element = driver.findElement(By.xpath(ExcelUtil.ReadExcel(3,1, 1)));
	}


	public static WebElement EmailCreate (WebDriver driver) throws IOException{
		return element = driver.findElement(By.id(ExcelUtil.ReadExcel(0,21, 1)));
	}


	public static WebElement CardTotalPrice (WebDriver driver) throws IOException{
		return element = Base.driver.findElement(By.id(ExcelUtil.ReadExcel(3,4, 1)));
	}

	public static WebElement TotalShipping (WebDriver driver) throws IOException{
		return element = Base.driver.findElement(By.id(ExcelUtil.ReadExcel(3,3, 1)));
	}



	public static List<WebElement> CardListName(WebDriver driver) throws IOException{
		return elementlist = driver.findElements(By.xpath(ExcelUtil.ReadExcel(3,2, 1)));
	}		

	public static List<WebElement> CardListPrice(WebDriver driver) throws IOException{
		return elementlist = driver.findElements(By.xpath(ExcelUtil.ReadExcel(3,6, 1)));
	}		
	
	
	
	
	
	
	public static WebElement ItemNUM (WebDriver driver) throws IOException{
		return element = Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(3,5, 1)));
	}

	public static WebElement PayByCheck (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(7,0, 1)));
	}



	public static WebElement Confirm (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(8,0, 1)));

	}


	public static WebElement OrderCompleleted (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(9,0, 1)));

	}	

	public static WebElement SubmitCreate (WebDriver driver) throws IOException{
		return element = Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,2, 1))); 

	}
	public static WebElement MrsRadio (WebDriver driver) throws IOException{
		return element = Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,3, 1)));

	}

	public static WebElement Firstname (WebDriver driver) throws IOException{
		return element = Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,4, 1)));

	}		

	public static WebElement Lastname (WebDriver driver) throws IOException{
		return element = Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,5, 1)));

	}

	public static WebElement Password (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,6, 1)));
	}	


	public static Select Day (WebDriver driver) throws IOException{
		return select_drop =new Select(Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,8, 1))));
	}	

	public static Select Month (WebDriver driver) throws IOException{
		return select_drop =new Select(Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,9, 1))));

	}	

	public static Select Years (WebDriver driver) throws IOException{
		return select_drop =new Select(Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,10, 1))));

	}
	public static WebElement Address (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,11, 1)));

	}

	
	public static WebElement City (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,13, 1)));

	}

	public static Select State (WebDriver driver) throws IOException{
		return select_drop = new Select(Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,15, 1))));
	}
	
	
	public static WebElement PostCode (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,16, 1)));
	}
	
	
	public static WebElement PhoneMobile (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,18, 1)));

	}

	public static WebElement Alias (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,20, 1)));
	}
	
	public static WebElement Register (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.id(ExcelUtil.ReadExcel(4,22, 1)));
	}
		
	public static WebElement ProceedCheckOut2 (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(5,0, 1)));
	}
	
		public static WebElement Agreement (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.id(ExcelUtil.ReadExcel(6,0, 1)));

	}	
		public static WebElement ProceedCheckOut3 (WebDriver driver) throws IOException{
		return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(6,1, 1)));
		
	}	
	
	//..............................................................................................
		
		public static WebElement name (WebDriver driver) throws IOException{
			return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(5,1, 1)));
			
		}		
		public static WebElement address (WebDriver driver) throws IOException{
			return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(5,2, 1)));
			
		}
		
		public static WebElement state (WebDriver driver) throws IOException{
			return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(5,3, 1)));
			
		}
		public static WebElement Mobile (WebDriver driver) throws IOException{
			return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(5,4, 1)));
			
		}	
		public static WebElement city (WebDriver driver) throws IOException{
			return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(5,5, 1)));
			
		}	
	
		public static WebElement CountryAfterSelect (WebDriver driver) throws IOException{
			return element =Base.driver.findElement(By.xpath(ExcelUtil.ReadExcel(4,26, 1)));
			
		}
		
		
		
}