package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummary extends BasePage{

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement usernameBtn_loc;

    @FindBy(id = "logout_link")
    public WebElement logoutBtn_loc;

    @FindBy(xpath = "//a[@class='brand']")
    public WebElement zeroBank_loc;

    @FindBy(xpath = "//a[text()='Account Summary']")
    public WebElement accountSummaryTab_loc;

    @FindBy(xpath = "//h2[@class='board-header']")
    public List<WebElement> underAccountSummary_loc;

    public String getAccountName_mtd(String accountType){

        return Driver.get().findElement(By.xpath("//h2[text()='"+accountType+"']")).getText();

}
    public void getCreditAccountTable_mtd(int columnNum, String expectedCreditAccountName ){

        String actualName= Driver.get().findElement(By.xpath("(//thead)[3]/tr/th["+columnNum+"]")).getText();
        System.out.println("actualName = " + actualName);
        Assert.assertEquals("Credit Account name is NOT match",expectedCreditAccountName, actualName);
    }

    public void accountTypeVerification_mtd(List<String> expectedList){
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
        List<String> actualList = BrowserUtils.getElementsText(underAccountSummary_loc);
        System.out.println("actualList.size() = " + actualList.size());
        System.out.println("actualList = " + actualList);
        Assert.assertEquals("Account types following menu is NOT visible",expectedList,actualList);

    }
}
