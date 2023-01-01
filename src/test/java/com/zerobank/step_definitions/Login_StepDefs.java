package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login_StepDefs {

    LoginPage loginPage=new LoginPage();


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
        loginPage.verify_mtd(expectedText);
    }


    @When("The user enters {string} and {string} credential")
    public void the_user_enters_and_credential(String invalidUsername, String invalidPassword) {
        loginPage.invalidLogin_mtd(invalidUsername, invalidPassword);
    }



    @Then("verify invalid credential {string}")
    public void verify_invalid_credential(String expectedErrorMessage) {
        loginPage.verifyInvalidCredential_Mtd(expectedErrorMessage);

    }


}
