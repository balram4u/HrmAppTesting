package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver =driver;
    }

    By txtDashboard = By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[1]/span[1]/h6[1]");
    By pim = By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]");

    public String getDashboard(){
        return driver.findElement(txtDashboard).getText();
    }

    public void ClickPIM() {
        driver.findElement(pim).click();
    }
    public HomePage getPIMMenu() {
        this.ClickPIM();
        return new HomePage(driver);
    }

}
