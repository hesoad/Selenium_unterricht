package Aufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C07_Ubung_findElements {
    public static void main(String[] args) {
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
        //2- https://www.automationexercise.com/ adresine gidin
       driver.get("https://www.automationexercise.com/");
        //3- Category bolumundeki elementleri locate edin
        driver.findElement(By.xpath("//div[@class='panel-group category-products']"));
        //4- Category bolumunde 3 element oldugunu test edin
        List<WebElement> kategoriSayisi= driver.findElements(By.className("panel-heading"));
        System.out.println(kategoriSayisi.size());
        //5- Category isimlerini yazdirin
        int index=1;
        for (WebElement eachelement:kategoriSayisi) {
            System.out.println(index+"===="+ eachelement.getText());
            index++;
        }
        //6- Sayfayi kapatin
        driver.close();
    }
}
