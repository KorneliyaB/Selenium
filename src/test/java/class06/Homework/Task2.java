package class06.Homework;

import org.openqa.selenium.By;

import java.time.Duration;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApp;

public class Task2 {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//button[text()='Get New User']")).click();
        var firstN=driver.findElement(By.xpath("//p[starts-with(text(),'First Name ')]"));
        System.out.println(firstN.getText());

    }
}
/*
goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
click on get new user
print the firstname of user
 */