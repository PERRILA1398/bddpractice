package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationMessagePage extends Utils
{
    By _registermessage = By.xpath("//div[@class='result']");
    static String expectedRegistrationMessage = "Thanks for registration";


    public void UserShouldBeAbleToSeeRegistrationMessage() {

        String actualmessage = GetText(_registermessage);
        Assert.assertEquals(actualmessage, expectedRegistrationMessage, "Registration Message Do not Match");
    }
}
