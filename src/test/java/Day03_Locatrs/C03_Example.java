package Day03_Locatrs;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Example {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/hasan/IdeaProjects/javaPractice" +
        "/kendi calışmalarım/com.team104Project/src/RESORURCES DIRECTORS/DRIVERS/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com/");
        WebElement searchBike=driver.findElement(By.id("twotabsearchtextbox"));
       // WebElement searchBike=driver.findElement(By.className("brand-follow-tooltip-root"));
        searchBike.sendKeys("city bike"+ Keys.ENTER);

      driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div" +
              "/div/div/div/div/div[2]/div/div/div[1]/h2/a/span/text()"));


    }
}
