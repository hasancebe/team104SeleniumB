package Day03_Locatrs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_LocateByName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hasan/IdeaProjects/javaPractice" +
                "/kendi calışmalarım/com.team104Project/src/RESORURCES DIRECTORS/DRIVERS/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://amazon.com/");

       WebElement amazonTextBox=driver.findElement(By.name("field-keywords"));
        amazonTextBox.sendKeys("nutella"+ Keys.ENTER);

       List<WebElement>searchList= driver.findElements(By.className("a-price-whole"));
        System.out.println("listenin boyutu "+searchList.size());
        List<Integer>searchlistNumeric=new ArrayList<>();
        for (WebElement each:searchList) {
            System.out.print(each.getText()+ " ");
            searchlistNumeric.add(Integer.parseInt(each.getText()));
        }
        Collections.sort(searchlistNumeric);
        System.out.println();
        System.out.println(searchlistNumeric);

        System.out.println(searchlistNumeric.get(searchlistNumeric.size()-1
        ));

driver.close();


    }
}
