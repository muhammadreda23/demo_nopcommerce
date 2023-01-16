package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;
public class P02_signin {
    public WebElement gologin(){
        return driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement enterEmail(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement enterPassword(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement loginBtn(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement logoutBtn(){
        return driver.findElement(By.cssSelector("a[class=\"ico-logout\"]"));
    }
    public WebElement invalidlogin(){
        return driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
