package Day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_windowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/hasan/IdeaProjects/javaPractice" +
                "/kendi calışmalarım/com.team104Project/src/RESORURCES DIRECTORS/DRIVERS/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().window().minimize();

        Thread.sleep(3000);

        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());


        driver.quit();
    }
}
