package Aufgaben;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C12_Aufgaben extends TestBase {

    @Test
    public  void test01(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully

        String expectedUrl= "https://automationexercise.com/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //4. Click on 'Test Cases' button
       WebElement user=  driver.findElement(By.xpath("//a[.=' Test Cases']"));
       user.click();
        //5. Verify user is navigated to test cases page successfully
        WebElement testCase= driver.findElement(By.xpath(""));





    }
}
