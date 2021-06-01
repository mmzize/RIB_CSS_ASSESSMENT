package Functionality;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Drag_And_Drop_Image_To_Trash {
    private WebDriver driver;

    public Drag_And_Drop_Image_To_Trash(WebDriver driver)
    {
        this.driver=driver;
    }

    public void Drag_And_Drop_Image() {
        driver.switchTo().frame(0);

        WebElement From = driver.findElement(By.cssSelector(".ui-widget-content:nth-child(1) > img"));
        WebElement To = driver.findElement(By.id("trash"));
        Actions act=new Actions(driver);
        act.dragAndDrop(From, To).build().perform();
    }
}
