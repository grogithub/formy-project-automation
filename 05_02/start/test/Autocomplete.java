// drastically changed to replace with the drop down java code from previous exercise
// reason being autocomplete terribly went wrong in our case, since we dont have access to
// google map apis
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;



public class Autocomplete {
    public static void main(String[] args) /*throws InterruptedException*/ {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver",
                "D:\\work_dsi\\3dexp\\3dexp\\Linkedin Learning" +
                        "\\Selenium Essentials Training\\Ex_Files_Selenium_EssT" +
                        "\\chromedriver_win32\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // The following failed to wait, since its purpose is not the same as thread.sleep
        // https://stackoverflow.com/questions/51336849/selenium-implicit-and-explicit-waits-not-working-has-no-effect
        // The above link has a reference to the source code of implicit wait
        /*
        def implicitly_wait(self, time_to_wait):
    """
    Sets a sticky timeout to implicitly wait for an element to be found,
       or a command to complete. This method only needs to be called one
       time per session. To set the timeout for calls to
       execute_async_script, see set_script_timeout. */

        // Using the following you will never have element not found or clickable error
        WebElement fielduploadField = driver.findElement((By.id("file-upload-field")));
        //fielduploadField.click();
        fielduploadField.sendKeys("file-to-upload.png");
        // Thread.sleep(2000);
    // following code will show the capability of implicit wait
        WebElement fielduploadField1 = driver.findElement((By.id("file-upload-field1")));


        driver.quit();
    }
}
