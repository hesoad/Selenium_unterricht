package Aufgaben;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;

public class C16_Aufgaben extends TestBase {
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully

    @Test
    public void test01() {

        driver.get("http://automationexercise.com");
        String expectedUrl = "http://automationexercise.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    //4. Click on 'Products' button
    //5. Verify user is navigated to ALL PRODUCTS page successfully
    //6. Enter product name in search input and click search button
        @Test
        public void test02() {

            //7. Verify 'SEARCHED PRODUCTS' is visible
            //8. Verify all the products related to search are visible
        }
}
