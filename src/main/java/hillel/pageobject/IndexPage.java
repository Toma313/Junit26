package hillel.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IndexPage {
    @FindBy(xpath = "//li[contains(@class,\"site-nav-menu_item\") and contains(@class,\" -blog\")]")
    WebElement blogButton;
    @FindBy(xpath = "//li[@class=\"site-nav-menu_item\"]")
    WebElement contacts;
    public void blogButtonClick(){
        blogButton.click();
    }
    public String getBlogButtonText(){
         return blogButton.getText();
    }
    public void contactsButtonClick(){
        contacts.click();
    }
        @FindBy(xpath = "//a[contains(@class,\"header-bar-link\") and @data-city-id=\"dp\"]")
         WebElement dpCity;
        public void dniproClick(){
            dpCity.click();
        }
     }

