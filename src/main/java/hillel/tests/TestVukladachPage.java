package hillel.tests;

import Util.Scrolling;
import config.BaseClass;
import hillel.pageobject.VukladachPage;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class TestVukladachPage extends BaseClass {
    static VukladachPage vukladachPage= PageFactory.initElements(driver,VukladachPage.class);
    String url = "https://online.ithillel.ua/coaches";
    @Before
    public void setUpBeforeTestVukladachPage(){
        if (!driver.getCurrentUrl().contains(url)) {
            driver.get(url);
        }
    }
    @Test
    public void test1() throws InterruptedException {
        int a=0;
        while(true){
            if(vukladachPage.getSizeListVukladach()>a){
                a= vukladachPage.getSizeListVukladach();
                Scrolling.scroll(driver);
                Thread.sleep(1000);
            }else {
                break;
            }
        }
        vukladachPage.printListVukladach();
    }
}
