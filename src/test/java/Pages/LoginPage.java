package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css="#email")
    WebElement username;
    @FindBy(css="#password")
    WebElement password;
    @FindBy(xpath="//button[@type='submit' and contains(@class, 'login-button')]")
    WebElement registerButton;

    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
        clickRegisterButton();
    }

    public void enterUsername(String Value){
        username.sendKeys(Value);
    }
    public void enterPassword(String Value){
        password.sendKeys(Value);
    }
    public void clickRegisterButton(){
        registerButton.click();
    }
}
