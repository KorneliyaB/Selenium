package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApp;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://accounts.google.com/signup";
        String browser = "chrome";
        openBrowserAndLaunchApp(url, browser);

        // click on the help button and privacy button
        WebElement helpBtn=  driver.findElement(By.linkText("Help"));
        helpBtn.click();

        WebElement privacyBtn=driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        // get the window hande of the main page and print on console
        //also save it for later use
        String mainPageHandle=driver.getWindowHandle();
        System.out.println("main page: "+mainPageHandle);

        //get all the window handle and print the title associated with window handle on the console
        Set<String> allHandles=driver.getWindowHandles();
        for (String handle: allHandles){
            driver.switchTo().window(handle);
           String title= driver.getTitle();
           if (title.equalsIgnoreCase("Google Account Help")){
               break;
           }
//            System.out.println("the title associated with: "+handle+" is: "+ title);
        }

        // when the focus is shifted to correct page
        System.out.println("the currant page: "+driver.getTitle());
//     after switching to the page google account help, we can deal with any element
        //we want to in a regular manner

        // switch my focus to the main page
        driver.switchTo().window(mainPageHandle);

        //check the focus
        System.out.println("the focus is on "+driver.getTitle());


    }
}