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
        BrowserUtils.waitFor(3);
        String actualHeader= Driver.get().getTitle();
        System.out.println("actualHeader = " + actualHeader);
        Assert.assertEquals("Headers are NOT match", expectedHeader,actualHeader);

    }
    @Then("The user should be able to see {string} in Account Summary page")
    public void the_user_should_be_able_to_see_in_account_summary_page(String expectedAccountTypes) {

        String actualText= accountSummary.getAccountName_mtd(expectedAccountTypes);
        Assert.assertEquals("Account type is NOT match", expectedAccountTypes,actualText);

    }

    @Then("The user should be able to see with {int} this {string}")
    public void the_user_should_be_able_to_see_with_this(int columnNum, String expectedCreditAccountName) {

        String actualName= accountSummary.getCreditAccountTable_mtd(columnNum);
        //System.out.println("actualName = " + actualName);
        Assert.assertEquals("Credit Account name is NOT match",expectedCreditAccountName, actualName);
    }

}
