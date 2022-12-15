package Testcases1;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import PageObjectModel.SignupPageObject;
import Resources.baseclass1;
import Resources.commonmethods1;
import Resources.constant1;

public class SignupTestCase extends baseclass1{

	@Test
	public void VerifySignup() throws InterruptedException {
		
	LoginPageObject LPO= new LoginPageObject(driver);
	
	LPO.clickonTryForFree().click();
	Thread.sleep(4000);
	
	SignupPageObject SPO= new SignupPageObject(driver);
	
	SPO.enterFirstname().sendKeys(constant1.firstname);
	SPO.enterlastname().sendKeys(constant1.lastname);
	SPO.enterworkemail().sendKeys(constant1.workEmail);
	SPO.entercompanyname().sendKeys(constant1.company);
	SPO.enterphoneno().sendKeys(constant1.phone);
	SPO.selectCheckbox().click();
	
	commonmethods1.selectdropdown(SPO.selectjobtitle(), 3);
	commonmethods1.selectdropdown(SPO.selectEmployees(), 3);
	commonmethods1.selectdropdown(SPO.selectcountry(), 3);
	}
}

//added by Arti
//added by 

