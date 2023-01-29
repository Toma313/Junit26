package example;

import example.PaternPageObject;
import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class SomeTest extends BaseClass {
     static PaternPageObject paternPageObject;
     static PaternPageFactory paternPageFactory;
     //static PatternPageFactory PageFactory.init

    @BeforeClass
    public static void someNameMethod(){
        driver.get("some Url");
        paternPageObject =new PaternPageObject(driver);
        paternPageFactory = new PaternPageFactory(driver);
    }
    @Test
    public void Test1(){
        System.out.println(paternPageObject.getCourseTitle());
    }

    @Test
    public void Test2(){
        System.out.println(paternPageFactory.element1.getText());
    }

    @Test
    public void Test3(){
        SingletonePatern singletonePatern =SingletonePatern.getSingletonePatern();

    }
}
