package Resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public WebDriver driver;
    public Properties prop;

    public WebDriver initializeDriver() throws IOException
    {

        prop= new Properties();
        FileInputStream fis=new FileInputStream("/Users/balarambera/Documents/Test/OrangeHrm/HrmAppTesting/Drivers/chromedriver");
        prop.load(fis);

        String browserName=prop.getProperty("browser");
        System.out.println("browser");


        if(browserName.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","");
            driver= new ChromeDriver();
        }
        else if (browserName.equals("firefox"))
        {
            driver= new FirefoxDriver();
        }
        else if (browserName.equals("IE"))
        {
//		IE code
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        return driver;
    }
}
