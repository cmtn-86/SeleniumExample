import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_001_xyz extends BaseTest{
    @Test
    public void deneme(){
        System.out.println("deneme");
        driver.get("https://www.chess.com/");
        WebElement x= driver.findElement(By.xpath("//*[@id=\"tb\"]/div[2]/a[1]"));
        x.click();
    }
}
