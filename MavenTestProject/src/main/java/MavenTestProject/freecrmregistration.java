package MavenTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import excelreaderutil.Xls_Reader;

public class freecrmregistration {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/newuser/Downloads/Installed/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.freecrm.com/register/");
        Xls_Reader excel = new Xls_Reader("/Users/newuser/eclipse-workspace/MavenTestProject/"
                + "TestData/Exceltestdata.xlsx");
        
        String Sheetname = "registration"; 
        int rowcount = excel.getRowCount(Sheetname);
        System.out.println("the row count is :"+ rowcount);
        
        for (int RowNum =2; RowNum<=rowcount; RowNum++ ) {
            String select_edition = excel.getCellData(Sheetname, "Select Edition", RowNum);
            String First_Name = excel.getCellData(Sheetname, "First Name", RowNum);
            String Last_Name = excel.getCellData(Sheetname, "Last Name", RowNum);
            String Email = excel.getCellData(Sheetname, "Email", RowNum);
            String Confirm_Email = excel.getCellData(Sheetname, "Confirm Email", RowNum);
            String Username = excel.getCellData(Sheetname, "Username", RowNum);
            String Password = excel.getCellData(Sheetname, "Password", RowNum);
            String Confirm_Password = excel.getCellData(Sheetname, "Confirm Password", RowNum);
            
            Select select_edi = new Select(driver.findElement(By.id("payment_plan_id")));
            select_edi.selectByVisibleText(select_edition);
                    
            driver.findElement(By.name("first_name")).sendKeys(First_Name);
            
            driver.findElement(By.name("surname")).sendKeys(Last_Name);
            
            driver.findElement(By.name("email")).sendKeys(Email);
            
            driver.findElement(By.name("email_confirm")).sendKeys(Confirm_Email);
            
            driver.findElement(By.name("username")).sendKeys(Username);
            
            driver.findElement(By.name("password")).sendKeys(Password);
            
            driver.findElement(By.name("passwordconfirm")).sendKeys(Confirm_Password);
            driver.findElement(By.xpath("//input[@type='checkbox']")).click();
            
            
            driver.findElement(By.name("first_name")).clear();
            driver.findElement(By.name("surname")).clear();
            driver.findElement(By.name("email")).clear();
            driver.findElement(By.name("email_confirm")).clear();
            driver.findElement(By.name("username")).clear();
            driver.findElement(By.name("password")).clear();
            driver.findElement(By.name("passwordconfirm")).clear();
            
            
        }
        driver.quit();
    }

}
