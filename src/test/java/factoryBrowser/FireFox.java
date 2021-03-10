package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFox implements IBrowser{
    @Override
    public WebDriver create() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "src/test/resources/firefoxDriver/geckodriver.exe");
        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
