package hillel.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VukladachPage {
    public static final String vukladachEmailSelector="//div[@class=\"form-field_input\"]/input[@id=\"input-email-mailing\" and @name=\"email\"]";
    @FindBy(xpath = vukladachEmailSelector)
    WebElement inputMail;
    @FindBy(xpath = "//ul[contains(@class,\"block-coaches_list\")]/li")
    List<WebElement> listVukladach;
     public void printListVukladach(){
         for(WebElement l:listVukladach){
             System.out.println(l.findElement(By.tagName("p")).getText());
             System.out.println("               ");
         }
     }
     public int getSizeListVukladach(){
         return listVukladach.size();
     }

}
