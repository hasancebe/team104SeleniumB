package Day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/hasan/IdeaProjects/javaPractice" +
                "/kendi calışmalarım/com.team104Project/src/RESORURCES DIRECTORS/DRIVERS/chromedriver.exe");


        WebDriver driver=new ChromeDriver();

        Thread.sleep(5000);
// maximize
        driver.manage().window().maximize();
        System.out.println("maximize "+driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

//fullscreen
        driver.manage().window().fullscreen();
        System.out.println("full screen "+driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

//change size position
        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setSize(new Dimension(500,500));
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.close();
    }
}
