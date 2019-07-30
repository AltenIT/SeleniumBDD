package nl.alten.main;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplementationTest {
     public static WebDriver driver;

     public void OpenShoppingCart() {
          driver = new ChromeDriver();
          driver.navigate().to("http://localhost:8090/shoppingcart/");
     }

     public void ClickHome() {
          WebElement element = driver.findElement(By.xpath("//*[@id=\'collapsingNavbar\']/ul/li[1]/a"));
          element.click();
     }

     public void ValidateAltenLogo() {
          WebElement element = driver.findElement(By.xpath("/html/body/nav/div[1]/a/img"));
          if (element.isDisplayed() == false) {
               Assert.fail("Alten logo is niet zichtbaar");
          }
     }

     public void ValidateText(By element, String expected) {
          String actual = driver.findElement(element).getText();
               Assert.assertEquals(actual, expected);
     }
}