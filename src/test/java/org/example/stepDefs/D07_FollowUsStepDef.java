package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;
public class D07_FollowUsStepDef {
    P03_homePage links=new P03_homePage();
    @When("user clicks on Facebook Icon")
    public void step1() throws InterruptedException {
        links.FacebookIcon().click();
        driver.switchTo().window(links.handelrs().get(1));
    }
    @Then("Facebook Tab is opened")
    public void facebookTabIsOpened() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }

    @When("user clicks on Twitter Icon")
    public void userClicksOnTwitterIcon() {
        links.TwitterIcon().click();
        driver.switchTo().window(links.handelrs().get(1));
        System.out.println(driver.getCurrentUrl());

    }

    @Then("Twitter Tab is opened")
    public void twitterTabIsOpened() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://twitter.com/nopCommerce");

    }


    @When("user clicks on Rss Icon")
    public void userClicksOnRssIcon() {
        links.rssIcon().click();
        driver.switchTo().window(links.handelrs().get(0));
        System.out.println(driver.getCurrentUrl());

    }

    @Then("rss Tab is opened")
    public void rssTabIsOpened() {

        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
    }

    @When("user clicks on Youtube Icon")
    public void userClicksOnYoutubeIcon() {
        links.YoutubeIcon().click();
        driver.switchTo().window(links.handelrs().get(1));
    }

    @Then("Youtube Tab is opened")
    public void youtubeTabIsOpened() {

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
    }
}
