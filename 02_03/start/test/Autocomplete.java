// Replayed https://www.youtube.com/watch?v=RRKuw7P6TL8 which demonstrates google autosuggestion feature
// automation, since original scenario requires Google Map APIs.
// Hence original scenario replaced with this one.

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.time.Clock;
import java.util.List;

// This use case was done since the original failed owing to no support from AutoComplete APIs
// for the web site recommended in the course
public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver",
                "D:\\work_dsi\\3dexp\\3dexp\\Linkedin Learning" +
                        "\\Selenium Essentials Training\\Ex_Files_Selenium_EssT" +
                        "\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

       // driver.get("https://formy-project.herokuapp.com/autocomplete");
          driver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
        element.click();

        // Enter something to search for
        element.sendKeys("Selenium");

        // Thread.sleep(2000);
        //li[@class='sbct']
        List<WebElement> autodropDownList = element.findElements(By.xpath("//li[@class='sbct']"));

        // Thread.sleep(2000);

        for (int i=0; i <  autodropDownList.size(); i++)
        {
            System.out.println("Selected option is: " + autodropDownList.get(i).getText());
        }

        for (int i=0; i <  autodropDownList.size(); i++)
        {
            if (autodropDownList.get(i).getText().equalsIgnoreCase("selenium webdriver")) {
                System.out.println("Selected option is: " + autodropDownList.get(i).getText());
                autodropDownList.get(i).click();
                // if break is not there, it outputs an error or element not being found since
                // loop continues but a new page has appeared, thanks to the click above
                break;
            }
        }
        
        driver.quit();
    }
}
