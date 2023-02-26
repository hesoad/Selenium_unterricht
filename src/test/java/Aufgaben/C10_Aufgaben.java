package Aufgaben;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static utilities.TestBaseClass.driver;

public class C10_Aufgaben extends TestBase {

    @Test
    public void test01(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com");
        //3. Verify that home page is visible successfully

        String expectedUrl= "https://automationexercise.com";
        String actualUrl = driver.getCurrentUrl();

        //4. Click on 'Signup / Login' button

        //driver.findElement(By.linkText())
        //5. Verify 'Login to your account' is visible
        //6. Enter correct email address and password
        //7. Click 'login' button
        //8. Verify that 'Logged in as username' is visible
        //9. Click 'Delete Account' button
        //10. Verify that 'ACCOUNT DELETED!' is visible
    }

}
