package com.cydeo.step_definitions;

import com.cydeo.pages.FidexioPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FidexioStepDefinitionsLogout {

    FidexioPage fidexioPage=new FidexioPage();


    @When("user hits the logout button")
    public void user_hits_the_logout_button() {
        
        fidexioPage.logoutStep1Button.click();
        fidexioPage.logoutStep2Button.click();


    }
    @Then("verify that user is outside the page")
    public void verify_that_user_is_outside_the_page() {
        Assert.assertTrue(fidexioPage.signInButton.isDisplayed());
    }


    @Given("Sales Manager enters the username and password")
    public void userEntersTheUsernameAndPassword() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url.fidexio"));
        fidexioPage.emailInputBox.sendKeys("salesmanager15@info.com");
        fidexioPage.passwordInputBox.sendKeys("salesmanager");
        fidexioPage.submitButton.click();

    }

    @Given("Pos Manager enters the username and password")
    public void posManagerEntersTheUsernameAndPassword() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url.fidexio"));
        fidexioPage.emailInputBox.sendKeys("posmanager15@info.com");
        fidexioPage.passwordInputBox.sendKeys("posmanager");
        fidexioPage.submitButton.click();



    }

    @Then("verify that user cannot go back to the homepage")
    public void verifyThatUserCannotGoBackToTheHomepage() {

        Driver.getDriver().navigate().back();

        Assert.assertTrue(fidexioPage.odooSessionMessage.isDisplayed());

    }


}
