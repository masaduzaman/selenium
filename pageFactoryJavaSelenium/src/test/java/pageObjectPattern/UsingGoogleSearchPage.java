package pageObjectPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.PageFactory;

public class UsingGoogleSearchPage {
    public static void main(String[] args) {
        // Create a new instance of a driver
//        WebDriver driver = new HtmlUnitDriver();
    	WebDriver driver = new PhantomJSDriver();

        // Navigate to the right place
        driver.get("http://www.facebook.com/");
        System.out.println("the browser launching");

        // Create a new instance of the search page class
        // and initialise any WebElement fields in it.
        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);

        page.typeUserName("Asaduzaman");
        System.out.println("I type userName");
        page.typePassword("934875943");
        System.out.println("I type password");
        page.hitOntheButton();
        System.out.println("I hit on the button");
    }
} 