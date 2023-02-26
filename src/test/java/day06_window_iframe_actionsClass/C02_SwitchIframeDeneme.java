package day06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_SwitchIframeDeneme extends TestBase {

    @Test
    public void test01(){

        driver.get("https://the-internet.herokuapp.com/iframe");
        // "Your content goes here." yazisinin gorunur oldugunu test edin
        WebElement frameElementi= driver.findElement(By.id("mce_0_ifr"));




        WebElement yaziElementi= driver.findElement(By.tagName("p"));
        Assert.assertTrue(yaziElementi.isDisplayed());

        // Elemental Selenium linkine click yapin

        driver.switchTo().parentFrame(); //icice frame'lerde bir ust seviyeye cikar
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Elemental Selenium")).click();

   bekle(4);


    }

}
