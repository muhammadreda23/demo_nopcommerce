package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;
public class D06_homeSlidersStepDef {
P03_homePage sliders=new P03_homePage();
@When("user clicks on nokia lumia slider")
    public void step1(){
    sliders.NokiaSlider().click();
}

@Then("verify that user has navigated to nokia lumia page")
    public void verifyThatUserHasNavigatedToNokiaLumiaPage() {
    Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }

    @When("user clicks on iphone slider")
    public void userClicksOnIphoneSlider() throws InterruptedException {
        Thread.sleep(4000);
        sliders.iphoneSlider().click();
        
    }

    @Then("verify that user has navigated to iphone page")
    public void verifyThatUserHasNavigatedToIphonePage() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
    }
}
