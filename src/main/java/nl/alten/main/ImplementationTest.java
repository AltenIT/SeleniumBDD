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

     // Scenario 4
     public void ValidateRapportItemAantal(int regel, String waarde) {
          String aantal = driver.findElement(By.xpath("//tbody/tr[\"+regel+\"]//td[1][contains(text(), '"+waarde+"')]")).getText();
          Assert.assertEquals(aantal, waarde);
     }

     public void ValidateRapportItemProduct(int regel, String waarde) {
          String product = driver.findElement(By.xpath("//tbody/tr[\"+regel+\"]//td[2][contains(text(), '"+waarde+"')]")).getText();
          Assert.assertEquals(product, waarde);
     }

     public void ValidateRapportItemImport(int regel, String waarde) {
          String imported = driver.findElement(By.xpath("//tbody/tr[\"+regel+\"]//td[3][contains(text(), '"+waarde+"')]")).getText();
          Assert.assertEquals(imported, waarde);
     }

     public void ValidateRapportItemPrijs(int regel, String waarde) {
          String prijs = driver.findElement(By.xpath("//tbody/tr[\"+regel+\"]//td[4][contains(text(), '"+waarde+"')]")).getText();
          Assert.assertEquals(prijs, waarde);
     }

     public void ValidateRapportItemPrijsMetBelasting(int regel, String waarde) {
          String prijsmetbelasting = driver.findElement(By.xpath("//tbody/tr[\"+regel+\"]//td[5][contains(text(), '"+waarde+"')]")).getText();
          Assert.assertEquals(prijsmetbelasting, waarde);
     }

     public void Totaltax(String tax) {
          String totaltax = driver.findElement(By.xpath("//span[@id='TotaalbelastingID']")).getText();
          Assert.assertEquals(totaltax, tax);
     }

     public void Totalprice(String price) {
          String totalprice = driver.findElement(By.xpath("//span[@id='TotaalprijsID']")).getText();
          Assert.assertEquals(totalprice, price);
     }

     // Scenario 6
     public void DeleteProduct() {
          WebElement element = driver.findElement(By.xpath("//tr[@ng-repeat]//td/img"));
          element.click();
     }

     public void ValidateRemovedItem(String product) {
          if (!driver.findElements(By.xpath("//tr/td[@class][contains(text(), '" + product + "')]")).isEmpty()) {
               Assert.fail("The product has not been removed");
          }
     }

}