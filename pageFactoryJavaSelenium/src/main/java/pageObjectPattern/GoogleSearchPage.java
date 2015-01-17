package pageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    // The element is now looked up using the name attribute
//    @FindBy(how = How.NAME, using = "q")
//    private WebElement searchBox;

	 @FindBy(how = How.XPATH, using = "//*[@id='email']")
	    private WebElement userName;

	 @FindBy(how = How.XPATH, using = "//*[@id='pass']")
	    private WebElement passWord;
	 
	 @FindBy(how = How.XPATH, using = "//*[@id='u_0_n']")
	    private WebElement clickOnLogin;

	public void typeUserName(String text) {
        // We continue using the element just as before
		userName.sendKeys(text);
		System.out.println("I got the user ID");
        
    }
	public void typePassword(String text) {
        // We continue using the element just as before
		passWord.sendKeys(text);
		System.out.println("I got the Password");
        
    }
	public void hitOntheButton() {
        // We continue using the element just as before
		clickOnLogin.click();
		System.out.println("already click on the button");
        
    }
} 