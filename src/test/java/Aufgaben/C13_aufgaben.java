package Aufgaben;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C13_aufgaben extends TestBase {

    @Test
    public void test01() throws InterruptedException {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String expectedUrl="https://automationexercise.com/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //4. Click on 'Products' button
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        //5. Verify user is navigated to ALL PRODUCTS page successfully
        WebElement allProducts= driver.findElement(By.xpath("//h2[.='All Products']"));
        Assert.assertTrue(allProducts.isDisplayed());
        //6. The products list is visible
        WebElement list= driver.findElement(By.xpath("//div[@class='features_items']"));
        Assert.assertTrue(list.isDisplayed());
        Thread.sleep(500);
        //7. Click on 'View Product' of first product
        Actions actions=new Actions(driver);
        actions.click(list)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        WebElement hasan =driver.findElement(By.xpath("(//ul[@class='nav nav-pills nav-justified'])[1]"));
        hasan.click();
        //8. User is landed to product detail page
        String expected="https://automationexercise.com/product_details/1";
        String actual=driver.getCurrentUrl();
        Assert.assertEquals(expected,actual);
        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        WebElement detail= driver.findElement(By.xpath("//div[@class='product-information']"));
        System.out.println(detail.getText());
        Assert.assertTrue(detail.isDisplayed());
    }
}