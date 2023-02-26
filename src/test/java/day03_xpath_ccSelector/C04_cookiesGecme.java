package day03_xpath_ccSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_cookiesGecme {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");
        // cookies'i kabul ederek cookies ekranini kapatin
        driver.findElement(By.xpath("//div[text()='Accept all']")).click();
        // arama cubuguna Java yazip aratin
        WebElement aramaCubugu= driver.findElement(By.xpath("//div[@id='result-stats']"));
        aramaCubugu.sendKeys("Java"+ Keys.ENTER);

        // bulunan sonuc sayisinin 100binden cok oldugunu test edin
        WebElement sonucSayisi = driver.findElement(By.xpath("//div[@id='result-stats']"));
        // About 1.350.000.000 results (0,43 seconds)
        String sonucYazisi = sonucSayisi.getText();
        String [] sonucYazisiArr= sonucYazisi.split(" ");

        String sonucsayisiStr= sonucYazisiArr[1];
        sonucsayisiStr= sonucsayisiStr.replace("\\D","");

        int actualSonucSayisi= Integer.parseInt(sonucsayisiStr);
        int expectedSonucSayisi=100000;
        if (actualSonucSayisi>expectedSonucSayisi){
            System.out.println("Arama sonuc sayisi testi PASSED");
        }else {
            System.out.println("Arama sonuc sayisi testi FAILED");
        }
        driver.close();



    }
}
