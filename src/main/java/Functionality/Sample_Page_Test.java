package Functionality;

import org.apache.poi.ss.formula.functions.Na;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample_Page_Test {

    private WebDriver driver;

    public Sample_Page_Test(WebDriver driver)
    {
        this.driver=driver;
    }

    public void Enter_Details()
    {
        WebElement Sample=driver.findElement(By.cssSelector("#menu-item-2818 .link_span"));
        Sample.click();
        WebElement Name = driver.findElement(By.id("g2599-name"));
        Name.sendKeys("Mandla");
        Name.sendKeys(Keys.TAB);
        WebElement Email=driver.findElement(By.id("g2599-email"));
        Email.sendKeys("mmzize@gmail.com");
        WebElement website =driver.findElement(By.id("g2599-website"));
        website.sendKeys("https://www.test.com");
        WebElement years=driver.findElement(By.id("g2599-experienceinyears"));
        Select select_years=new Select(years);
        select_years.selectByVisibleText("5-7");
        WebElement expertise=driver.findElement(By.cssSelector(".grunion-checkbox-multiple-label:nth-child(4) > .checkbox-multiple"));
        expertise.click();
        WebElement education =driver.findElement(By.name("g2599-education"));
        education.click();

        WebElement comment =driver.findElement(By.id("contact-form-comment-g2599-comment"));
        comment.sendKeys("Mandla is Testing");

        WebElement submit=driver.findElement(By.cssSelector(".pushbutton-wide"));
        submit.click();



    }
}
