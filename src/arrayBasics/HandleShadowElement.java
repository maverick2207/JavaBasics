package arrayBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleShadowElement {

    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromeDriver.setup();
        WebDriver driver = new ChromeDriver();
        driver.get("chrome://downloads/");
        Thread.sleep(5000);
//        document.querySelector('downloads-manager').shadowRoot.querySelector('iron-list > downloads-item').shadowRoot.querySelector('div > div>a')
        // create element using java script executor

        JavascriptExecutor js = (JavascriptExecutor) driver;
       WebElement link =  (WebElement) js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('iron-list > downloads-item').shadowRoot.querySelector('div > div>a')");
   js.executeScript("arguments[0].click();",link);
   // to pass value

        js.executeScript("argument[0].setAttribute('value', 'abc');",link);


    }
}
