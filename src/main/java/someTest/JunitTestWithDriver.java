package someTest;

import config.BaseClass;
import config.Browsers;
import config.DriverConfig;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;


public class JunitTestWithDriver  extends BaseClass {
    By inputYoutube = By.tagName("input");
    @BeforeClass
    public static void startTestInputYoutube(){
        driver.get("https://youtube.com");

    }

    @Test
    public void test1() throws Exception {
        Assert.assertEquals("YouTube", driver.getTitle());
    }
    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(2000);
        //WebElement okButton = new driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
        Thread.sleep(2000);

        WebElement inputElement =driver.findElement(inputYoutube);
        inputElement.sendKeys("Ukraine");
        inputElement.sendKeys(Keys.ENTER);
        System.out.println(driver.getTitle());
    }
    @Test
    public void test3() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]")).click();
        Thread.sleep(4000);
        WebElement element =driver.findElement(By.id("contents"));
        List<WebElement> listElements = (List<WebElement>) element.findElement(By.tagName("img"));
        for(WebElement l:listElements){
            System.out.println(l.getAttribute("scr"));
        }


    }



    }

