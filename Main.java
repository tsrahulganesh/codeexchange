
package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenUrl {
    public static void main(String[] args) {
        // Auto-download and configure the right ChromeDriver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");      // run headless (no visible browser)
        options.addArguments("--no-sandbox");        // useful in restricted environments
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        try {
            String url = "https://www.google.com";
            driver.get(url);
            System.out.println("Opened: " + url);
            System.out.println("Title: " + driver.getTitle());
        } finally {
            driver.quit();
        }
    }
}  // ✅ Added this closing brace for the class
