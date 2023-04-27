import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver",
                "D:\\work_dsi\\3dexp\\3dexp\\Linkedin Learning" +
                        "\\Selenium Essentials Training\\Ex_Files_Selenium_EssT" +
                        "\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement((By.id("new-tab-button")));
        newTabButton.click();

        String originalHandle = driver.getWindowHandle();

        for (String handle: driver.getWindowHandles()) {
            System.out.println(handle);
            driver.switchTo().window(handle);
            //break;
        }

        Thread.sleep(2000);
        driver.switchTo().window(originalHandle);

        Thread.sleep(2000);
        driver.quit();
    }
}
