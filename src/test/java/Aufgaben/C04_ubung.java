package Aufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ubung {
    public static void main(String[] args) {

        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get(" https://www.amazon.com/");
        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Ilk Size : "+driver.manage().window().getSize());
        System.out.println("ilk position : "+driver.manage().window().getPosition());
        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin

        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(40,100));

        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        System.out.println("Size : "+driver.manage().window().getSize());
        System.out.println("position : "+driver.manage().window().getPosition());
        //8. Sayfayi kapatin
        driver.close();



    }

}
