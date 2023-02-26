package day05_asseritons_dropDownMenu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C04_DropdownMenu {

    //● https://www.amazon.com/ adresine gidin.
    //- Test 1
    //  Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin
    //-Test 2
    //  1. Kategori menusunden Books secenegini  secin
    //  2. Arama kutusuna Java yazin ve aratin
    //  3. Bulunan sonuc sayisini yazdirin
    //  4. Sonucun Java kelimesini icerdigini test edin
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
    }
    @AfterClass
    public static void teardown(){
      driver.close();
    }
    @Test
    public void test01(){
        //  Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin

        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
       int actualoptionsSayisi= select.getOptions().size();
       int expectetOptionsSayisi=45;

        Assert.assertEquals(expectetOptionsSayisi,actualoptionsSayisi);




    }
    @Test
    public void test02(){
        //-Test 2
        //  1. Kategori menusunden Books secenegini  secin
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Books");
        //  2. Arama kutusuna Java yazin ve aratin
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Java" + Keys.ENTER);
        //  3. Bulunan sonuc sayisini yazdirin
        WebElement sonucYazisi= driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        System.out.println(sonucYazisi.getText());

        //  4. Sonucun Java kelimesini icerdigini test edin
        String expectedIcerik= "Java";
        String actualSonucYazisi= sonucYazisi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }
}
