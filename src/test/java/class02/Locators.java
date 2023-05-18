package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");

        driver.manage().window().maximize();

        // find the element username TextBox
        WebElement usrNameTextBox=driver.findElement(By.id("txtUsername"));
        usrNameTextBox.sendKeys("Admin");

        // they both are same
        //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        Thread.sleep(2000);

        //after sending the username to the textBox clear the text box
        usrNameTextBox.clear();

        usrNameTextBox.sendKeys("Admin");
        WebElement pass=driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        //find login button
        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();

        //get the welcome message
        WebElement message=driver.findElement(By.linkText("Welcome Admin"));
        String text=message.getText();
        System.out.println(text);









    }
}
