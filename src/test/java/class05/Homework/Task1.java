package class05.Homework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApp;

public class Task1 {
    //http://practice.syntaxtechs.net/javascript-alert-box-demo.php
    //click on the last alert
    //send keys and accept it
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApp(url,browser);

        WebElement alert3Btn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();
        Thread.sleep(2000);

        Alert confirmationAlert=driver.switchTo().alert();
        confirmationAlert.sendKeys("Selenium");
        confirmationAlert.accept();
        Thread.sleep(3000);


    }
}
