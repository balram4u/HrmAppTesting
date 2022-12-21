package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    private static final By txtUsername = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    private static final By txtPassword = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]");
    private static final By btnLogin = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]");
    private static final By invalidMessage = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]");
    private static final By requiredalert = By.xpath("//form[@class='oxd-form']/div/div/span");

    public void typeUsername(String username) {
        driver.findElement(txtUsername).sendKeys(username);
    }
    public void typePassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }
    public String errorMessage()
    {
        return driver.findElement(invalidMessage).getText();
    }
    public String requiredAlert()
    {
        return driver.findElement(requiredalert).getText();
    }
    public HomePage entervalidCredentials(String username, String password){
        this.typeUsername(username);
        this.typePassword(password);
        this.clickLogin();
        return new HomePage(driver);
    }
    public void enterInvalidCredentials(String username, String password){
        this.typeUsername(username);
        this.typePassword(password);
        this.clickLogin();
    }
}
