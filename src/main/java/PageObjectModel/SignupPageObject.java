package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {

	public WebDriver driver;
	
	private By FirstName=By.xpath("//input[@name='UserFirstName']");
	private By LastName=By.xpath("//input[@name='UserLastName']");
	private By WorkEmail=By.xpath("//input[@name='UserEmail']");
	private By Company=By.xpath("//input[@name='CompanyName']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By JobTitle=By.xpath("//select[@name='UserTitle']");
	private By Employees=By.xpath("//select[@name='CompanyEmployees']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	private By checkbox=By.xpath("(//div[@class='checkbox-ui'])[1]");
	
	public SignupPageObject(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement enterFirstname() {
		
	return driver.findElement(FirstName);	
	}
	
	public WebElement enterlastname() {
		
	return driver.findElement(LastName);	
		}
	
	public WebElement enterworkemail() {
		
	return driver.findElement(WorkEmail);	
		}
	
	public WebElement entercompanyname() {
		
	return driver.findElement(Company);	
		}
	
	public WebElement enterphoneno() {
		
	return driver.findElement(phone);	
		}
	
	public WebElement selectjobtitle() {
		
	return driver.findElement(JobTitle);	
		}
	
	public WebElement selectEmployees() {
		
	return driver.findElement(Employees);	
		}
	
	public WebElement selectcountry() {
		
	return driver.findElement(Country);	
		}
	
	public WebElement selectCheckbox() {
		
	return driver.findElement(checkbox);	
		}
}
