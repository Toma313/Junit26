package someTest;

import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestPracticeForm extends BaseClass {
    @BeforeClass
    public static void initPage(){
        driver.get("https://demoqa.com/text-box");
    }
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Name");
        driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("NameEmail@domen.com");
        driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Odesa, Deribasovska str");
        driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("permanentAddress");
        Thread.sleep(4000);


    }
}
