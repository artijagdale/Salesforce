package Testcases1;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.baseclass1;
import Resources.constant1;

public class LoginTestCase1 extends baseclass1{
    @Test
	public void Login() {
		
    LoginPageObject LPO=new LoginPageObject(driver);
    
    LPO.Enterusername().sendKeys(constant1.username);
    LPO.Enterpassword().sendKeys(constant1.password);
    LPO.clicktologin().click();
	}
}


//changed by Arti 