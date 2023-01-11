package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PatternPageFactory {
    @FindBy(xpath = "someelement")
    WebElement element1;

    public String getText(){
        String str;
        str=element1.getText();
        return str;
    }
     private void somePrivateMethod(){

     }

}
