package alltests;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePageTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        Browser.setDriver();
        driver = Browser.getDrive();
        driver.navigate().to(Browser.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void Test1() {
        System.out.println("this is a test");
    }

}
