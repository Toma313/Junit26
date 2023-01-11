package hillel.tests;

import Util.Scrolling;
import config.BaseClass;
import hillel.pageobject.BlogPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class TestBlogPage extends BaseClass {
    static BlogPage blogPage= PageFactory.initElements(driver,BlogPage.class);
    String mailUrl ="https://blog.ithillel.ua/publications/backend";
    @Before
    public void setUpBeforeTestBlogScreen() {
        if (!driver.getCurrentUrl().contains(mailUrl)) {
            driver.get(mailUrl);
        }
    }
    @Test
    public void test1() throws InterruptedException {
        int i = 0;
        while(true){
            if(blogPage.getSizeListNews()>i){
                i= blogPage.getSizeListNews();
                Scrolling.scroll(driver);
                Thread.sleep(1000);
            }else{
                break;
            }
        }
        blogPage.printListNews();
    }


}
