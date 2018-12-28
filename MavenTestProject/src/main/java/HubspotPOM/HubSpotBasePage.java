package HubspotPOM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HubSpotBasePage {
    WebDriver driver;
    Properties prop;
    
    public WebDriver init_driver() {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        //driver.manage().window().maximize();
        return driver;
    }
    public Properties init_properties(){
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream(
                    System.getProperty("/Users/newuser/eclipse-workspace/MavenTestProject/Utilityfiles/config.properties"));
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    }
    
    
    
    /*
     
    public WebDriver init_driver(){
    System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
   driver = new ChromeDriver();
   //driver.manage().deleteAllCookies();
   driver.get("https://app.hubspot.com/login");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
   
   return driver;
    
    } 
      
      public Properties init_Properties() {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream(
                    System.getProperty("/Users/newuser/eclipse-workspace/MavenTestProject/"
                            + "Utilityfiles/config.properties"));
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }*/
