package com.testcases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.genericfunctions.CommonFunctions;
import com.loginpages.Login1;

public class Tc_01 extends CommonFunctions
{
	
@Test	
 public static void test()
 {
	driver.get("http://server/bank/adminlogin.php");
    driver.manage().window().maximize();
    
    Login1 lg=PageFactory.initElements(driver, Login1.class);
    lg.verifyuname();
    lg.verifypwd();
    lg.verifylogin();
    lg.crds();
     
    
 }
	
	
}
