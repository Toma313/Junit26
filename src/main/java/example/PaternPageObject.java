package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaternPageObject {
    private WebDriver driver;

    By someName= By.name("someLocator");
    public PaternPageObject(WebDriver webDriver){
        this.driver=webDriver;
    }

    public String getCourseTitle(){
        String str;
        someMethodPrivate();
        WebElement element1 = driver.findElement(someName);
        str = element1.getText();
        return  str;
    }

    private void someMethodPrivate() {
    }


}
