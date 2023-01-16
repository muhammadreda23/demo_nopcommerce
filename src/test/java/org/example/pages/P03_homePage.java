package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;
public class P03_homePage {
    public WebElement currencyList(){
        return driver.findElement(By.id("customerCurrency"));
    }
public List<WebElement> checkPrices(){
    return driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
}
public List<WebElement> selectCategory(){
        return driver.findElements(By.cssSelector("ul.top-menu.notmobile > li"));
}
public List<WebElement> computersSubCat(){
return driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"] +div[class=\"sublist-toggle\"] + ul li a"));
}
public List<WebElement> ElecSubCat(){
        return driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/electronics\"] +div[class=\"sublist-toggle\"] + ul li a"));
}
public List<WebElement> ApparelSubCat(){
        return driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"] li:nth-child(3) a+div[class=\"sublist-toggle\"] +ul[class=\"sublist first-level\"] li a"));
    }
public WebElement TitleAfterClick(){
        return driver.findElement(By.cssSelector("div[class=\"page-title\"] h1"));
    }
public WebElement NokiaSlider(){
        return driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child(1)"));
}
public WebElement iphoneSlider(){
        return driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]:nth-child(2)"));
}
public WebElement FacebookIcon(){
        return driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
}

    public WebElement TwitterIcon(){
        return driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }
    public WebElement rssIcon(){
    return driver.findElement(By.cssSelector("li[class=\"rss\"] a"));
    }
    public WebElement YoutubeIcon(){
        return driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
    public ArrayList<String> handelrs(){
         ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
         return tabs;
    }
    public List<WebElement> wishlistBtn(){
        return driver.findElements(By.cssSelector("button[title=\"Add to wishlist\"]"));
    }
    public WebElement NotificationWishBar(){
        return driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement SearchBar(){
        return driver.findElement(By.id("small-searchterms"));
    }
    public WebElement SeachBtn(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public List<WebElement> searchResults(){
        return driver.findElements(By.cssSelector("H2[class=\"product-title\"] a"));
    }
    public WebElement SKU(){
        return driver.findElement(By.id("sku-4"));
    }
    public List<WebElement> links(){
        return driver.findElements(By.cssSelector("ul[class=\"networks\"] a"));
    }
}
