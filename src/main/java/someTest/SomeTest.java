package someTest;

import PageObjects.PaternPageObject;
import PageObjects.PatternPageFactory;
import config.BaseClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class SomeTest extends BaseClass {
     static PaternPageObject paternPageObject;
     //static PatternPageFactory PageFactory.init

    @BeforeClass
    public static void someNameMethod(){
        driver.get("some Url");
        paternPageObject =new PaternPageObject(driver);
    }
    @Test
    public void Test1(){
        System.out.println(paternPageObject.getCourseTitle());
    }
}
