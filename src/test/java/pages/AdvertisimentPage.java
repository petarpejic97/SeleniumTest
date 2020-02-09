package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvertisimentPage {
    private static WebElement element = null;

    public static WebElement button_myNjuskalo(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"nav-user-main\"]/div/div[1]/ul/li[2]/a"));
        return element;
    }
    public static WebElement button_allAdvertisiments(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/main/div[1]/nav/ul/li[1]/a"));
        return element;
    }
    public static WebElement label_AdvertisimentDetails(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"id-c2cUserAds\"]/div/div/div/table/tbody/tr[1]/td[3]/div/div/ul/li[2]/a"));
        return element;
    }
    public static WebElement label_UploadAdvertiisment(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"id-c2cUserAds\"]/div/div/div/table/tbody/tr[2]/td[3]/div/div/ul/li[1]/a"));
        return element;
    }
    public static WebElement textbox_price(WebDriver driver){

        element = driver.findElement(By.id("ad-price-amount"));
        return element;
    }
    public static WebElement button_updateAdvertisiment(WebDriver driver){

        element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/main/div[4]/div/div/form/div[2]/div/div/div[1]/button"));
        return element;
    }
    public static WebElement getAdvertisimentTitle(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"id-c2cUserAds\"]/div/div/div/table/tbody/tr[1]/td[3]/div/h2"));
        return element;
    }
    public static WebElement getUpdate(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@id=\"collectPaymentAd\"]/div/div/div[1]/header/h1"));
        return element;
    }

}
