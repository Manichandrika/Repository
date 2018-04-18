package com.loginpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.genericfunctions.CommonFunctions;
 
public class Login1 extends CommonFunctions
{
	
	
 @FindBy(how=How.XPATH ,using="//input[@name='uname']")
 public static WebElement uname;
 @FindBy(how=How.XPATH ,using="//input[@name='pwd']")
 public static WebElement pwd;
 @FindBy(how=How.XPATH ,using="//input[@name='submitBtn']")
 public static WebElement login;	
 
 public static void crds()
 {
	settext(uname, "admin");
	settext(pwd,"admin");
	clickelement(login);
	
 }
 public  void verifyuname()
 {
	boolean status=true;
	status=waitfor(uname);
	if(status)
	{
		asc.assertEquals(true, uname.isDisplayed());
		System.out.println("UserName IsDisplayed");
	}
 }
  public void verifypwd()
  {
	  boolean status =true;
	  status=waitfor(pwd);
   if(status)
   {
	   asc.assertEquals(true,pwd.isDisplayed());
	   System.out.println("Password IsDisplayed");
   }
  }
   public void verifylogin()
   {
 	  boolean status =true;
 	  status=waitfor(login);
    if(status)
    {
 	   asc.assertEquals(true,login.isDisplayed());
 	   System.out.println("login IsDisplayed");
    }
	
	
	 
 }
	
}
