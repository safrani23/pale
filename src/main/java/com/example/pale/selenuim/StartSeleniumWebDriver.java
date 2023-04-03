package com.example.pale.selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartSeleniumWebDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver","webdriver/chromedriver-win32-111.0.5563.64.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
    }
}
