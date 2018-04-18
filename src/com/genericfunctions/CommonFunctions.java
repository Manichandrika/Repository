package com.genericfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.asserts.SoftAssert;


public class CommonFunctions {
	
	
	public static WebDriver driver=new FirefoxDriver();
    public static SoftAssert asc=new SoftAssert();
	public static boolean waitfor(WebElement element) {
		boolean status = true;

		for (int i = 0; i <= 10; i++) {
			try {
				
				
					
				
				System.out.println("Wait is Executed");
				status = true;
				Actions act = new Actions(driver);
				act.moveToElement(element).build().perform();
				System.out.println("Element Found");
				element.click();
				break;
				

			} catch (Exception e) {
				status = false;
				try {
					Thread.sleep(1000);

				} catch (Exception e1)
				{

				}

			}
		}
		System.out.println("Wait is Executed ");
		return status;

	}
public static boolean settext(WebElement element,String mn)
{
	boolean status=true;
	try{
		element.click();
		element.clear();
		element.sendKeys(mn);
	}
	catch(Exception e)
	{
		
	}
	return true;
}
	public static boolean clickelement(WebElement element)
	{
		boolean status=true;
		try{
			element.click();
	      }
		catch(Exception e)
		{
		}
		return true;
	}

}

