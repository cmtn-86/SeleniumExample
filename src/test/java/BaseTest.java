import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

@BeforeSuite
    public void setup(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    System.out.println("Test startet");
}
}
