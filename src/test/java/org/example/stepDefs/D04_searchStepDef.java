package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;
public class D04_searchStepDef {
    P03_homePage seach=new P03_homePage();
    String KeyWord=null;
    String SKU=null;
    @When("user search by product name {string} and click search button")
    public void userSearchByProductNameAndClickSearchButton(String arg0) {
        seach.SearchBar().sendKeys(arg0);
        KeyWord=arg0;
        seach.SeachBtn().click();
    }


    @Then("verify that number of results more than one & create for loop to check each product name and assert it contains the word used in search")
    public void verifyThatNumberOfResultsMoreThanOneCreateForLoopToCheckEachProductNameAndAssertItContainsTheWordUsedInSearch() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(seach.searchResults().size() >= 1 );
        for (int i=0;i<seach.searchResults().size();i++){
            soft.assertTrue(seach.searchResults().get(i).getText().toLowerCase().contains(KeyWord));
            soft.assertAll();
        }
    }

    @When("user search by sku {string} and click search button")
    public void userSearchBySkuAndClickSearchButton(String arg0) {
        seach.SearchBar().sendKeys(arg0);
        SKU=arg0;
        seach.SeachBtn().click();
    }

    @Then("verify that number of results equal one & open this only search result and assert that sku already exist after opening product detail page")
    public void verifyThatNumberOfResultsEqualOneOpenThisOnlySearchResultAndAssertThatSkuAlreadyExistAfterOpeningProductDetailPage() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(seach.searchResults().size() == 1);
        seach.searchResults().get(0).click();
        soft.assertTrue(seach.SKU().isDisplayed());
        soft.assertAll();
    }
}
