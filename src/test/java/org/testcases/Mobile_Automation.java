package org.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Mobile_Automation {
	
	AppiumDriver<MobileElement> driver;

	@Test
	public void Mobile_Automation_Test() throws Throwable {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", "Pixel 3a");
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "11");
		desiredCapabilities.setCapability("app", "D:\\Application\\Interact\\Interact_1.7.8_221.apk");
		driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Interact App version 1.7.8_221 Launched Successfully");
	}

}
