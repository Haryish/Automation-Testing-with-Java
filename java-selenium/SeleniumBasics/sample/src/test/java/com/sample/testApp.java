package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testApp extends reporter{

    @BeforeClass
    public void setUp() {
        // Initialize Extent Report before tests
        setupReport();
    }

    @Test
    public void sampleTestmethod() {

        ExtentTest test = report.createTest("sampleTestmethod");
        test.pass("This test is passed");
        test.info("Test Started");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.close();
    }

    @AfterClass
    public void tearDown() {
        // Flush the report after tests
        flushReport();
    }

}
