package day03_xpath_ccSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {

        //  1- bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
       // 3- Browseri tam sayfa yapin
       // 4- Sayfayi “refresh” yapin
       // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
       // 6- Gift Cards sekmesine basin
       // 7- Birthday butonuna basin
       // 8- Best Seller bolumunden ilk urunu tiklayin
       // 9- Gift card details’den 25 $’i secin
       // 10-Urun ucretinin 25$ oldugunu test edin
       // 11-Sayfayi kapatin


        //  1- bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        // 3- Browseri tam sayfa yapin

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        // 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();
        // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin

        String expectedIcerik="Spend less";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("test passed");
        }else{
            System.out.println("Test failed");
        }
        // 6- Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_gc']")).click();
        // 7- Birthday butonuna basin
        driver.findElement(By.cssSelector("a[aria-label='Birthday']")).click();
        // 8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();
        // 9- Gift card details’den 25 $’i secin
        driver.findElement(By.cssSelector("#gc-mini-picker-amount-1")).click();
        // 10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucretElementi  =driver.findElement(By.cssSelector("#gc-live-preview-amount"));

        String expectedUcretIcerigi="25$";
        String actualUcret= ucretElementi.getText();
        if (actualUcret.equals(expectedUcretIcerigi)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed"+
            "\naktuel ucret :"+ actualUcret);
        }
        // 11-Sayfayi kapatin
        driver.close();
    }
}
