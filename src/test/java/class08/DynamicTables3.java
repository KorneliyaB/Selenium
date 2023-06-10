package class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTables3 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);
        // login into the website
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        //click on PIM
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        boolean found=false;
        while (!found) {
            // get all the ids from table
            List<WebElement> allIds = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
            // iterate through the ids and find 53481A id it and click on
            for (int i = 0; i < allIds.size(); i++) {
                String id = allIds.get(i).getText();
                if (id.equals("53481A")) {
                    System.out.println("click on yje checked box on num " + (i + 1));
                    WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    //to break the while loop
                    found=true;
                    //to break the for loop
                    break;
                }
            }
            //click on the next page,click till element found
            if(!found){
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();
            }

        }
    }
}
