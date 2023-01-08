package someTest;

import PageObjects.PracticeForm;
import config.BaseClass;
import data.DataProviderUsers;
import data.User;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PracticeTest extends BaseClass {
    static PracticeForm practiceForm;
    @BeforeClass
    public static void initial(){
        driver.get("https://demoqa.com/automation-practice-form");
        practiceForm= new PracticeForm(driver);
    }
    @After
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
    @Test
    public void test1(){
        practiceForm.setFirstName("Tamara");
    }
    @Test
    public void test2(){
        practiceForm.completeForm("Tamara","Voloshchuk","Tamara@email.com","Female","0123456789");
    }
    @Test
    public void test3(){
        practiceForm.completeForm(new User());
    }
    @Test
    public void test4(){
        practiceForm.completeForm(DataProviderUsers.getValidUser());
    }

}
