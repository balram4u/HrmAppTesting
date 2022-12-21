package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pimpage {
    WebDriver driver;

    public void PimPage(WebDriver driver){
        this.driver =driver;
    }

    By SearchByempName = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
    By SearchByempId =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]");
    By searchByemploymentStatus = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
    By clicksearbtn = By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]");
    By norecordfoundmsg =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]");

    public WebElement SearchByName() {
        return driver.findElement(SearchByempName);
    }
    public WebElement SearchByEmpId() {
        return driver.findElement(SearchByempId);
    }

    public WebElement SearchByempStatus() {
        return driver.findElement(searchByemploymentStatus);
    }
    public WebElement ClickSearBtn() {
        return driver.findElement(clicksearbtn);
    }
    public String ValidateNoRecordFound() {
        return driver.findElement(norecordfoundmsg).getText();
    }




}
