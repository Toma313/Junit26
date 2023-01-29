package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaternPageFactory {
    @FindBy(xpath = "someLocator")
    WebElement element1;

    public PaternPageFactory(WebDriver driver) {
        PageFactory.initElements(driver, PaternPageFactory.class);
    }

    public String getText(){
        String str;
        somePrivateMethod();
        str =element1.getText();
        return str;
    }

    private void somePrivateMethod() {
    }
}
