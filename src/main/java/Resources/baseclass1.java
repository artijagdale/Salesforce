package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseclass1 {
        
	public WebDriver driver;
	
	public void browserInitialization() throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Arti Jagdale\\eclipse-workspace\\Salesforce\\src\\main\\java\\Resources\\data.properties1");
	
	    Properties prop=new Properties();
	    
	    prop.load(fis);
	
	String browsername = prop.getProperty("browser");
	
	if(browsername.equalsIgnoreCase("chrome")){
		
		 driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		
		//firefox code
	}
	else {
		
		System.out.println("please enter valid browser name");
	}
	}
	@BeforeMethod
	public void launch() throws IOException {
		
		browserInitialization();
		
		driver.get("https://login.salesforce.com/?locale=in");
	}
}
