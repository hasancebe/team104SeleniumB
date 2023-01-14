package Day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverGet {
    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.chorome.driver","C:/Users/hasan/IdeaProjects/javaPractice" +
                "/kendi calışmalarım/com.team104Project/src/RESORURCES DIRECTORS/DRIVERS/chromedriver.exe");



        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/tr/");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        driver.close();
    }
}