package pageObjectPattern;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.LoadableComponent;



public class MainPage extends LoadableComponent<MainPage>
{
	
	private final WebDriver driver;
	public MainPage(WebDriver driver)
	{
		this.driver=driver;
	}


	// Find all the element in this page
	@FindBy(how= How.XPATH, using="//a[@id='theshop']")
	private WebElement theShop;

	
	@Override
	protected void load() {
		
		
		driver.get("http://www.facebook.com/");

		
	}

	@Override
	protected void isLoaded() throws Error {
    try {
    	
		
	} catch (NoSuchElementException  e) {
		// TODO: handle exception
//		fail("No element found");
		e.getMessage();
	}
    
		 System.out.println("This is end of the isLoaded method");
	}

	

}
