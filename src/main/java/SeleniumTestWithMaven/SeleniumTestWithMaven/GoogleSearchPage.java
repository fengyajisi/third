package SeleniumTestWithMaven.SeleniumTestWithMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/**
 * Created by yaoyi on 2017/3/7.
 */
public class GoogleSearchPage {
    private WebDriver driver;
    public GoogleSearchPage(WebDriver driver){
        this.driver = driver;
        System.out.println(driver.getTitle());
        if (!driver.getTitle().equals("Mastering Selenium Testing Tools - Google Search")){
            throw new WrongPageException("Incorrect page for Google Search page");
        }
    }
    public String getNumberOfResults(){
        String numberOfResults = driver.findElement(By.id("resultStats")).getText();
        System.out.println(numberOfResults);
        return  numberOfResults;
    }
}