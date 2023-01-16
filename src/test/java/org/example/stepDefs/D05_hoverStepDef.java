package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Random;

import static org.example.stepDefs.Hooks.driver;
public class D05_hoverStepDef {
    P03_homePage hover=new P03_homePage();
    Random rand=new Random();
    int R=rand.nextInt(3);
    String Text=null;
    @When("user hover random category")
    public void step1(){
        Actions hovering=new Actions(driver);
        hovering.moveToElement(hover.selectCategory().get(R)).perform();
    }
    @And("Select Random Subcategory")
    public void selectRandomSubCat(){
        if(R == 0){
            R= rand.nextInt(3);
            Text=hover.computersSubCat().get(R).getText();
            hover.computersSubCat().get(R).click();
        } else if (R==1) {
            R= rand.nextInt(3);
            Text=hover.ElecSubCat().get(R).getText();
            hover.ElecSubCat().get(R).click();
        }
        else {
            R= rand.nextInt(3);
            Text=hover.ApparelSubCat().get(R).getText();
            hover.ApparelSubCat().get(R).click();
        }
    }

    @Then("verify Subcategories is displayed & the title is correct")
    public void verifySubcategoriesIsDisplayed() {
        SoftAssert soft=new SoftAssert();
        String subCatTitle=Text.toLowerCase().trim();
        String title=hover.TitleAfterClick().getText().toLowerCase().trim();
        Assert.assertTrue(hover.TitleAfterClick().isDisplayed());
        Assert.assertEquals(subCatTitle,title);

    }
}
