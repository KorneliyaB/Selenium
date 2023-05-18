package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

        /**
       * navigate to google.com
         */
        public static void main(String[] args) throws InterruptedException {
            //declare the instance
        WebDriver driver=new ChromeDriver();
        //  use .get(url) to navigate to the desired url
            driver.get("https://www.google.com");
        //  maximize window
            driver.manage().window().maximize();
        //  get the currant url
            String currentURL=driver.getCurrentUrl();
            System.out.println("the current url :"+currentURL);
        //   get the title of the page
            String title= driver.getTitle();
            System.out.println("the title of the page :"+title);
        //  add some time
            Thread.sleep(5000);

        //  close the webrowser
            driver.quit();
        //

    }
}
