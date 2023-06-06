package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static Utils.CommonMethods.*;

public class ImplicitWait {
    public static void main(String[] args) {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);
        // declare the implicit wait in the start as ut is a global wait,
        //and we want it to be implemented on all the web elements
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));

        //click on create account
        WebElement createNewAccBtn=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccBtn.click();

        //send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText("abracadabra",firstName);


    }
}
