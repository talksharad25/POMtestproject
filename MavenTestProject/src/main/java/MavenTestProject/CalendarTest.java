package MavenTestProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest {
    // WORKING BY XPATH 
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.southwest.com/");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
       
       driver.findElement(By.xpath("//div[contains(@class,'booking-form--middle-options')]"
               + "//a[contains(@class,'booking-form--field-icon-container booking-form--gradient-treatment js-depart-date-icon')]"
               + "//span[contains(@class,'js-field-icon booking-form--field-icon booking-form--date-icon swa-icon swa-icon_calendar')]")).click();
       
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//td[@id='calendar-october-24']")).click();
       
       driver.findElement(By.xpath("//div[contains(@class,'booking-form--middle-options')]//a[contains(@class,'booking-form--field-icon-container booking-form--gradient-treatment js-return-date-icon')]"))
       .click();
       
       Thread.sleep(3000);
       driver.findElement(By.xpath("//td[@id='calendar-november-20']")).click();
    }

}
