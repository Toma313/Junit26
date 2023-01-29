package example;

import config.Browsers;
import config.DriverConfig;
import org.openqa.selenium.WebDriver;

public class WebDriverSingletone {
    private static WebDriverSingletone userSingletone;
    private static WebDriver driver;
    public static  WebDriver getSingletone(){
        if (userSingletone==null) {
            driver = DriverConfig.createDriver(Browsers.CHROME);
        } return driver;
    }
}
