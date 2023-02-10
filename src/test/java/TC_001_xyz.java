import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_001_xyz extends BaseTest{
    @Test
    public void deneme(){
        System.out.println("deneme");
        driver.get("https://www.chess.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement x= driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/section[1]/div[2]/div[2]/form/button/div[2]/div[1]"));
        x.click();
        System.out.println("deneme");
    }
}