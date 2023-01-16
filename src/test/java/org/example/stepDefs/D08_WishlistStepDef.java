package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D08_WishlistStepDef {
    P03_homePage wish=new P03_homePage();
    @When("user clicks on wishButton of any product")
    public void step1(){
        wish.wishlistBtn().get(2).click();
    }

    @Then("verify that success msg bar and it's color appeared")
    public void verifyThatSuccessMsgBarAndItSColorAppeared() {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(wish.NotificationWishBar().isDisplayed());
        soft.assertEquals(wish.NotificationWishBar().getCssValue("background-color"),"rgba(75, 176, 122, 1)");
        soft.assertAll();
    }

    @And("User clicks on Wishlist Button")
    public void userClicksOnWishlistButton() {
        WebDriverWait min=new WebDriverWait(driver, Duration.ofSeconds(10));
        min.until(ExpectedConditions.invisibilityOf(wish.NotificationWishBar()));
        driver.findElement(By.className("wishlist-label")).click();
    }

    @Then("verify that product is displayed in wishlist page")
    public void verifyThatProductIsDisplayedInWishlistPage() {
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(driver.findElement(By.cssSelector("td[class=\"quantity\"] input")).getAttribute("value"),"1");
        soft.assertAll();
    }
}
