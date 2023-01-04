package someTest;

import config.BaseClass;
import config.Browsers;
import config.DriverConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class JunitTestWithDriver  extends BaseClass {
    By inputYoutube = By.tagName("input");
    @BeforeClass
    public static void startTestInputYoutube(){
        driver.get("https://youtube.com");

    }

    @Test
    public void test1(){
        if("YouTube".equals((driver.getTitle()))){
            System.out.println("OK "+driver.getTitle());
        }
        else{
            System.out.println("Error "+driver.getTitle());
        }
    }
    @Test
    public void test2(){
//        WebElement inputElement =driver.findElement(inputYoutube);
//        inputElement.sendKeys("Ukraine");
//        inputElement.submit();
//        inputElement.sendKeys(Keys.ENTER);
//        System.out.println(driver.getTitle());
    }
    @Test
    public void test3(){

    }



    }

