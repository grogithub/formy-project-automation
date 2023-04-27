import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver",
                "D:\\work_dsi\\3dexp\\3dexp\\Linkedin Learning" +
                        "\\Selenium Essentials Training\\Ex_Files_Selenium_EssT" +
                        "\\chromedriver_win32\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement((By.id("image")));
        WebElement box = driver.findElement((By.id("box")));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform();

        Thread.sleep(5000);

        driver.quit();
    }
}

