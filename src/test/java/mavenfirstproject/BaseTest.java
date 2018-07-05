package mavenfirstproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils
{

@BeforeMethod
    public void openbrowser()
    { System.setProperty("webdriver.chrome.driver","src\\test\\Resourses\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("http://demo.nopcommerce.com/"); }

@AfterMethod
    public void closebrowser()
    {driver.quit();}

}
