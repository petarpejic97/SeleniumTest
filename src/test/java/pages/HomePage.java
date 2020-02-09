package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private static WebElement element = null;

    public static WebElement textbox_Search(WebDriver driver){

        element = driver.findElement(By.id("keywords"));
        return element;
    }

    public static WebElement button_search(WebDriver driver){

        element = driver.findElement(By.id("submitButton"));
        return element;
    }
    public String GetAdvertsimentNumber(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"detailedSearch\"]/div/div[1]/div[4]/header/div[1]/strong")).getText();
    }
}
