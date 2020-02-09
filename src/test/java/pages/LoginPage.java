package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static WebElement element = null;


    public static WebElement textbox_UserName(WebDriver driver){

        element = driver.findElement(By.name("login[username]"));
        return element;
    }

    public static WebElement textbox_Password(WebDriver driver){

        element = driver.findElement(By.name("login[password]"));
        return element;
    }

    public static WebElement button_login(WebDriver driver){

        element = driver.findElement(By.id("login-submitButton"));
        return element;
    }

    public static WebElement button_logOff(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"nav-user-main\"]/div/div[2]/ul/li/a"));
        return element;
    }
    public String GetErrorMessage(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div/div[1]/div/div/fieldset/div/div[1]/div[2]")).getText();
    }
}
