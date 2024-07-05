package selenium_core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;

public class ChromeDriverManager extends DriverManager {
    @Override
    void createWebDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Trening\\Hello Again\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        this.driver = new ChromeDriver(options);
    }
}

