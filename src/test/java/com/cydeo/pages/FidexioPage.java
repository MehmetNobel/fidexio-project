package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioPage {

    public FidexioPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (css = "input[name='login']")
    public WebElement emailInputBox;

    @FindBy (css = "input[name='password']")
    public WebElement passwordInputBox;

    @FindBy (css = "button[type='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//div[.='Congratulations, your inbox is empty']")
    public WebElement message;

    @FindBy (xpath = "//span[.='POSManager10']")
    public WebElement logout1;

    @FindBy (xpath = "//a[.='Log out']")
    public WebElement logout2;

    @FindBy (xpath = "//b[.='Sign in']")
    public WebElement signInButton;

    @FindBy (xpath = "//span[.='Inbox']")
    public WebElement inBoxButton;

    @FindBy (xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;

    @FindBy (xpath = "//a[.='Reset Password']")
    public WebElement resetPassword;

    @FindBy (xpath = "//button[.='Confirm']")
    public WebElement buttonConfirm;

    @FindBy (css = "#password")
    public WebElement passwordBulletSign;

    @FindBy (css = "span[class='oe_topbar_name']")
    public WebElement logoutStep1Button;

    @FindBy (xpath = "//a[.='Log out']")
    public WebElement logoutStep2Button;

    @FindBy (xpath = "//h4[.='Odoo Session Expired']")
    public WebElement odooSessionMessage;








}
