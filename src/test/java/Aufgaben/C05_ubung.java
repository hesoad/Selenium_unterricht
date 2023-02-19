package Aufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ubung {
    public static void main(String[] args) {

        //1.Yeni bir class olusturalim (Homework)
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
        //(title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
        //yazdirin.
        driver.get("https://www.facebook.com");
        String expectetTittle= "facebook";
        String actualTittle= driver.getTitle();

        if (actualTittle.equals(expectetTittle)){
            System.out.println("Baslik facebook gelimeisni iceriyor");
        }else{
            System.out.println("Facebook icermiyor test failed"+
            "\ngerceklesen title: "+ actualTittle);
        }
        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        //“actual” URL’i yazdirin.

        String expectedUrl= "facebook";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed"+
            "\naktuel url: "+ actualUrl);
        }
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedIcerik ="Walmart.com";
        String actualIcerik= driver.getTitle();

        if (actualIcerik.contains(expectedIcerik)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed"+
                    "\naktuel baslik : "+actualIcerik);
        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.Browser’i kapat
       driver.close();
    }
}
