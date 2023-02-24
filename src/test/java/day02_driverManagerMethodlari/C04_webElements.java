package daye02_driverManagerMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_webElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasina gidin,
        driver.get("https://www.amazon.com");


        // arama kutusuna locate edip bir webelement olarak kaydedin,
        // id 'si twotabsearchtextbox olan webelementi locate edecegiz
        /*
        Driver'a webelementi tarif etme islemine locate,
        bu tarifi yapabilmek icin kullanabilecegim degiskenlere de locator denir

        8 tane Locater vardir; Locaterlarin 6 tanesi webelementin ozelliklerine baglidir
        -id
        -classname
        -name
        -tagname
        -linktext
        -partialLinkText
        Geriye kalan 2 locator ise her türlü webelementi locate etmek icin kullanilabilir.
        -xpath
        -cssSelector

         */
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));
        // aramama kutusunu "Nutella" yazip aratin

        aramakutusu.sendKeys("nutella");
        aramakutusu.submit();

        Thread.sleep(3000);
        driver.close();

    }
}
