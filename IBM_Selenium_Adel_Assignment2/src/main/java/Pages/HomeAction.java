package Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Base;
import Utilities.ExcelUtil;

public class HomeAction {




	public static void GetMaxPrice( List<WebElement> PriceList) throws IOException 
	{

		//	double min = Double.MAX_VALUE;
		double max= Double.MIN_VALUE;
		double Value = 0 ;

		double price =0.0 ;
		int location=0;
		WebElement AddCart = null;


		for(int i=0; i<PriceList.size(); i++){
			price=Double.parseDouble(PriceList.get(i).getText().replaceAll("[$]", "")) ;

			if(price> max){
				max = price;
				location=i;	
			}

		}

		Value=max;
		Base.TotalPrice=Base.TotalPrice+Value;
		//	Base.ItemAdd.add(PriceList.get(location).findElement(By.xpath("../../h5")).getText());

		AddCart=	PriceList.get(location).findElement(By.xpath(ExcelUtil.ReadExcel(1,5, 1)));


		Base.ItemNum++;
		System.out.println(Base.ItemNum);

		//Base.ItemAdd.add(PriceList.get(location).findElement(By.xpath(ExcelUtil.ReadExcel(1,6, 1))).getText());

	Base.AddItemList(Base.ItemAdd,PriceList.get(location).findElement(By.xpath(ExcelUtil.ReadExcel(1,6, 1))).getText());

	Base.AddPriceList(Base.PriceAdd,Value);
	
	
	
		/*
		 * for (String element : Base.ItemAdd) { System.out.println(element); }
		 */
		System.out.println("....................................................");
		System.out.println("Selected Dress Price "+ Value);
		System.out.println("Items in Cart : "+Base.ItemNum );
		System.out.println("Total Price in Cart = "+Base.TotalPrice);

		System.out.println("....................................................");

		Base.MouseOver(PriceList.get(location), Base.driver);

		AddCart.click();

		Base.Continue_shopping(Base.driver).click();

		System.out.println("***************************************************");



	}



	//......................
	public static void GetLessPrice(List<WebElement> e) throws IOException {




		double Value = 0 ;

		double price =0.0 ;
		int location=0;
		WebElement AddCart = null;

		double min = Double.MAX_VALUE;
		for (int i = 0; i < e.size(); i++) {
			price = Double.parseDouble(e.get(i).getText().replaceAll("[$]", ""));
			if (price < min) {
				min = price;
				location = i;

			}

		}

		//.........................



		Value=	min;
		Base.TotalPrice=Base.TotalPrice+Value;
		//	Base.ItemAdd.add(PriceList.get(location).findElement(By.xpath("../../h5")).getText());

		AddCart=	e.get(location).findElement(By.xpath(ExcelUtil.ReadExcel(1,7, 1)));

		Base.ItemNum++;
		System.out.println(Base.ItemNum);

		//	Base.AddItemList(Base.ItemAdd,e.get(location).findElement(By.xpath(ExcelUtil.ReadExcel(1,6, 1))).getText());
			Base.ItemAdd.add(e.get(location).findElement(By.xpath(ExcelUtil.ReadExcel(1,6, 1))).getText());
			Base.AddPriceList(Base.PriceAdd,Value);

		/*
		 * for (String element : Base.ItemAdd) { System.out.println(element); }
		 */

		System.out.println("....................................................");
		System.out.println("Selected Dress Price "+ Value);
		System.out.println("Items in Cart : "+Base.ItemNum );
		System.out.println("Total Price in Cart = "+Base.TotalPrice);

		System.out.println("....................................................");

		Base.MouseOver(e.get(location), Base.driver);

		AddCart.click();

		Base.Continue_shopping(Base.driver).click();

		System.out.println("***************************************************");






		//.............................





	}






}