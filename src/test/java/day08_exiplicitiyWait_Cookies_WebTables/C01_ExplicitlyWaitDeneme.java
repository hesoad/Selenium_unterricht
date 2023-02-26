package day08_exiplicitiyWait_Cookies_WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C01_ExplicitlyWaitDeneme {
    @Test
    public void test01(){



         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //4. Remove butonuna basin.
        driver.findElement(By.xpath("(//button[@autocomplete='off'])[1]")).click();
        //5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        //   explicitly wait kullanacaksak
        //   A - bir wait objesi olustur

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement itsGoneElementi= wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertTrue(itsGoneElementi.isDisplayed());




        driver.close();
    }
}
