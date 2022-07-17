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
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FidexioStepDefinitionsCreateVehicle {

    FidexioPage fidexioPage = new FidexioPage();

    @Given("user hits the more and fleet button")
    public void userHitsTheMoreAndFleetButton() {

        fidexioPage.moreButton.click();

        BrowserUtils.sleep(2);

        fidexioPage.fleetButton.click();

        BrowserUtils.sleep(2);
    }


    @And("user hits the Vehicle Model")
    public void userHitsTheVehicleModel() {

        fidexioPage.vehicleModelButton.click();

        BrowserUtils.sleep(2);

        fidexioPage.createButton.click();


    }

    @And("user enters the Model Name")
    public void userEntersTheModelName() {

        fidexioPage.inputMakeName.sendKeys("Bmw");
        BrowserUtils.sleep(2);
        fidexioPage.inputMakeName.sendKeys(Keys.ENTER);
        BrowserUtils.sleep(2);
        fidexioPage.inputModelName.sendKeys("520ES");
        BrowserUtils.sleep(2);
        fidexioPage.saveVehicleButton.click();
        BrowserUtils.sleep(2);
        //fidexioPage.saveButtonAfter.click();

    }

    @Then("edit Button is visible")
    public void editButtonIsVisible() {

        Assert.assertTrue(fidexioPage.editButton.isDisplayed());


    }



}