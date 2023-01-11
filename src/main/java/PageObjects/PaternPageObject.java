package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaternPageObject {
    private WebDriver driver;

    By someName= By.name("someLocator");
    public PaternPageObject(WebDriver webDriver){
        this.driver=webDriver;
    }
    public String getCourseTitle(){
        return driver.findElement(someName).getText();
    }
}
