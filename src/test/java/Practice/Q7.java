package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q7 {

    public static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterClass
    public static void tearDown(){
        //  driver.close();
    }
    @Test
    public void test01(){
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[text()='Tümünü kabul et']")).click();
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("The Lord of the Rings"+ Keys.ENTER);
        WebElement aramaSonuclari=driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("The Lord of the Rings arama sonucları : "+aramaSonuclari.getText());
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@title='Ara']"))
                .sendKeys("Brave Heart"+Keys.ENTER);
        aramaSonuclari=driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("Brave Heart arama sonuçları : "+aramaSonuclari.getText());
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@title='Ara']"))
                .sendKeys("Harry Potter"+Keys.ENTER);
        aramaSonuclari=driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("Harry Potter arama sonuçları : "+aramaSonuclari.getText());
        driver.close();

}

}
