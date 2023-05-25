package class03.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /*
    Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
fill in the complete form

     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        WebElement firstName=driver.findElement(By.cssSelector("input[name='first_name']"));
        firstName.sendKeys("Nelly");
        WebElement lastN=driver.findElement(By.cssSelector("input[name='last_name']"));
        lastN.sendKeys("Shtondenko");
        WebElement email=driver.findElement(By.cssSelector("input[name='email']"));
        email.sendKeys("nellyshtondenko@test.com");
        WebElement phone=driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("8509874561");
        WebElement address=driver.findElement(By.xpath("//input[@placeholder='Address']"));
        address.sendKeys("11728 Palm Cove");
        WebElement city=driver.findElement(By.cssSelector("input[name='city']"));
        city.sendKeys("Panama City");
        Thread.sleep(2000);
        WebElement state=driver.findElement(By.cssSelector("select[name='state']"));
        state.click();
        state.sendKeys("Florida");
        state.click();
        WebElement zipC=driver.findElement(By.cssSelector("input[name='zip']"));
        zipC.sendKeys("32407");
        WebElement website=driver.findElement(By.cssSelector("input[placeholder^= 'Website or d']"));
        website.sendKeys("www.facebook.com");
        WebElement hosting=driver.findElement(By.cssSelector("input[value='yes']"));
        hosting.click();

        WebElement commentField=driver.findElement(By.cssSelector("textarea[name='comment']"));
        commentField.sendKeys("Hello Batch16 ");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
        Thread.sleep(3000);

        driver.quit();



    }
}
