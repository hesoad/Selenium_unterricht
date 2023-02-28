package Aufgaben;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C14_Aufgabe extends TestBase {

    @Test
    public void test01(){
        //1 ) https://the-internet.herokuapp.com/iframe adresine gidin.
        //2 ) Bir metod olusturun: iframeTest
        driver.get("https://the-internet.herokuapp.com/iframe");
        //- “An IFrame containing….” textinin erisilebilir oldugunu test edin ve
        //konsolda yazdirin.
        WebElement containing=driver.findElement(By.tagName("h3"));
        Assert.assertTrue(containing.isEnabled());
        System.out.println(containing.getText());
        //- Text Box’a “Merhaba Dunya!” yazin.
        WebElement iframeElementi= driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(iframeElementi);
        driver.findElement(By.tagName("p")).sendKeys(" Merhaba Dunya!");
        driver.switchTo().parentFrame();
        //- TextBox’in altinda bulunan “Elemental Selenium” linkini textinin
        //gorunur oldugunu dogrulayin ve konsolda yazdirin.
        WebElement elementelSelenium= driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(elementelSelenium.isDisplayed());
        System.out.println(elementelSelenium.getText());
    }
}