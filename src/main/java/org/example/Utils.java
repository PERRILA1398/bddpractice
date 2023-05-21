package org.example;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

//Utils serves as Parent Class and
// has all Reuseable methods that can be used by the other Child classes for method overriding


public class Utils extends BasePage
{

    // creating resuable get text method
    public static String GetText(By by)
    {
        //driver finds element to get the return value String text
        return driver.findElement(by).getText();

    }
    //creating reuseable click on element method
    public static void ClickonElement(By by)
    {
        //driver to find element and click on element

        driver.findElement(by).click();
    }

    //creating reuseable type text method
    public static void TypeText(By by, String text)
    { //driver to find element and sendkeys to type text
        driver.findElement(by).sendKeys();
    }

    //creating reuseable timesstamp method to abstract current time
    public long timestamp() {
        //creating new object timestamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        //call timestamp method to get time
        return timestamp.getTime();

    }

    //creating reuseable currenttimestsamp method for date/month/year
    public static String currentTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new
                SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }

    //creating reuseable method to capture screenshot
    public static void captureScreenshot(String fileName) {


        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destFile = new File("src\\test\\Screenshots\\" + fileName + "" + currentTimeStamp() + ".png");

        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void SelectbyText (By by,String text)
    {
        //creating new object select to find element from driver
      Select select = new Select(driver.findElement(by));
      // calling select object to select element via text
      select.selectByVisibleText(text);
    }

    //creating new
    public void SelectByValue (By by, String value)
    {
        Select select= new Select(driver.findElement(by));
        select.selectByValue(value);

    }
    public static void Selectbyindex(By by,int index)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

}



