package SeleniumTestWithMaven.SeleniumTestWithMaven;

/**
 * Created by yaoyi on 2017/3/7.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class SearchGoogleTest {
    private WebDriver driver;
    public Google googlePage;
    public GoogleSearchPage searchPage;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","D:\\IDE\\Sources\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
    @Test
    public void testGoogleSearch(){
        googlePage = new Google(driver);
        searchPage = googlePage.goToSearchPage();
        searchPage.getNumberOfResults();
    }
}