package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static org.example.BasePage.driver;
import static org.example.Utils.currentTimeStamp;

public class Loaprop
{
    public static void captureScreenshot( String fileName)
    {
//Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot
                =((TakesScreenshot)driver);
//Call getScreenshotAs method to create image file
        File
                SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
        File destFile=new
                File("src\\test\\Screenshots\\"+fileName+""+currentTimeStamp()+".png");
//Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, destFile );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
