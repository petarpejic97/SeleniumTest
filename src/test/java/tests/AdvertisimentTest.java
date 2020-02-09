package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AdvertisimentPage;
import pages.HomePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class AdvertisimentTest {
    private static WebElement element = null;

    private WebDriver driver;
    private String testURL = "https://www.njuskalo.hr/prijava";

    LoginPage loginPage;
    AdvertisimentPage advertisimentPage;

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
        advertisimentPage = new AdvertisimentPage();
        //go to njuskalo home page
        driver.navigate().to(testURL);
        driver.manage().window().maximize();
    }

    @Test
    public void ViewAdvertisiment() throws InterruptedException {

        LoginPage.textbox_UserName(driver).sendKeys("Petar997");
        LoginPage.textbox_Password(driver).sendKeys("Testiranje123)");
        LoginPage.button_login(driver).click();
        AdvertisimentPage.button_myNjuskalo(driver).click();
        AdvertisimentPage.button_allAdvertisiments(driver).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        AdvertisimentPage.label_AdvertisimentDetails(driver).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        driver.switchTo().defaultContent();
        Assert.assertEquals(AdvertisimentPage.getAdvertisimentTitle(driver).getText(),"Beagle za parenje");
    }
    @Test
    public void UpdateAdvertisiment() throws InterruptedException {
        LoginPage.textbox_UserName(driver).sendKeys("Petar997");
        LoginPage.textbox_Password(driver).sendKeys("Testiranje123)");
        LoginPage.button_login(driver).click();
        AdvertisimentPage.button_myNjuskalo(driver).click();
        AdvertisimentPage.button_allAdvertisiments(driver).click();
        driver.manage().timeouts().implicitlyWait(600, TimeUnit.MILLISECONDS);
        AdvertisimentPage.label_UploadAdvertiisment(driver).click();
        AdvertisimentPage.textbox_price(driver).clear();
        driver.manage().timeouts().implicitlyWait(600, TimeUnit.MILLISECONDS);
        AdvertisimentPage.textbox_price(driver).sendKeys("100");
        AdvertisimentPage.button_updateAdvertisiment(driver).click();
        Assert.assertEquals(AdvertisimentPage.getUpdate(driver).getText(),"Želiš li brže pronaći kupca?");

    }
    @AfterMethod
    public void teardownTest() {
        //Close browser and end the session
        driver.quit();
    }
}
