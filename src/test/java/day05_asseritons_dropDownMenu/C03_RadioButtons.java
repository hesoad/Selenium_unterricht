package day05_asseritons_dropDownMenu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RadioButtons {





           //Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.

  WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));



    }
    @After
    public void tearDown(){
      driver.close();
    }
    //  a. Verilen web sayfasına gidin.
    //       https://facebook.com
    //  b. Cookies’i kabul edin

    @Test
    public void test01(){
        driver.get("https://facebook.com");
     driver.findElement(By.xpath("//button[text()='Temel ve isteğe bağlı çerezlere izin ver']")).click();

        //  c. Create an account buton’una basin
        driver.findElement(By.xpath("//*[text()='Yeni hesap oluştur']")).click();
        //  d. Radio button elementlerini locate edin ve size uygun olani secin
        WebElement kadin =driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        WebElement erkek =driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        WebElement ozel =driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
        erkek.click();

        //  e. Sectiginiz radio butoon'un secili, otekilerin ise secili olmadigini test edin

        Assert.assertTrue(erkek.isSelected());
        Assert.assertFalse(kadin.isSelected());
        Assert.assertFalse(ozel.isSelected());

    }


}
