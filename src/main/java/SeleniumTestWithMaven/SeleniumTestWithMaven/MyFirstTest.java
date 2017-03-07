package SeleniumTestWithMaven.SeleniumTestWithMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//This is for FireFox Driver.
public class MyFirstTest {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","D:\\IDE\\Sources\\geckodriver.exe");

   WebDriver driver = new FirefoxDriver();
   driver.get("http://www.google.com.hk");
   WebElement element = driver.findElement(By.name("q"));
   element.sendKeys("hello Selenium!");
   element.submit();
   try {
    Thread.sleep(3000);
   } catch (InterruptedException e) {
    e.printStackTrace();
   }
   System.out.println("Page title is: " + driver.getTitle());
   driver.quit();
  }
 }