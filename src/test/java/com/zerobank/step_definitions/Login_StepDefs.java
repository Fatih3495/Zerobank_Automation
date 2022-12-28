package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummary;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {

    LoginPage loginPage=new LoginPage();
    AccountSummary accountSummary=new AccountSummary();


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters with {string} and {string} credentials")
    public void the_user_enters_with_and_credentials(String username, String password) {
        loginPage.login_mtd(username, password);

    }
    @Then("Verify with {string}")
    public void verify_with(String expectedText) {

        String actualText = loginPage.accountSummary_loc.getText();
        Assert.assertEquals("Account Summary is NOT visible", expectedText, actualText );
        //BrowserUtils.waitForVisibility(accountSummary.logoutButton_loc,2).click();
        accountSummary.usernameBtn_loc.click();
        BrowserUtils.waitForVisibility(accountSummary.logoutBtn_loc,2).click();

    }
    @When("The user enters {string} and {string} credential")
    public void the_user_enters_and_credential(String invalidUsername, String invalidPassword) {
       loginPage.invalidLogin_mtd(invalidUsername,invalidPassword);
    }
    @Then("verify invalid credential {string}")
    public void verify_invalid_credential(String expectedErrorMessage) {

        String actualMessage=loginPage.alertError_loc.getText().trim();
        Assert.assertEquals("Message does NOT match",expectedErrorMessage, actualMessage);

    }



}
