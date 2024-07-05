package Tests;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium_core.DriverManager;
import selenium_core.DriverManagerFactory;

import java.util.concurrent.TimeUnit;

public class SourceDemoTests {
    WebDriver driver;
    DriverManager driverManager;

    @BeforeMethod
    public void setup(){
        driverManager = DriverManagerFactory.getDriverManager("CHROME");
        driver=driverManager.getWebDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void close(){
        driverManager.quit();
    }

    @Test
    public void loginTest(){
        driver.get("https://dashboard.helloagain.at/#/login/demo-damir");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("damir.begic86@gmail.com", "f2xRdAdPFX");
        // loginPage.clickRegisterButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/aside/div/section/div/ul/li[3]/div/a")).click(); //Customer haed
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/aside/div/section/div/ul/li[3]/div/ul/li[1]/a")).click(); // Customer in the List
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='#/user/22992989' and contains(@class, 'btn-primary')]\n")).click(); // click on edit Max Mustermann Customer
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and contains(@class, 'edit-button')]\n")).click(); // click on Bearbeiten (Max Mustermann)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Maximilian");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[contains(@class, 'btn-success') and contains(@class, 'update-button')]\n")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
}
