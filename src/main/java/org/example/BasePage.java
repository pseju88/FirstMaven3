package org.example; // A package to store the classes.
import org.openqa.selenium.By;// importing a package of selenium
import org.openqa.selenium.WebDriver; // importing a package of selenium of chromeDriver
import org.openqa.selenium.chrome.ChromeDriver; //importing a package of chromeDriver

import java.text.SimpleDateFormat;

public class BasePage
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
        //returns timeStamp value corresponding to the given string
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        // printing output for timeStamp
        System.out.println(timeStamp);
        // to maximise the window
        driver.manage().window().maximize();
        //driver.get command used for to open an URL and it will wait till the whole page gets loaded.
        driver.get("http://demo.nopcommerce.com/");
        //Click on register button
        driver.findElement(By.className("ico-register")).click();
        // Go to FirstName text field and type value of send keys
        driver.findElement(By.id("FirstName")).sendKeys("Rajesh");
        // Go to LastName text field and type value of send keys
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        // Go to Email text field and type value of send keys
        driver.findElement(By.id("Email")).sendKeys("seju_patel81"+timeStamp+"@yahoo.com");
        // Go to Password text field and type value of send keys
        driver.findElement(By.id("Password")).sendKeys("Test123");
        // Go to Confirm Password text field and type value of send keys
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Test123");
        // Click on Register button
        driver.findElement(By.id("register-button")).click();
        //for better space
        System.out.println();
        //regMsg is local variable to store the find element through gettext command
        String regMsg = driver.findElement(By.className("result")).getText();
        //Printing output for regMsg
        System.out.println(regMsg);
        //The driver.quit command is used to close the Webpage
        driver.quit();


    }



}
