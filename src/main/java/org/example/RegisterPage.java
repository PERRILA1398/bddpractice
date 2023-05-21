package org.example;


import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    LoadProp loadProp = new LoadProp();

    public String username= loadProp.getProperty("username");

    public String lastname= loadProp.getProperty("lastname");
    public String password= loadProp.getProperty("password");
    public String confirmpassword= loadProp.getProperty("confirmpassword");
    By _username = By.xpath("//input[@id='FirstName']");

    By _lastname = By.xpath("//input[@id='LastName']");
    By _email = By.xpath("//input[@type='email']");

    By _password = By.xpath("(//input[@type='password']) [1]");

    By _confirmpassword = By.xpath("(//input[@type='password']) [2]");

    By _submit = By.xpath("(//button[@type='submit']) [2]");

    By _month = By.xpath("//select[@name='DateOfBirthMonth']");

    By _Birth = By.xpath("//select[@name='DateOfBirthDay']");

    By _Day = By.xpath("//select[@name='DateOfBirthYear']");

    public  void UserShouldBeAbleToTypeInTheirDetailsSuccessfully()
    {


        TypeText(_username, "username");
        TypeText(_lastname, "lastname");
       SelectByValue(_Birth, "3");
        SelectbyText(_month, "February");
        Selectbyindex(_Day, 10);
        TypeText(_email, "QQ" + timestamp() + "@gmail.com");
        TypeText(_password, "password");
        TypeText(_confirmpassword, "confirmpassword");
        ClickonElement(_submit);

    }
}
