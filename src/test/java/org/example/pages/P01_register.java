package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.example.stepDefs.Hooks.driver;
public class P01_register {
public WebElement regBtn(){
    return driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
}
public WebElement SelectGender(){
    return driver.findElement(By.id("gender-male"));
}
public WebElement firstName(){
    return driver.findElement(By.id("FirstName"));
}
public WebElement lastName (){
    return driver.findElement(By.id("LastName"));
}
public WebElement Day(){
    return driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
}

    public WebElement Month(){
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
    }

    public WebElement Year(){
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
    }
    public WebElement Email(){
    return driver.findElement(By.id("Email"));
    }
    public  WebElement Password(){
    return driver.findElement(By.id("Password"));
    }
    public  WebElement confirmPassword(){
        return driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement Click(){
    return driver.findElement(By.id("register-button"));
    }
    public WebElement displaymsg(){
    return driver.findElement(By.className("result"));
    }
    public WebElement CSSValue(){
    return driver.findElement(By.className("result"));
    }

}
