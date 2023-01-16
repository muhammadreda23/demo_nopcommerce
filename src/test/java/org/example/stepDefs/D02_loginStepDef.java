package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_signin;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;
public class D02_loginStepDef {
    P02_signin sign=new P02_signin();
    @Given("user go to login page")
    public void step1(){
        sign.gologin().click();
    }

    @When("user login with valid Email {string} and {string}")
    public void userLoginWithValidEmailAnd(String arg0, String arg1) {
        sign.enterEmail().sendKeys(arg0);
        sign.enterPassword().sendKeys(arg1);

    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        sign.loginBtn().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        Assert.assertTrue(sign.logoutBtn().isDisplayed());
    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String arg0, String arg1) {
        sign.enterEmail().sendKeys(arg0);
        sign.enterPassword().sendKeys(arg1);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert checking=new SoftAssert();
        String md=sign.invalidlogin().getText();
        checking.assertTrue(md.contains("Login was unsuccessful"));
        String color=sign.invalidlogin().getCssValue("color");
        checking.assertEquals(color,"rgba(228, 67, 75, 1)");
        checking.assertAll();
    }
}
