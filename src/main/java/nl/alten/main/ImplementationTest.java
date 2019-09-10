package nl.alten.main;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ImplementationTest {
     public static WebDriver driver;

     public void OpenShoppingCart() {
          driver = new ChromeDriver();
          driver.navigate().to("http://localhost:8090/shoppingcart/");
     }

     public void CloseShoppingCart() {
          driver.close();
     }

     public void ClickMenuHome() {
          WebElement element = driver.findElement(By.xpath("//*[@id=\'collapsingNavbar\']/ul/li[1]/a"));
          element.click();
     }

     public void ValidateAltenLogo() {
          WebElement element = driver.findElement(By.xpath("/html/body/nav/div[1]/a/img"));
          if (element.isDisplayed() == false) {
               Assert.fail("Alten logo is niet zichtbaar");
          }
     }

     public void ValidateText(String expected) {
          String actual = driver.findElement(By.xpath("//*[@id='mainSection']/ng-view/header/h1")).getText();
          Assert.assertEquals(actual, expected);
     }


     // Scenario 1
     public void ClickMenuShop() {
          WebElement element = driver.findElement(By.partialLinkText("Shop"));
          element.click();
     }

     public void ValidatePill() {
          WebElement element = driver.findElement(By.xpath("//div[@class='card-columns']//h4[contains(text(), 'Pill')]"));
          if (!element.isDisplayed()) {
               Assert.fail("The element Pill doesn't exists");
          }
     }

     public void AddProductPill() {
          WebElement element = driver.findElement(By.xpath("//div[@class='card-columns']//button[@id='product_pills_toevoegen']"));
          element.click();
     }

     public void  ValidatePopupProductPill() {
          WebElement element = driver.findElement(By.xpath("//span[@id='productSpan'][contains(text(), '1 Geïmporteerde Pill ter waarde van 10.09')]"));
          if (!element.isDisplayed()) {
               Assert.fail("1 Geïmporteerde Pill ter waarde van 10.09 has not been shown");
          }
     }


     // Scenario 2
     public void ValidateBoek() {
          WebElement element = driver.findElement(By.xpath("//div[@class='card-columns']//h4[contains(text(), 'Boek')]"));
          if (!element.isDisplayed()) {
               Assert.fail("The element Boek doesn't exists");
          }
     }

     public void AddProductBoek() {
          WebElement element = driver.findElement(By.xpath("//div[@class='card-columns']//button[@id='product_boek_toevoegen']"));
          element.click();
     }

     public void  ValidatePopupProductBoek() {
          WebElement element = driver.findElement(By.xpath("//span[@id='productSpan'][contains(text(), '1 Geïmporteerde boek ter waarde van 21.27')]"));
          if (!element.isDisplayed()) {
               Assert.fail("1 Geïmporteerde Pill ter waarde van 10.09 has not been shown");
          }
     }


     // scenario 3
     public void ClickMenu(String menu) {
          WebElement element = driver.findElement(By.partialLinkText(menu));
          element.click();
     }

     public void ValidateProduct(String product) {
          String actual = driver.findElement(By.xpath("//h4[@class='card-title'][contains(text(), '"+product+"')]")).getText();
          Assert.assertEquals(actual, product);
     }

     public void AddProduct(String product) {
          WebElement element = driver.findElement(By.xpath("//div[@class='card-body']//h4[contains(text(), '"+product+"')]/..//button"));
          element.click();
     }

     public void ValidatePopupProduct(String popup) {
          WebElement element = driver.findElement(By.xpath("//span[@id='productSpan'][contains(text(), '"+popup+"')]"));
          if (!element.isDisplayed()) {
               Assert.fail("The imported product has not been shown");
          }
     }
}