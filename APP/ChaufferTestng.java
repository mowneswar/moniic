package APP;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
public class ChaufferTestng {
	private AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Nokia 8.1");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "11");
        caps.setCapability("appPackage", "com.moniic.chauffeur.pp");
        caps.setCapability("appActivity", "com.ourlane.driver.MainActivity");
        caps.setCapability("deviceID", "PNXID19051300665");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("newCommandTimeout", 300);

        driver = new AppiumDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Application Started");
    }

    @Test
    public void testLaunchAndAccept() throws InterruptedException, IOException {
        System.out.println("Application Started");
        Thread.sleep(6000);

        WebElement locsharAlw = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]"));
        locsharAlw.click();
        Thread.sleep(3000);

        WebElement allowLoc = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
        allowLoc.click();
        Thread.sleep(1000);

        WebElement allowphyActi = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
        allowphyActi.click();
        Thread.sleep(3000);

        WebElement skipBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='SKIP']"));
        skipBtn.click();
        Thread.sleep(1000);

        WebElement numWidget = driver.findElement(By.xpath("//android.widget.EditText[@bounds='[358,582][987,695]']"));
        numWidget.click();
        Thread.sleep(1000);
        numWidget.sendKeys("700555555");
        Thread.sleep(3000);

        WebElement prcdBtn = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,749][1014,880]']"));
        prcdBtn.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement otpshell = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,594][200,713]']"));
        otpshell.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        executeADBCommand("adb shell input text 2");
        executeADBCommand("adb shell input text 3");
        executeADBCommand("adb shell input text 4");
        executeADBCommand("adb shell input text 8");
        executeADBCommand("adb shell input text 7");
        executeADBCommand("adb shell input text 6");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement accptTrip = driver.findElement(By.xpath("//android.widget.TextView[@text='ACCEPT']"));
        accptTrip.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement notifyRider = driver.findElement(By.xpath("//android.widget.TextView[@text='NOTIFY RIDER']"));
        notifyRider.click();
        Thread.sleep(1000);

        WebElement oK = driver.findElement(By.xpath("//android.view.ViewGroup[@index='3']"));
        oK.click();
        Thread.sleep(1000);

        WebElement enterOTP = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,1868][520,1999]']"));
        enterOTP.click();
        Thread.sleep(1000);

        WebElement startTrip = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,944][1014,1075]']"));
        startTrip.click();

        Thread.sleep(140000);

        new TouchAction<>(driver)
            .press(PointOption.point(128, 1926))
            .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
            .moveTo(PointOption.point(958, 1929))
            .release()
            .perform();

        Thread.sleep(1000);

        WebElement doneBtn = driver.findElement(By.xpath("//android.widget.TextView[@text='DONE']"));
        doneBtn.click();
        Thread.sleep(1000);

        WebElement doneBtn2 = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,1871][1014,2002]']"));
        doneBtn2.click();
        Thread.sleep(1000);

        WebElement skipBtn1 = driver.findElement(By.xpath("//android.view.ViewGroup[@bounds='[66,1871][527,2002]']"));
        skipBtn1.click();
        Thread.sleep(1000);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private static void executeADBCommand(String adbCommand) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec(adbCommand);
        process.waitFor();
    }

}
