import browser.Browser;
import org.testng.annotations.Test;

public class BrowserTest {

    @Test //opens the chrome browser
    public void test1() {
        Browser.setDriver();
    }
}
