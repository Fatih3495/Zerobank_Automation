package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivity_StepDefs {

    AccountActivity accountActivity = new AccountActivity();

    @And("The user selects the {string} menu")
    public void theUserSelectsTheMenu(String accountName) {
        accountActivity.menuSelectName_mtd(accountName);
    }


    @Then("The user should be see {string} is selected in the Account menu")
    public void the_user_should_be_see_is_selected_in_the_account_menu(String sortType) {
        accountActivity.sortBtn_mtd(sortType);
    }

    @Then("The user should be able to see following {string} in the account box")
    public void the_user_should_be_able_to_see_following_in_the_account_box(List<String> expectedSortList) {
        accountActivity.sortBtnList_mtd(expectedSortList);
    }
    @And("The user should be able to see following options in the account box")
    public void theUserShouldBeAbleToSeeFollowingOptionsInTheAccountBox(List<String> expectedOptions) {
        accountActivity.sortBtnList_mtd(expectedOptions);
    }

    @Then("The user should be able to see {string} with {int}")
    public void the_user_should_be_able_to_see_with(String expectedTransactionTable, int locNumber) {
        accountActivity.transactionsTable_mtd(locNumber, expectedTransactionTable);

    }

}
