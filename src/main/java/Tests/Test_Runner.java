package Tests;

import Functionality.Drag_And_Drop_Image_To_Trash;
import Functionality.Sample_Page_Test;
import Functionality.Select_By_Country;
import Helpers.Scroll_To_The_Bottom_Of_The_Page;
import Helpers.Setup_Class;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test_Runner {


    private WebDriver driver = Setup_Class.startBrowserOfChoice("http://www.globalsqa.com/demo-site/draganddrop/", "chrome");
    public Test_Runner() throws InterruptedException {
    }
    @Test
    public void Drag_And_Drop_Tests() {
        Drag_And_Drop_Image_To_Trash drag_and_drop_image_to_trash=new Drag_And_Drop_Image_To_Trash(driver);
        drag_and_drop_image_to_trash.Drag_And_Drop_Image();
    }
    @Test
    public void Select_By_Country_Test() throws InterruptedException {
        Select_By_Country country=new Select_By_Country(driver);
        country.Click_Dropdown_Menu_And_Select_Country("Aruba");
    }
    @Test
    public void Enter_Details_Tests() {
        Sample_Page_Test sample_page_test=new Sample_Page_Test(driver);
        Scroll_To_The_Bottom_Of_The_Page scroll_to_the_bottom_of_the_page=new Scroll_To_The_Bottom_Of_The_Page(driver);
        scroll_to_the_bottom_of_the_page.Scroll_Down();
        sample_page_test.Enter_Details();
        scroll_to_the_bottom_of_the_page.Scroll_Down_2();

    }
}
