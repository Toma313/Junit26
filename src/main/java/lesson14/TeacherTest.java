package lesson14;

import config.BaseClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TeacherTest extends BaseClass {
     static PageTeacher teather;
    @BeforeClass
    public static void stest(){
        driver.get("https://ithillel.ua/coaches");
        teather = PageFactory.initElements(driver, PageTeacher.class);
    }
    @Test
    public void test1(){
        teather.printList();
    }
}
