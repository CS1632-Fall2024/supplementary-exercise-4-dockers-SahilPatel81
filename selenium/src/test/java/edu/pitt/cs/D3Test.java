// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {

    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

  
  }

  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST1LINKS() {
    // Test name: TEST-1-LINKS
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | storeAttribute | linkText=Reset@href | x
    {
      WebElement element = driver.findElement(By.linkText("Reset"));
      String attribute = element.getAttribute("href");
      vars.put("x", attribute);
    }
    // 4 | assert | x | /reset
    //assertEquals(vars.get("x").toString(), "/reset");
    assertEquals(vars.get("x").toString(), "https://cs1632.appspot.com/reset");
  }
  @Test
  public void tEST2RESET() {
    // Test name: TEST-2-RESET
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | runScript | document.cookie = "1=true";document.cookie = "2=true";document.cookie = "3=true"; | 
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\";");
    // 4 | click | linkText=Reset | 
    driver.findElement(By.linkText("Reset")).click();
    // 5 | assertText | xpath=//li[@id='cat-id1'] | ID 1. Jennyanydots
    assertThat(driver.findElement(By.xpath("//li[@id=\'cat-id1\']")).getText(), is("ID 1. Jennyanydots"));
    // 6 | assertText | xpath=//li[@id='cat-id2'] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//li[@id=\'cat-id2\']")).getText(), is("ID 2. Old Deuteronomy"));
    // 7 | assertText | xpath=//li[@id='cat-id3'] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//li[@id=\'cat-id3\']")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST3CATALOG() {
    // Test name: TEST-3-CATALOG
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 4 | storeAttribute | //div[@class='jumbotron']/ol/li[2]/img@src | y
    {
      WebElement element = driver.findElement(By.xpath("//div[@class=\'jumbotron\']/ol/li[2]/img"));
      String attribute = element.getAttribute("src");
      vars.put("y", attribute);
    }
    // 5 | assert | y | /images/cat2.jpg
    assertEquals(vars.get("y").toString(), "https://cs1632.appspot.com/images/cat2.jpg");
  }
  @Test
  public void tEST4LISTING() {
    // Test name: TEST-4-LISTING
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 4 | assertElementPresent | xpath=//div[@id='listing']/ul/li[3] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'listing\']/ul/li[3]"));
      assert(elements.size() > 0);
    }
    // 5 | assertElementNotPresent | xpath=//div[@id='listing']/ul/li[4] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'listing\']/ul/li[4]"));
      assert(elements.size() == 0);
    }
    // 6 | assertText | xpath=//div[@id='listing']/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST5RENTACAT() {
    // Test name: TEST-5-RENT-A-CAT
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | assertElementPresent | //button[text()='Rent'] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[text()=\'Rent\']"));
      assert(elements.size() > 0);
    }
    // 5 | assertElementPresent | //button[text()='Return'] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[text()=\'Return\']"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST6RENT() {
    // Test name: TEST-6-RENT
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | click | id=rentID | 
    driver.findElement(By.id("rentID")).click();
    // 5 | type | id=rentID | 1
    driver.findElement(By.id("rentID")).sendKeys("1");
    // 6 | click | //button[text()='Rent'] | 
    driver.findElement(By.xpath("//button[text()=\'Rent\']")).click();
    // 7 | assertText | xpath=//div[@id='listing']/ul/li[1] | Rented out
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[1]")).getText(), is("Rented out"));
    // 8 | assertText | xpath=//div[@id='listing']/ul/li[2] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[2]")).getText(), is("ID 2. Old Deuteronomy"));
    // 9 | assertText | xpath=//div[@id='listing']/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div[@id=\'listing\']/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
    // 10 | assertText | xpath=//div[@id='rentResult'] | Success!
    assertThat(driver.findElement(By.xpath("//div[@id=\'rentResult\']")).getText(), is("Success!"));
  }
  @Test
  public void tEST7RETURN() {
    // Test name: TEST-7-RETURN
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | runScript | document.cookie = "1=false";document.cookie = "2=true";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=true\";document.cookie = \"3=false\";");
    // 4 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 5 | click | id=returnID | 
    driver.findElement(By.id("returnID")).click();
    // 6 | type | id=returnID | 2
    driver.findElement(By.id("returnID")).sendKeys("2");
    // 7 | click | //button[text()='Return'] | 
    driver.findElement(By.xpath("//button[text()=\'Return\']")).click();
    // 8 | assertText | xpath=//li[@id='cat-id1'] | ID 1. Jennyanydots
    assertThat(driver.findElement(By.xpath("//li[@id=\'cat-id1\']")).getText(), is("ID 1. Jennyanydots"));
    // 9 | assertText | xpath=//li[@id='cat-id2'] | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.xpath("//li[@id=\'cat-id2\']")).getText(), is("ID 2. Old Deuteronomy"));
    // 10 | assertText | xpath=//li[@id='cat-id3'] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//li[@id=\'cat-id3\']")).getText(), is("ID 3. Mistoffelees"));
    // 11 | assertText | xpath=//div[@id='returnResult'] | Success!
    assertThat(driver.findElement(By.xpath("//div[@id=\'returnResult\']")).getText(), is("Success!"));
  }
  @Test
  public void tEST8FEEDACAT() {
    // Test name: TEST-8-FEED-A-CAT
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 4 | assertElementPresent | //button[text()='Feed'] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[text()=\'Feed\']"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST9FEED() {
    // Test name: TEST-9-FEED
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 4 | click | id=catnips | 
    driver.findElement(By.id("catnips")).click();
    // 5 | type | id=catnips | 6
    driver.findElement(By.id("catnips")).sendKeys("6");
    // 6 | click | //button[text()='Feed'] | 
    driver.findElement(By.xpath("//button[text()=\'Feed\']")).click();
    // 7 | waitForElementPresent | xpath=//*[@id='feedResult' and text()='Nom, nom, nom.'] | 2000
    {
      //WebDriverWait wait = new WebDriverWait(driver, 2);
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'feedResult\' and text()=\'Nom, nom, nom.\']")));
    }
    // 8 | assertText | xpath=//div[@id='feedResult'] | Nom, nom, nom.
    assertThat(driver.findElement(By.xpath("//div[@id=\'feedResult\']")).getText(), is("Nom, nom, nom."));
  }
  @Test
  public void tEST10GREETACAT() {
    // Test name: TEST-10-GREET-A-CAT
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | click | linkText=Greet-A-Cat | 
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    // 4 | assertText | xpath=//div[@id='greeting']/h4 | Meow!Meow!Meow!
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow!Meow!Meow!"));
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    // Test name: TEST-11-GREET-A-CAT-WITH-NAME
    // Step # | name | target | value
    // 1 | open | https://cs1632.appspot.com/ | 
    driver.get("https://cs1632.appspot.com/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false"; | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\";");
    // 3 | open | https://cs1632.appspot.com/greet-a-cat/Jennyanydots | 
    driver.get("https://cs1632.appspot.com/greet-a-cat/Jennyanydots");
    // 4 | assertText | xpath=//div[@id='greeting']/h4 | Meow! from Jennyanydots.
    assertThat(driver.findElement(By.xpath("//div[@id=\'greeting\']/h4")).getText(), is("Meow! from Jennyanydots."));
  }
}
