package HubspotPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends HubSpotBasePage{
    @FindBy(xpath = "//h1[text()='Sales Dashboard']")
    WebElement homePageHeader;
    
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    
    public boolean verifyHomePageHeader(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Sales Dashboard']")));
        return homePageHeader.isDisplayed();
    }
    
    public String getHomePageTitle(){
        return driver.getTitle();
    }
}
