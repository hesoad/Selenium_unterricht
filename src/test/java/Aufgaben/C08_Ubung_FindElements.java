package Aufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C08_Ubung_FindElements {
    public static void main(String[] args) throws InterruptedException {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");
        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement>linkElementleriListesi= driver.findElements(By.tagName("a"));
        int expectedLinkSayisi=147;
        int actualLinkSayisi=linkElementleriListesi.size();

        if (actualLinkSayisi==expectedLinkSayisi){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed"+
                    "\naktuel link sayisi: "+ actualLinkSayisi);
        }
        //4- Products linkine tiklayin
        driver.findElement(By.cssSelector(".material-icons.card_travel")).click();

        //5- special offer yazisinin gorundugunu test edin
        WebElement offerElementi= driver.findElement(By.id("sale_image"));
        if (offerElementi.isDisplayed()){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test failed");
        }
        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
