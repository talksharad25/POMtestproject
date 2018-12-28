package MavenTestProject.MavenTestProject;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import HubspotPOM.HomePage;
import HubspotPOM.HubSpotBasePage;
import HubspotPOM.LoginPage;

public class LoginTest {
    public HubSpotBasePage testBase;
    public WebDriver driver;
    public Properties prop;
    public LoginPage loginPage;
    public HomePage homePage;
    
    @BeforeMethod
    public void setUp(){
        testBase = new HubSpotBasePage();
        driver = testBase.init_driver();
        prop = testBase.init_properties();
        loginPage = new LoginPage(driver);
        driver.get(prop.getProperty("url"));
    }
    /*@BeforeMethod
    public void setUp() {
        basepage= new HubSpotBasePage();
        driver = basepage.init();
        prop = basepage.initProperty();
        loginPage = new LoginPage(driver);
        
        driver.get(prop.getProperty("url"));
    } */

    @Test(priority=1)
    public void verifyloginpagetitle() {
       String title = driver.getTitle();
       System.out.println(title);
       //Assert.assertEquals(title, prop.getProperty("HomepageTitle"));
    }
    
    
    @AfterMethod
    public void teardown() {
       driver.close();
    }
}
