package example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSingletone {
    static WebDriver driver;
    @Before
    public void btest(){
        driver = WebDriverSingletone.getSingletone();
    }
    @Test
    public void test1(){
        System.out.println("test");
    }
    @Test
    public void test2(){
        System.out.println("test");
    }
    @Test
    public void test3(){
        System.out.println("test");
    }

}
