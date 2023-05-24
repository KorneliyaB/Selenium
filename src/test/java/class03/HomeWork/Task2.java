package class03.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    /*
    Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement userName=driver.findElement(By.cssSelector("input[id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement login=driver.findElement(By.xpath("//input[@name='Submit']"));
        login.click();
        Thread.sleep(3000);
        driver.close();

    }
}

