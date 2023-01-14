package Day04_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/hasan/IdeaProjects/javaPractice" +
                "/kendi calışmalarım/com.team104Project/src/RESORURCES DIRECTORS/DRIVERS/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //1- bir class olusturun


        //2- https://www.amazon.com/ adresine gidin

        driver.get("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        //4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String expectedTitle="Spend less";
        String actualTitle= driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("title test passed");}
            else{
                System.out.println("test failed");
            }


        //6- Gift Cards sekmesine basin

        WebElement giftcardButton= driver.findElement(By.xpath(("//*[@data-csa-c-slot-id='nav_cs_2']")));
            giftcardButton.click();

        //7- Birthday butonuna basin
        WebElement birthdayButton= driver.findElement(By.xpath("//img[@alt='Birthday']"));
        birthdayButton.click();

        //8- Best Seller bolumunden ilk urunu tiklayin
        WebElement firstElementAfterClickBirthdayButton= driver.findElement(By.xpath(
                "(//li[@class='a-carousel-card acswidget-carousel__card'])[1]"));
        firstElementAfterClickBirthdayButton.click();

        //9- Gift card details’den 25 $’i secin
        WebElement buttonOf25$= driver.findElement(
                By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]"));
        buttonOf25$.click();

        //10-Urun ucretinin 25$ oldugunu test edin
        WebElement coastIs25$= driver.findElement(By.xpath("//*[@id='gc-live-preview-amount']"));
        String expectedPrice="$25.00";
        if(coastIs25$.getText().equals(expectedPrice)){
        System.out.println("coast test passed");}
            else{
            System.out.println("test failed");
        }

        //11-Sayfayi kapatin
        driver.close();
    }
}
