package StepDefinitions;

import Pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;


public class TestBase {


    @Before
    public void setUp() throws IOException {
        String propertiesPath = System.getProperty("user.dir")+"/src/test/resources/Configs/DevEnv.properties";
        Properties properties = new Properties();
        FileInputStream configFile = new FileInputStream(propertiesPath);
        properties.load(configFile);

        String AUT_URL = properties.getProperty("AUT_URL");
        String browser = properties.getProperty("browser");


        if (browser.equalsIgnoreCase("Chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            BasePage.driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("FireFox")) {
            BasePage.driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Safari")) {
            BasePage.driver = new SafariDriver();
        } else if (browser.equalsIgnoreCase("Edge")){
            BasePage.driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please pass a valid browser type in properties class");
        }

        BasePage.driver.manage().window().maximize();
        BasePage.driver.manage().deleteAllCookies();
        BasePage.driver.get(AUT_URL);
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            Date date = new Date();
            String screenShotFileName = date.toString().replace(" ","-").replace(":","_");

            TakesScreenshot takesScreenshot = (TakesScreenshot) BasePage.driver;
            byte[] screenshotByte = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotByte,"image/png",screenShotFileName);
        }
        BasePage.driver.quit();
    }
}
