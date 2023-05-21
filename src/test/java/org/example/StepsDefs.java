package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefs extends Utils
{
HomePage homePage = new HomePage();
RegisterPage registerPage= new RegisterPage();
RegistrationMessagePage registrationMessagePage= new RegistrationMessagePage();

 @Given("User is on HomePage")

    public  void user_is_on_home_page ()
 {
     homePage.UserShouldBeAbleClickOnRegisterButton();

 }

 @When("User types in their details")
    public void user_types_in_their_details ()
     {  registerPage.UserShouldBeAbleToTypeInTheirDetailsSuccessfully();

     }

     @Then("User should be able to register successfully")
    public void user_should_be_able_to_register_successfully()
     {
     registrationMessagePage.UserShouldBeAbleToSeeRegistrationMessage();
     }
}
