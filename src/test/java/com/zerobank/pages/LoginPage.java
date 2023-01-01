package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signinButtonHome_loc;

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement loginButton_loc;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordButton_loc;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement sign_inButtonLogin_loc;

    @FindBy(xpath = "//span[text()='This site can’t provide a secure connection']")
    public WebElement secureMessage_loc;
    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement alertError_loc;

    public void login_mtd(String username, String password){
        BrowserUtils.waitFor(2);
        signinButtonHome_loc.click();
        loginButton_loc.sendKeys(username);
        passwordButton_loc.sendKeys(password);
        sign_inButtonLogin_loc.click();
        BrowserUtils.waitFor(1);

        if(secureMessage_loc.isDisplayed()) {
            Driver.get().get(ConfigurationReader.get("url1"));
        }

    }

    public void invalidLogin_mtd(String invalidUname, String invalidPswrd){
        BrowserUtils.waitFor(2);
        signinButtonHome_loc.click();
        loginButton_loc.sendKeys(invalidUname);
        passwordButton_loc.sendKeys(invalidPswrd);
        sign_inButtonLogin_loc.click();
        BrowserUtils.waitFor(1);
    }

    public void verify_mtd(String expectedText){
        String actualAccountSummaryText= accountSummary_loc.getText();
        Assert.assertEquals("Account Summary is NOT visible", expectedText, actualAccountSummaryText );

        }

    public void verifyInvalidCredential_Mtd(String expectedErrorMessage){
        String actualAlertErrorMessage=alertError_loc.getText().trim();
        Assert.assertEquals("Message does NOT match", expectedErrorMessage, actualAlertErrorMessage);
    }

}
