package MavenTestProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarSpiceJet {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
         WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
        //WebDriverWait fromdatewait = new WebDriverWait(driver, 20);
        //WebElement element1 = fromdatewait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']"))));
        //element1.click();
        Thread.sleep(5000); 
        
        
        driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1' and @id='ctl00_mainContent_view_date1']")).click();
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        //WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By
         //       .xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//tbody//tr[4]//td[5]"))));
        //element2.click();
        //driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//tbody//tr[4]//td[5]")).click();
                   
       }
        
        
        
        
        
        
       /* clickOn(driver, driver.findElement(By.id("ctl00_mainContent_view_date1")), 20);
        
        String date = "22-Oct 2018";
        String splitter[] = date.split("-");
        String depdate = splitter[0];
        String depmon_year = splitter[1];
        
        List<WebElement> days = driver.findElements(By.xpath(""))
            
        
                //div[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2']/
               // div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td/a
        ///html/body/div[2]/div[1]
        ////*[@id="view_fulldate_id_1"]
        ///html/body/div[2]/div[1]/table/tbody/tr[4]/td[6]/a
        ///html/body/div[2]/div[1]/table/tbody/tr[1]/td[4]
        
//        List<WebElement> allDates=driver.findElements(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']"));
//        
//        for(WebElement ele:allDates)
//        {
//            
//            String date=ele.getText();
//            
//            if(date.equalsIgnoreCase("27"))
//            {
//                ele.click();
//                break;
//            }
//            
//        }*/

    public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
        new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
        .until(ExpectedConditions.elementToBeClickable(locator));
        locator.click();
    }
    }
