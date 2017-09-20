package priv.WebDriver.API;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author 作者：BarryAllen
* @version 创建时间：2017年9月20日 上午11:07:53 
* 类说明 
*/
public class getPageSource {
	WebDriver driver;
	String baseUrl = "http://10.10.192.94:8082/fuhe24-collection";
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		String pagesource1 = driver.getPageSource();
		System.out.println(pagesource1);
		Thread.sleep(5000);
	}

}
