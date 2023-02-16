package util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import baseclass.TestBase;

public class Screenshot extends TestBase {
	public static void screenshot(String filename) {

		TakesScreenshot tcs = (TakesScreenshot) driver;
		File source = tcs.getScreenshotAs(OutputType.FILE);
		String path = "C:\\Users\\User\\eclipse-workspace\\Ticket_System\\screenshots\\" + filename
				+ System.currentTimeMillis() + ".png";
		File dest = new File(path);
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("Exeption for Taking ScreenShot");
		}
	}
}
