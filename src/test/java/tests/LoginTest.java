package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    private WebDriver driver;
    private String testURL="https://www.njuskalo.hr/prijava/";

    LoginPage loginPage;

    @BeforeClass
    public void setupClass() {
        //for second parameter find your webdriver folder
        System.setProperty("webdriver.chrome.driver", "C:/Users/Aleksandar/Desktop/Diplomski studij/4.godina/Metode i tehnike testiranja programske podrške/chromedriver.exe");

        driver = new ChromeDriver();

    }

    @BeforeMethod
    public void setupTest() {
        //set POM
        loginPage = new LoginPage();
        //go to njuskalo login
        driver.navigate().to(testURL);
        driver.manage().window().maximize();
    }

    @Test
    public void LoginWithRegisteredUsernameAndValidPassword () throws InterruptedException{

        LoginPage.textbox_UserName(driver).sendKeys("Petar997");
        LoginPage.textbox_Password(driver).sendKeys("Testiranje123)");
        LoginPage.button_login(driver).click();
        //if login is OK, then user will be able log out
        LoginPage.button_logOff(driver).click();
    }
    @Test
    public void LoginWithRegisteredUsernameAndFalsePassword () throws InterruptedException{
        LoginPage.textbox_UserName(driver).sendKeys("Petar997");
        LoginPage.textbox_Password(driver).sendKeys("122212");
        LoginPage.button_login(driver).click();
        //error message
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.MILLISECONDS);
        Assert.assertFalse(loginPage.GetErrorMessage(driver).isEmpty());
    }
    @Test
    public void LoginWithFalseUsernameAndValidPassword () throws InterruptedException{
        LoginPage.textbox_UserName(driver).sendKeys("MTTPP");
        LoginPage.textbox_Password(driver).sendKeys("Testiranje123)");
        LoginPage.button_login(driver).click();
        //error message
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        Assert.assertFalse(loginPage.GetErrorMessage(driver).isEmpty());

        //checking error message
        System.out.print(loginPage.GetErrorMessage(driver));
    }
    @AfterMethod
    public void teardownTest() {
        //Close browser and end the session
        driver.quit();
    }
}
