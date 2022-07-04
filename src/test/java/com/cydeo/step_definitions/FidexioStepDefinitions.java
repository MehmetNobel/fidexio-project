package com.cydeo.step_definitions;

import com.cydeo.pages.FidexioPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FidexioStepDefinitions {

    FidexioPage fidexioPage = new FidexioPage();


    @When("user enters the {string} and password {string}")
    public void userEntersTheAndPassword(String arg0, String arg1) {

       fidexioPage.emailInputBox.sendKeys(arg0);
        System.out.println("fidexioPage.emailInputBox.getText() = " + fidexioPage.emailInputBox.getText());
        fidexioPage.passwordInputBox.sendKeys(arg1);
        System.out.println("fidexioPage.passwordInputBox.getText() = " + fidexioPage.passwordInputBox.getText());
        fidexioPage.submitButton.click();

    }


    @Given("user is on the login page")
    public void userIsOnTheloginPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url.fidexio"));
    }

    @Then("user is on the homepage")
    public void userIsOnTheHomepage() {
        Assert.assertTrue(fidexioPage.inBoxButton.isDisplayed());

    }


    @Then("user see the error message")
    public void userSeeTheErrorMessage() {

        Assert.assertTrue(fidexioPage.errorMessage.isDisplayed());

    }

    @Then("user see the message")
    public void userSeeTheAlert() {

        String actualMessage = Driver.getDriver().findElement(By.cssSelector("#login")).
                getAttribute("validationMessage");
        System.out.println("message = " + actualMessage);
        String expectedMessage="Lütfen bu alanı doldurun.";
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @When("user clicks the reset password button")
    public void userClicksTheResetPasswordButton() {
        fidexioPage.resetPassword.click();
    }

    @Then("user see email input page")
    public void userSeeEmailInputPage() {

        Assert.assertTrue(fidexioPage.buttonConfirm.isDisplayed());
    }

    @And("user clicks the Enter Button")
    public void userClicksTheEnterButton() {
        fidexioPage.passwordInputBox.sendKeys(Keys.ENTER);
    }

    @When("user enters the {string} and password {string} and hits the Enter Key")
    public void userEntersTheAndPasswordAndHitsTheEnterKey(String arg0, String arg1) {

        fidexioPage.emailInputBox.sendKeys(arg0);
        fidexioPage.passwordInputBox.sendKeys(arg1+Keys.ENTER);

    }

    @Then("user see that password is in bullet signs by default")
    public void userSeeThatPasswordIsInBulletSignsByDefault() {

        String actualAttributeType = fidexioPage.passwordBulletSign.getAttribute("type");
        String expectedAttributeType = "password";

        Assert.assertEquals(expectedAttributeType,actualAttributeType);

    }
}