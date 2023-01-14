package Day04_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/hasan/IdeaProjects/javaPractice" +
                "/kendi calışmalarım/com.team104Project/src/RESORURCES DIRECTORS/DRIVERS/chromedriver.exe");

        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna basin

        WebElement addButton= driver.findElement(By.xpath("//button[text()='Add Element]"));
        addButton.click();


        //3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButton=driver.findElement(By.xpath("//button[text()='Delete']"));
       if( deleteButton.isDisplayed());
        System.out.println("delete butonu gözüküyor");

        //4- Delete tusuna basin
        deleteButton.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        driver.close();
    }
}
