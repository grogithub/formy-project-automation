import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver",
                "D:\\work_dsi\\3dexp\\3dexp\\Linkedin Learning" +
                        "\\Selenium Essentials Training\\Ex_Files_Selenium_EssT" +
                        "\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement((By.id("modal-button")));
        modalButton.click();

        Thread.sleep(2000);
        WebElement closeButton = driver.findElement((By.id("close-button")));
        // following also works, but we show the JS way of execution
        // closeButton.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", closeButton);

        Thread.sleep(2000);

        driver.quit();
    }
}
