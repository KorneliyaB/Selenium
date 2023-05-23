package class02.Homework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
    public class Task {
        //HW  (only use XPATH)
        //navigate to fb.com
        //click on create new account
        //fill up all the textboxes
        //close the popup
        //close the browser
        //Note : in order for ur code to work
        //u have to put Thread.sleep(2000) after clicking on Create new account
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
            createAccount.click();
            Thread.sleep(2000);
            WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
            firstName.sendKeys("Nelly");
            WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
            lastName.sendKeys("Banyas");
            WebElement phoneOrEmail=driver.findElement(By.xpath("//input[contains(@name,'reg_email')]"));
            phoneOrEmail.sendKeys("+8507300156");
            WebElement password=driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]"));
            password.sendKeys("123654jhg?");
            driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Dec");
            driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("31");
            driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1993");
            driver.findElement(By.xpath("//label[text()='Female']")).click();
            Thread.sleep(5000);
            driver.quit();


        }
}
