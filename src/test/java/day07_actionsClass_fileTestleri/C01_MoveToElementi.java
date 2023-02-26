package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_MoveToElementi extends TestBase {

    @Test
    public void test01(){
        //1- https://www.amazon.com/ adresine gidin
        driver.get(" https://www.amazon.com/");
        //2- Sag ust bolumde bulunan “Account & Lists” menusunun acilmasi icin mouse’u bu menunun ustune getirin
       WebElement accountListElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions= new Actions(driver);
        actions.moveToElement(accountListElement);

        //3- “Create a list” butonuna basin
        driver.findElement(By.xpath("//*[text()='Anmelden']")).click();
        //4- Acilan sayfada “Your Lists” yazisi oldugunu test edin

        WebElement YourListsElementi= driver.findElement(By.id("nav-al-title"));
        Assert.assertTrue(YourListsElementi.isDisplayed());
    }



}
