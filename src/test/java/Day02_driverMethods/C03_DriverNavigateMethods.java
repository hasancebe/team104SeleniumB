package Day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverNavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/hasan/IdeaProjects/javaPractice" +
                "/kendi calışmalarım/com.team104Project/src/RESORURCES DIRECTORS/DRIVERS/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com/");// same to get method
        Thread.sleep(6000);

        driver.navigate().to("https://wisequarter.com");
        Thread.sleep(6000);

        driver.navigate().back();

        driver.navigate().refresh();
        driver.close();

    }
}
