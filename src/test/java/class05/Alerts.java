package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApp;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);
        WebElement alert1Btn=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1Btn.click();
        Thread.sleep(3000);

        // switch the focus of the driver to the alert
        Alert confirmationAlert1=driver.switchTo().alert();
        confirmationAlert1.accept(); // we click on 'ok' button on the alert window

        //find the other alert button and click on it
        WebElement alert2Btn=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2Btn.click();
        Thread.sleep(3000);

        // switch to alert
        Alert confirmationAlert2=driver.switchTo().alert();
        confirmationAlert2.dismiss(); // dismiss means click on cancel


    }
}
