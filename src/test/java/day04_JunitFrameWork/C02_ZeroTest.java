package day04_JunitFrameWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ZeroTest {
    /*
    1. http://zero.webappsecurity.com sayfasina gidin
    2. Signin buttonuna tiklayin
    3. Login alanine  “username” yazdirin
    4. Password alanine “password” yazdirin
    5. Sign in buttonuna tiklayin
    6. Pay Bills sayfasina gidin
    7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
    8. tarih kismina “2020-09-10” yazdirin
    9. Pay buttonuna tiklayin
    10. “The payment was successfully submitted.” mesajinin ciktigini test edin

     */
    @Test
    public  void test01(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1. http://zero.webappsecurity.com sayfasina gidin

        driver.get("http://zero.webappsecurity.com");


        //2. Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button"));

        //3. Login alanine  “username” yazdirin

        driver.findElement(By.id("user_login")).sendKeys("username");

        // 4. Password alanine “password” yazdirin
        driver.findElement(By.id("user_password")).sendKeys("password");

        //5. Sign in buttonuna tiklayin

        driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/input")).click();

        driver.navigate().back();

        // 6. Pay Bills sayfasina gidin

        driver.findElement(By.xpath("//strong[text()=‘Online Banking’]")).click();

        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin

        driver.findElement(By.id("sp_date")).sendKeys("200");

        //8. tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.id("sp_date")).sendKeys("22-12-2002");

        //9. Pay buttonuna tiklayin

        driver.findElement(By.id("pay_saved_payees")).click();

        //10. “The payment was successfully submitted.” mesajinin ciktigini test edin

        WebElement mesajElementi= driver.findElement(By.id("\"alert_content\""));

        if (mesajElementi.isDisplayed()){
            System.out.println("test passe");
        }else{
            System.out.println("Test failled ");
        }

        driver.close();

    }


}
