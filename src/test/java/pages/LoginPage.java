package pages;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
			PageFactory.initElements(driver, this);
		}
    
    @FindBy(id = "username")
    WebElement txtEmail;

    @FindBy(id ="password")
    WebElement txtPass;

    @FindBy(id = "submitbutton")
    WebElement btnLogin;

    public void ingresarCredenciales(String email, String pass) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(txtEmail));
        wait.until(ExpectedConditions.visibilityOf(txtPass));
        wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
        
        txtEmail.sendKeys(email);
        txtPass.sendKeys(pass);
        btnLogin.click();
    }


    
}
