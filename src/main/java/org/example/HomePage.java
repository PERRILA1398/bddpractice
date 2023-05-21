package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils
{
    By _RegisterButton = By.xpath("//a[@class='ico-register']");
    public void UserShouldBeAbleClickOnRegisterButton()
    {

        ClickonElement(_RegisterButton);

    }
}
