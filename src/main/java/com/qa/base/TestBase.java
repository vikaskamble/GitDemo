package com.qa.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase{

    public static WebDriver driver;


public WebDriver getInitBrowser(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(  );
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait( Duration.ofSeconds( 40 ) );
    driver.manage().timeouts().scriptTimeout( Duration.ofSeconds( 30 ) );
    driver.manage().timeouts().pageLoadTimeout( Duration.ofSeconds( 40 ) );
    driver.get( "https://www.google.com/" );
    return driver;
}

}
