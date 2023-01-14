package Day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chorome.driver","C:/Users/hasan/IdeaProjects/javaPractice" +
                "/kendi calışmalarım/com.team104Project/src/RESORURCES DIRECTORS/DRIVERS/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        //test if expected URL "https://www.amazon.com" and actual URL are same

        String expectedUrl="https://www.amazon.com/";

        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("URL test passed");}
        else {
            System.out.println("URL test failed");
            System.out.println("expected URl "+ expectedUrl);
            System.out.println("actual URL "+actualUrl);
        }


        //test if the title contains "amazon" keyword


        String expectedTitle="Amazon";
        String actulaTitle=driver.getTitle();

        if(actulaTitle.contains(expectedTitle)){
            System.out.println("title test passed");}
        else{
            System.out.println("title test failed");
            System.out.println(driver.getTitle());
        }

        Thread.sleep(7000);

        driver.close();
    }

}
