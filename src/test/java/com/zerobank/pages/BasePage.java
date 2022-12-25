package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id="account_summary_tab")
    public WebElement accountSummary_loc;

    @FindBy(id="account_activity_tab")
    public WebElement accountActivity_loc;

    @FindBy(id="pay_bills_tab")
    public WebElement payBills_loc;

}
