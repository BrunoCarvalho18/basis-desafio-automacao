package br.com.desafio.basis.automacao.core;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

	private static WebDriver driver;
	private static String OS = System.getProperty("os.name").toLowerCase();

	public Driver() {

	}

	public static boolean eWindows() {

		return (OS.indexOf("win") >= 0);

	}

	//Configuracao Driver
	public static WebDriver getDriver() {

		
        //Configurar para windows
		if (eWindows()) {
			System.setProperty("webdriver.chrome.driver",
				    System.getProperty("user.dir") + "/src/main/resources/webdriver/chromedriver.exe");
		}

		if (driver == null) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
		}

		return driver;

	}
	
    // Encerrar driver
	public static WebDriver encerraDriver() {
		if (driver != null) {
			driver.quit();
		}
		return driver;
	}

}
