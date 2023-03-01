package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class googleTest {
    WebDriver driver;
    // ilgili kurulumlari tamamlayalim
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));

    }



    // Kullanici https://www.google.com adresine gider

    @Test
    public void googleTest(){
        driver.get("https://www.google.com");





    }


    // Kullanici cookies i kabul eder
    // Arama Kutusuna karsilastirma yapmak istedigi para birimlerini girer
    // Para birimlerinin karsilastirmasini alir
    // Karsilastirilacak olan para biriminin 1.5 den kucuk oldugu test edilir
         @After
    public void tearDown(){
        //driver.close();


         }
}
