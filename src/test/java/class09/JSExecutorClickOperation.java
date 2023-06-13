package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorClickOperation extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);
        // find teh login btn
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginBtn);
    }
}
