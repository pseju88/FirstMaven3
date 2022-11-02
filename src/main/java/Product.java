import org.openqa.selenium.By;// importing a package of selenium
import org.openqa.selenium.WebDriver;// importing a package of selenium of chromeDriver
import org.openqa.selenium.chrome.ChromeDriver;//importing a package of chromeDriver

public class Product
{
    //imported selenium web driver interface using maven dependency to perform automation task
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        //Set the path of the driver for the chromeBrowser
        System.setProperty("webdriver.chrome.driver", "src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        // to maximise the browser window
        driver.manage().window().maximize();
        //driver.get command used for to open an URL and it will wait till the whole page gets loaded.
        driver.get("http://demo.nopcommerce.com/");
        // driver.find element command is used for uniquely identify a web element with in the webpage by id,by class name,by Xpath.
        //Click on Computer
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).click();
        //Click on Desktops
        driver.findElement(By.xpath("//div[@class=\"category-grid sub-category-grid\"]//img[@alt=\"Picture for category Desktops\"]")).click();
        //regMsg,regMsg1,regMsg2is local variable to store the find element through gettext command
        String regMsg = driver.findElement(By.xpath("//div[@class=\"details\"]/h2/a[@href=\"/build-your-own-computer\"]")).getText();
        String regMsg1 = driver.findElement(By.xpath("//div[@class=\"details\"]/h2/a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();
        String regMsg2 = driver.findElement(By.xpath("//div[@class=\"details\"]/h2/a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();
        //Printing output for regMsg,regMsg1,regMsg2
        System.out.println(regMsg);
        System.out.println(regMsg1);
        System.out.println(regMsg2);
        //The driver.quit command is used to close the Webpage
        driver.quit();

    }
}
