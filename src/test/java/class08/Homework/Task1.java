package class08.Homework;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement recruitment=driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitment.click();
        driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']/following-sibling::img")).click();


        WebElement mmDD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(mmDD);
        sel.selectByVisibleText("Dec");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select=new Select(year);
        select.selectByVisibleText("1993");

//get the table
        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

        for(WebElement dates:allDates){
            String dateToday = dates.getText();
            if(dateToday.equals("31")){
                dates.click();
                break;
            }
        }
    }
}
/*
goto syntax hrms
login
click on recruitment
select a date on the calanader
 */
