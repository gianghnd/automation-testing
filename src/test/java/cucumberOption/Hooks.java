package cucumberOption;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
    // Run for many thread
    private static WebDriver driver;
    public static final Logger log = Logger.getLogger(Hooks.class.getName());

    @Before
    public synchronized static WebDriver openAndQuitBrowser() {
        // Run by Maven command line
        String browser = System.getProperty("BROWSER");
        System.out.println("Browser name run by command line = " + browser);

        if (driver == null) {
            try {
                if (browser == null) {
                    // Get browser name from Environment Variable in OS
                    browser = System.getenv("BROWSER");
                    if (browser == null) {
                        // Set default browser
                        browser = "chrome";
                    }
                }

                switch (browser) {
                    case "hchrome"://change to have default headless mode
                        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/browserDriver/chromedriver");
                        driver = new ChromeDriver();
                        break;
                    case "chrome"://change to have default headless mode
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments("headless");
                        chromeOptions.addArguments("window-size=1920x1080");
                        driver = new ChromeDriver(chromeOptions);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
                        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                        driver = new FirefoxDriver();
                        break;
                    case "hfirefox":
                        WebDriverManager.firefoxdriver().setup();
                        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
                        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        firefoxOptions.setHeadless(true);
                        driver = new FirefoxDriver(firefoxOptions);
                        break;
                    case "ie":
                        WebDriverManager.iedriver().arch32().setup();
                        driver = new InternetExplorerDriver();
                        break;
                    default:
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                }
            } catch (UnreachableBrowserException e) {
                driver = new ChromeDriver();
                // Driver crash
            } catch (WebDriverException e) {
                driver = new ChromeDriver();
            } finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }

            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            log.info("------------- Started the browser -------------");
        }
        return driver;
    }

    public static void closeBrowserAndDriver() {
        try {
            String osName = System.getProperty("os.name").toLowerCase();
            log.info("OS name = " + osName);

            // Khai báo 1 biến command line để thực thi
            String cmd = "";
            if (driver != null) {
                driver.manage().deleteAllCookies();
                driver.quit();
            }

            if (driver.toString().toLowerCase().contains("chrome")) {
                if (osName.toLowerCase().contains("mac")) {
                    cmd = "pkill chromedriver";
                } else if (osName.toLowerCase().contains("windows")) {
                    cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
                }
            } else if (driver.toString().toLowerCase().contains("internetexplorer")) {
                if (osName.toLowerCase().contains("window")) {
                    cmd = "taskkill /F /FI \"IMAGENAME eq IEDriverServer*\"";
                }
            } else if (driver.toString().toLowerCase().contains("firefox")) {
                if (osName.toLowerCase().contains("mac")) {
                    cmd = "pkill geckodriver";
                } else if (osName.toLowerCase().contains("windows")) {
                    cmd = "taskkill /F /FI \"IMAGENAME eq geckodriver*\"";
                }
            }

            driver = null;

            Process process = Runtime.getRuntime().exec(cmd);
            process.waitFor();

            log.info("---------- QUIT BROWSER SUCCESS ----------");
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }

    private static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            closeBrowserAndDriver();
        }
    }

}