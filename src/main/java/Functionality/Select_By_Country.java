package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Select_By_Country {

    private WebDriver driver;

    public Select_By_Country(WebDriver driver)
    {
        this.driver=driver;
    }
    public void Click_Dropdown_Menu_And_Select_Country(String Country) throws InterruptedException {

        WebElement Menu = driver.findElement(By.cssSelector("#menu-item-2803 .link_span"));
        Menu.click();
        WebElement Countries = driver.findElement(By.cssSelector("select"));
        Select countries=new Select(Countries);
        countries.selectByVisibleText(Country);
    }
}
