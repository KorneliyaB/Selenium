package class01.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser
Note: use name or id as locators
     */
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;" +
                "jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.name("customer.firstName")).sendKeys("Vicky");
        driver.findElement(By.name("customer.lastName")).sendKeys("Fredd");
        driver.findElement(By.name("customer.address.street")).sendKeys("my address is...");
        driver.findElement(By.name("customer.address.city")).sendKeys("Panama City");
        driver.findElement(By.name("customer.address.state")).sendKeys("Florida");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("02002");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("+8501257854");
        driver.findElement(By.name("customer.ssn")).sendKeys("01234");
        driver.findElement(By.name("customer.username")).sendKeys("Vicky.Fredd");
        driver.findElement(By.name("customer.password")).sendKeys("12345");
        driver.findElement(By.name("repeatedPassword")).sendKeys("12345");



        driver.quit();
    }
}
