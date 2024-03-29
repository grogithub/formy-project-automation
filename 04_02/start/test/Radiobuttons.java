import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");
        System.setProperty("webdriver.chrome.driver",
                "D:\\work_dsi\\3dexp\\3dexp\\Linkedin Learning" +
                        "\\Selenium Essentials Training\\Ex_Files_Selenium_EssT" +
                        "\\chromedriver_win32\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement((By.id("radio-button-1")));
        radioButton1.click();

        WebElement radioButton2 = driver.findElement((By.cssSelector("input[value='option2']")));
        radioButton2.click();

        WebElement radioButton3 = driver.findElement((By.xpath("/html/body/div/div[3]/input")));
        radioButton3.click();

        Thread.sleep(2000);

        driver.quit();
    }
}
