

import org.openqa.selenium.By;// importing a package of selenium

import org.openqa.selenium.WebDriver;// importing a package of selenium of chromeDriver
import org.openqa.selenium.chrome.ChromeDriver;//importing a package of chromeDriver

import java.text.SimpleDateFormat;

public class EmailAFriend
{
    //imported selenium web driver interface using maven dependency to perform automation task
    static protected WebDriver driver;
    // main method of this class
    public static void main(String[] args)
    {
        //Set the path of the driver for the chromeBrowser
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        //creating object with chromeBrowser
        driver = new ChromeDriver();
        //returns timeStamp value corresponding to the given string
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        // printing output for timeStamp
        System.out.println(timeStamp);
        // to maximise the browser window
        driver.manage().window().maximize();
        //driver.get command used for to open an URL and it will wait till the whole page gets loaded.
        driver.get("http://demo.nopcommerce.com/");
        //Click on Apple Macbook Pro 13-inch
        driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        //Click on Apple Email a friend
        driver.findElement(By.xpath("//div[@class=\"email-a-friend\"]")).click();
        // Go to Friend Email text field and type value of send keys
        driver.findElement(By.id("FriendEmail")).sendKeys("sejarp88"+timeStamp+"@gmail.com");
        // Go to your-email  text field and type value of send keys
        driver.findElement(By.className("your-email")).sendKeys("sejarp88"+timeStamp+"@gmail.com");
        // Go to PersonalMessage  text field and type value of send keys
        driver.findElement(By.id("PersonalMessage")).sendKeys("how r you");
        //Click on send-email
        driver.findElement(By.name("send-email")).click();
        //regMsg is local variable to store the find element through gettext command
        String regMsg = driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li")).getText();
        //Printing output for regMsg
        System.out.println(regMsg);
        //The driver.quit command is used to close the Webpage
        driver.quit();

    }
}
