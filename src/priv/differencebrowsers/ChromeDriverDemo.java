package priv.differencebrowsers;
/** 
* @author 作者 BarryAllen: 
* @version 创建时间：2017年9月18日 上午9:47:44 
* 类说明 
*/

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeDriverDemo {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		// 指定Chrome驱动的位置，第一个参数 webdriver.chrome.driver ；第二个参数：驱动的位置
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://10.10.192.92:8080/";

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
		driver.get(baseUrl + "/fuhe24-portal/userlogin/userLogin/userLoginDetail.action");
		driver.findElement(By.id("loginId")).clear();
		driver.findElement(By.id("loginId")).sendKeys("wfdata");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.cssSelector("input.dlbtn")).click();
		driver.findElement(By.linkText("退 出")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
