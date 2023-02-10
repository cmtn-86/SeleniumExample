import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    WebDriver driver ;




    @BeforeSuite
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        System.out.println("Test startet");
        driver=new FirefoxDriver();
    }
    @AfterSuite
    public void tearDown(){
        System.out.println("TearDown");
        driver.quit();
        /////////
        ///

        ///asdasd
    }
}