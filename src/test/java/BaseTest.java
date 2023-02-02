import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    WebDriver driver = new ChromeDriver();

@BeforeSuite
    public void setup(){
    System.out.println("Test startet");
}
@AfterSuite
public void tearDown(){
    System.out.println("TearDown");
    driver.quit();
}
}
