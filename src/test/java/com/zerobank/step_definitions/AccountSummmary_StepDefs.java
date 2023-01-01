package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummary;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummmary_StepDefs {

    AccountSummary accountSummary=new AccountSummary();

    @Then("The user should be able to see as a page header {string}")
    public void the_user_should_be_able_to_see_as_a_page_header(String expectedHeader) {
        accountSummary.getAccountTypepageTitle_mtd(expectedHeader);
    }

    @Then("The user should be able to see account types, under the Account Summary")
    public void theUserShouldBeAbleToSeeAccountTypesUnderTheAccountSummary(List<String> expectedList) {
      accountSummary.accountTypeVerification_mtd(expectedList);
    }


    @Then("The user should be able to see with {int} this {string}")
    public void the_user_should_be_able_to_see_with_this(int columnNum, String expectedCreditAccountName) {
       accountSummary.getCreditAccountTable_mtd(columnNum,expectedCreditAccountName);
    }

}
