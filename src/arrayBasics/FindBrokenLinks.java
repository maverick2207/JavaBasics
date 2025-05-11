package arrayBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.seleniumhq.jetty9.http.HttpStatus;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class FindBrokenLinks {
    private static WebDriver driver = null;
    private static final String homePage = "https://www.amazon.com/";
    private static final String url = "https//www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {

        HttpURLConnection con = null;

        System.setProperty("webdriver.chrome.driver","D:\\Selenium-Java\\automationpractice\\DriverFiles\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
        option.addArguments("disable-infobar");

        driver = new ChromeDriver(option);
//
        driver.get(homePage);
//		
//		Thread.sleep(5000);
//		
//		List<WebElement> weblist = driver.findElements(By.tagName("a"));
//		System.out.println("Total links present in the site is : "+weblist.size());
//
//		Iterator<WebElement> itr = weblist.iterator();
//		while (itr.hasNext()) {
//			url = itr.next().getAttribute("href");
//
////			System.out.println(url);
//
//			if (url == null || url.isEmpty()) {
//				System.out.println("URL is either not configured for anchor tag or it is empty");
////				throw new ArithmeticException();
//				continue;
//			}
//			
//			if (!url.startsWith(homePage)) {
//				System.out.println("URL belongs to another domain, skipping it.");
//				continue;
//			}

        try {
            URL link = new URL(url);
            con = (HttpURLConnection) link.openConnection();
            con.setConnectTimeout(2000);
            con.connect();
            con.setConnectTimeout(2000);
            int responseCode = con.getResponseCode();



            if (responseCode == HttpStatus.BAD_REQUEST_400) {
                System.out.println(url + " -- is a broken link -- " + responseCode + " " + con.getResponseMessage());
            } else if (responseCode == HttpStatus.OK_200) {
                System.out.println(url + " -- is a valid link -- " + responseCode + " " + con.getResponseMessage());
            } else {
                System.out.println(url + " -- Response and Message Recieved -- " + responseCode + " " + con.getResponseMessage());
//				throw new InterruptedException();
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
//		driver.quit();

}


