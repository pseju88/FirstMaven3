import org.openqa.selenium.By;// importing a package of selenium
import org.openqa.selenium.WebDriver;// importing a package of selenium of chromeDriver
import org.openqa.selenium.chrome.ChromeDriver;//importing a package of chromeDriver



public class Homepagecategories
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
        // driver.find element command is used for uniquely identify a web element with in the webpage by id,by class name,by Xpath.

        String regMsg = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).getText();
        String regMsg1 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/electronics\"]")).getText();
        String regMsg2 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/apparel\"]")).getText();
        String regMsg3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/digital-downloads\"]")).getText();
        String regMsg4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]")).getText();
        String regMsg5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/jewelry\"]")).getText();
        String regMsg6 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/gift-cards\"]")).getText();
        // local variable regMsg,regMsg1,regMsg2,regMsg4,regMsg5,regMsg6 introduced to store the find element through .gettext command
        System.out.println(regMsg);
        System.out.println(regMsg1);
        System.out.println(regMsg2);
        System.out.println(regMsg3);
        System.out.println(regMsg4);
        System.out.println(regMsg5);
        System.out.println(regMsg6);
        //The driver.quit command is used to close the Webpage
        driver.quit();
    }

}