package hillel.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BlogPage {
     public static final  String  emailSelector= "//div[@class=\"form-field_input\"]/input[@id=\"input-email-mailing\" and @name=\"email\"]";
     @FindBy(xpath = emailSelector)
     WebElement inputMail;
     @FindBy(xpath = "//ul[contains(@class,\"post-list\")]/li")
             //"//ul[@class=\"publications_list post-list\"]/li")
    List<WebElement> listNews;

    public void printListNews() {
        for(WebElement l:listNews){
            System.out.println(l.findElement(By.tagName("a")).getText());
            System.out.println(l.findElement(By.tagName("a")).getAttribute("href"));
            System.out.println("               ");
        }
    }
    public int getSizeListNews(){
        return listNews.size();
    }
}
