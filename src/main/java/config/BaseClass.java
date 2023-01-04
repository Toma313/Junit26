package config;

import org.openqa.selenium.WebDriver;

public class BaseClass {
    static public WebDriver driver = DriverConfig.createDriver(Browsers.CHROMEINCOGNITO);

}
