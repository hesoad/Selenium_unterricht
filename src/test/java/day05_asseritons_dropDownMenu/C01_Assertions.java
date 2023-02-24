package daye05_asseritons_dropDownMenu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Assertions {
    //1) Bir class oluşturun: YoutubeAssertions



   static WebDriver driver;
    //2) https://www.youtube.com adresine gidin
    @BeforeClass
    public static void beforeClass(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.youtube.com");
        WebElement cookiesKabulButonu= driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape yt-spec-touch-feedback-shape--touch-response-inverse'])[2]"));
        cookiesKabulButonu.click();


    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
    //3) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
    //    ○ titleTest   => Sayfa başlığının “YouTube” oldugunu test edin
    @Test
    public void titleTest(){
        String expectedTittle="YouTube";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(expectedTittle,actualTitle);

    }
    //    ○ imageTest   => YouTube resminin görüntülendiğini (isDisplayed()) test edin
    @Test
    public void imageTest(){
        WebElement image= driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]"));
        Assert.assertTrue(image.isDisplayed());



    }
    @Test
    public void searchBoxTest(){
        //  ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
        WebElement searchBox= driver.findElement(By.xpath("//div[@id='search-input']"));
        Assert.assertTrue(searchBox.isEnabled());
    }
    //    ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
    @Test
    public void wrongTitleTest(){
        String unexpectedBaslik="youtube";
        String actualBaslik= driver.getTitle();
        Assert.assertFalse(actualBaslik.contains(unexpectedBaslik));
    }
}
