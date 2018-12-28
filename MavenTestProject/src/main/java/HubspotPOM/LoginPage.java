package HubspotPOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends HubSpotBasePage{
    
    // webelements and actions (methods) -- features
    //for webelements -- pagefactory pattern
    //initialize your elements by pagefactory class and initElements method
    // this.driver belongs to basepage driver, which will intialize to Loginpage driver (constructor)
    

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public LoginPage login(String userName, String pwd) {
        username.sendKeys(userName);
        password.sendKeys(pwd);
        // loginBtn.click();
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", loginBtn);
        
        return new LoginPage(driver);

    }
    
}
