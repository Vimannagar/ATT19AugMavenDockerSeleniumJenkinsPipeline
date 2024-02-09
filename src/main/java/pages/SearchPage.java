package pages;

import org.openqa.selenium.WebDriver;

public class SearchPage {
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterText()
	{
		System.out.println("Entering the text");
	}

}
