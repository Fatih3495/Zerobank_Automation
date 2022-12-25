package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//button[@id='signin_button']")
    public WebElement siginButtonHome_loc;

    @FindBy(xpath = "/input[@id='user_login']")
    public WebElement loginButton_loc;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordButton_loc;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement siginButtonLogin_loc;
}
