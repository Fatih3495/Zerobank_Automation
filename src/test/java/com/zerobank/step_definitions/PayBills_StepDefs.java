package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PayBills_StepDefs {

    PayBillsPage payBillsPage = new PayBillsPage();

    @When("The user selects {string} in Payee menu")
    public void the_user_selects_in_payee_menu(String optionName) {
        payBillsPage.payeeMenuSelect_mtd(optionName);
    }

    @When("The user selects {string} in Account menu")
    public void the_user_selects_in_account_menu(String accountOption) {
        payBillsPage.accountMenuSelect_mtd(accountOption);

    }

    @And("The user enters amount")
    public void theUserEntersAmount() {
        payBillsPage.sendAmount_mtd();
    }

    @When("The user enters date")
    public void the_user_enters_date() {
        payBillsPage.enterDate_mtd();

    }

    @When("The user enters {string} to description box")
    public void the_user_enters_to_description_box(String expresion) {
        payBillsPage.sendExpression_mtd(expresion);

    }

    @When("The user pay submit")
    public void the_user_pay_submit() {
        payBillsPage.paySubmit_mtd();

    }

    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String expectedMessage) {
        payBillsPage.paymetVerification_mtd(expectedMessage);

    }


}

