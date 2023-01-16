package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;
public class D03_currenciesStepDef {
    P03_homePage home=new P03_homePage();
    @When("user select euro currency")
    public void Step1(){
        Select dropdown=new Select(home.currencyList());
        dropdown.selectByVisibleText("Euro");
    }
    @Then("euro sympole is displayed")
    public void step2(){
        SoftAssert soft=new SoftAssert();
        // size = 4
        for (int i=0;i<home.checkPrices().size();i++) {
        String actual=home.checkPrices().get(i).getText();
        soft.assertTrue(actual.contains("€"));
        }
    }

}
