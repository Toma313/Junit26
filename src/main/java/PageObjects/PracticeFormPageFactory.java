package PageObjects;

import data.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPageFactory {
    @FindBy(id="firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement email;
    @FindBy(xpath = "//div[contains(@class,\"custom-control\") ]/label[contains(@for,\"gender-radio\")]")
    List<WebElement> listGenders;
    @FindBy(id = "userNumber")
    WebElement userNumber;
//class="subjects-auto-complete__menu-list subject-auto-complete__menu-list--is-multi css-11unzqr"
    @FindBy(id = "subjectsInput")
    WebElement subjectInput;
    @FindBy(xpath = "//div[contains(@id,\"react-select-2-option\")]")
    List<WebElement> subjectsList;


    public void sendSubject(String subjectName){
        subjectInput.sendKeys(subjectName);
        for(WebElement l:subjectsList){
            if (l.getText().equals(subjectName)) {
                l.click();
            }
        }
    }


    public PracticeFormPageFactory(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void completeForm(User usr, String subjectName) {
        completeForm(usr);
        sendSubject(subjectName);
    }

    public void completeForm(User ur) {
        firstName.sendKeys(ur.getName());
        lastName.sendKeys(ur.getLastName());
        email.sendKeys(ur.getEmail());
        selectGender(ur.getGender());
        userNumber.sendKeys(ur.getTelephone());
    }

    private void selectGender(String gender) {
        for(WebElement l :listGenders){
            if(l.getText().equals(gender)){
                l.click();
            }
        }
    }


}
