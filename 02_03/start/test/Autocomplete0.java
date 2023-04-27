// Replayed https://www.youtube.com/watch?v=RRKuw7P6TL8 which demonstrates google autosuggestion feature
// automation, since original scenario requires Google Map APIs.
// Hence original scenario replaced with this one.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
// This use case fails since at their website, AutoComplete API support is missing
// Hence alternatively, I created Autocomplete.java which does the same in google.com
public class Autocomplete0 {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver",
                "D:\\work_dsi\\3dexp\\3dexp\\Linkedin Learning" +
                        "\\Selenium Essentials Training\\Ex_Files_Selenium_EssT" +
                        "\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
        //autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");
        autocomplete.sendKeys("Lokmanya Tilak Road");

        Thread.sleep(1000);
        WebElement autocompleteResult = driver.findElement(By.className("pac-container"));
        autocompleteResult.click();

        driver.quit();
    }
}
