package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;


public class DriverManager extends Utils
{
    LoadProp loadProp= new LoadProp();
 public String browsername= loadProp.getProperty("browsername");;

    @BeforeMethod
    public void OpenBrowser ()
    {
        if (browsername.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browsername.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browsername.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Sorry browser not found");
        }

     driver = new ChromeDriver();
     driver.get("https://demo.nopcommerce.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod

    public static void CloserBrowser()
    {
        driver.close();
    }
}
