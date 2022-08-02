package org.example;

import static org.junit.Assert.assertTrue;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
//    WebDriver driver;
//    @BeforeAll
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.gmail.com/");
//            }

    @Test
    public void login()
    {
        //driver.get("www.gmail.com");
        //WebElement emailId=driver.findElement(By.id("identifierId"));
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com/");
        WebElement emailId=driver.findElement(By.id("identifierId"));

       // WebElement emailId=driver.findElement(By.xpath("//*[@id='identifierId']"));

        emailId.sendKeys("visali1203@gmail.com");
         }
}
