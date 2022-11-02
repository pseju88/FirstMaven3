import org.openqa.selenium.By;// importing a package of selenium
import org.openqa.selenium.WebDriver;// importing a package of selenium of chromeDriver
import org.openqa.selenium.chrome.ChromeDriver;//importing a package of chromeDriver

import java.text.SimpleDateFormat;

public class NewsComment
{
    //imported selenium web driver interface using maven dependency to perform automation task
    protected static WebDriver driver;
   // main method of this class
    public static void main(String[] args)
    {
        //Set the path of the driver for the chromeBrowser
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        //creating object with chromeBrowser
        driver = new ChromeDriver();
        // to maximise the browser window
        driver.manage().window().maximize();
        //driver.get command used for to open an URL and it will wait till the whole page gets loaded.
        driver.get("http://demo.nopcommerce.com/");
        //Click on details button
        driver.findElement(By.className("read-more")).click();
        //Click on Title text field and type value of send keys
        driver.findElement(By.className("enter-comment-title")).sendKeys("demo nopCommerce Website");
        //Click on Comment text field and type value of send keys
        driver.findElement(By.className("enter-comment-text")).sendKeys("It's very nice website");
        //Click on button
        driver.findElement(By.name("add-comment")).click();
        // To get text method for copy to text from site.
        String regMsg = driver.findElement(By.className("result")).getText();
        // to printout in console
        System.out.println(regMsg);
        //The driver.quit command is used to close the Webpage
        driver.quit();


    }
}