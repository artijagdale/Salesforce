package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class commonmethods1 {

	public static void selectdropdown(WebElement dropdown,int index) {
		
		Select s=new Select(dropdown);
		s.selectByIndex(index);
	}
}
