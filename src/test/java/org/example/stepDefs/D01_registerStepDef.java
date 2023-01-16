package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;

import static org.example.stepDefs.Hooks.driver;
public class D01_registerStepDef {
    P01_register reg=new P01_register();
    @Given("user go to register page")
    public void step1(){
        /* بنعمل new class من نوع P01_register
        بنادي على ال method اللي جواه اللي انا حاططها هناك عن طريق ال class اللي انا عرفته
        */
        reg.regBtn().click();
    }
    @When("user select gender type")
    public void userSelectGenderType() {
        reg.SelectGender().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        reg.firstName().sendKeys(arg0);
        reg.lastName().sendKeys(arg1);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        //Day
        Select days=new Select(reg.Day());
        int random=(int)Math.floor(Math.random()*(30-1+1)+1);
        days.selectByValue(String.valueOf(random));
        //Month
        Select month=new Select(reg.Month());
        month.selectByVisibleText("April");
        //Year
        Select year=new Select(reg.Year());
        year.selectByVisibleText("1997");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String arg0) {
        reg.Email().sendKeys(arg0);
    }

    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String arg0, String arg1) {
        reg.Password().sendKeys(arg0);
        reg.confirmPassword().sendKeys(arg1);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        reg.Click().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert myassertion=new SoftAssert();
        myassertion.assertTrue(reg.displaymsg().isDisplayed());
        myassertion.assertEquals(reg.CSSValue().getCssValue("color"),"rgba(76, 177, 124, 1)");
        myassertion.assertAll();
    }
}
