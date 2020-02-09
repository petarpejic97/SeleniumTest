package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class SearchBarTest {

    private WebDriver driver;
    private String testURL="https://www.njuskalo.hr/";

    HomePage homePage;

    @BeforeClass
    public void setupClass() {
        //for second parameter find your webdriver folder
        System.setProperty("webdriver.chrome.driver", "C:/Users/Aleksandar/Desktop/Diplomski studij/4.godina/Metode i tehnike testiranja programske podrške/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void setupTest() {
        //set POM
        homePage = new HomePage();
        //go to njuskalo home page
        driver.navigate().to(testURL);
        driver.manage().window().maximize();
    }

    @Test
    public void EnterWordsInSearchBar () throws InterruptedException{

        HomePage.textbox_Search(driver).sendKeys("mobitel");
        HomePage.button_search(driver).click();
        //result message
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        Assert.assertNotEquals(homePage.GetAdvertsimentNumber(driver),"0");
    }
    @Test
    public void EnterSomethingNoSense () throws InterruptedException{
        HomePage.textbox_Search(driver).sendKeys("smsošrtpdifpnru");
        HomePage.button_search(driver).click();
        //error message
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
        Assert.assertEquals(homePage.GetAdvertsimentNumber(driver),"0");
    }
}
