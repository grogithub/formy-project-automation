import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver",
                "D:\\work_dsi\\3dexp\\3dexp\\Linkedin Learning" +
                        "\\Selenium Essentials Training\\Ex_Files_Selenium_EssT" +
                        "\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement((By.id("first-name"))).sendKeys("john");
        driver.findElement((By.id("last-name"))).sendKeys("abraham");
        driver.findElement((By.id("job-title"))).sendKeys("developer");
        driver.findElement((By.id("radio-button-2"))).click();
        driver.findElement((By.id("checkbox-1"))).click();
        driver.findElement((By.cssSelector("option[value='3']"))).click();
        driver.findElement(By.id("datepicker")).sendKeys("09/09/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        Thread.sleep(2000);

        driver.quit();
    }
}
