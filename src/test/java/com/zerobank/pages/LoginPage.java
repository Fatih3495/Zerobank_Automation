package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement signinButtonHome_loc;

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement loginButton_loc;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordButton_loc;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement sign_inButtonLogin_loc;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement alertError_loc;

    public void login_mtd(String username, String password){

        signinButtonHome_loc.click();
        loginButton_loc.sendKeys(username);
        passwordButton_loc.sendKeys(password);
        sign_inButtonLogin_loc.click();
        Driver.get().get(ConfigurationReader.get("url1"));
        BrowserUtils.waitFor(1);
    }

    public void invalidLogin_mtd(String invalidUsername, String invalidPassword){
        signinButtonHome_loc.click();
        loginButton_loc.sendKeys(invalidUsername);
        passwordButton_loc.sendKeys(invalidPassword);
        sign_inButtonLogin_loc.click();
        BrowserUtils.waitFor(1);
    }






}
