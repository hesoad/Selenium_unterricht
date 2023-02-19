package Aufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_Aufgabe {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("Ilk size "+driver.manage().window().getPosition());
        System.out.println("Ilk position "+driver.manage().window().getSize());
        Thread.sleep(3000);

        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(40,100));

        System.out.println("Ilk size "+driver.manage().window().getPosition());
        System.out.println("Ilk position "+driver.manage().window().getSize());
        Thread.sleep(3000);

        driver.close();

        //olculeri ve konumu degistirelim



    }
}
