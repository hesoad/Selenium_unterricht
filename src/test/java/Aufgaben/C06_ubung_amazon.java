package Aufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_ubung_amazon {
    public static void main(String[] args) throws InterruptedException {
        //1. Yeni bir class olusturun (TekrarTesti)
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String expectedtitle= "youtube";
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedtitle)){
            System.out.println("test passed");
        }else{
            System.out.println("test failed"+
                    "\naktuel baslik: "+ actualTitle);
        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.
        String expectetUrl= "youtube";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectetUrl)){
            System.out.println("test passed");
        }else{
            System.out.println("Test faile"+
                    "Aktuel url : "+ actualUrl);
        }

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        //Yoksa doğru başlığı(Actual Title) yazdırın.

        String expectedAmazonBaslik= "Amazon";
        String actuelBaslik= driver.getTitle();

        if (expectedAmazonBaslik.contains(actuelBaslik)){
            System.out.println("test passed");
        }else {
            System.out.println("tets failed"+
                    "\naktuel baslik: "+actuelBaslik);
        }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse
        //doğru URL'yi yazdırın
        String expectetUrlama= "https://www.amazon.com";
        String actualUrlama = driver.getCurrentUrl();
        if (actualUrlama.contains(expectetUrlama)){
            System.out.println("test passed");
        }else{
            System.out.println("Test failed"+
                    "Aktuel url : "+ actualUrlama);
        }
        //11.Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
