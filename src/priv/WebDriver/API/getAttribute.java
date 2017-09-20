package priv.WebDriver.API;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author 作者：BarryAllen
* @version 创建时间：2017年9月20日 下午4:20:18 
* getAttribute 获取 文本框、按钮等元素的属性值，例如：获取 value值,返回值是一个字符串。
*/
public class getAttribute {
	WebDriver driver;
	String baseUrl = "https://www.baidu.com/";

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("https://www.baidu.com/");
		driver.findElement(By.id("kw")).sendKeys("使用 getAttribute 方法回去文本框的value值");
		//获取输入框的value值
		System.out.println(driver.findElement(By.id("kw")).getAttribute("value"));
		assertEquals("使用 getAttribute 方法回去文本框的value值", driver.findElement(By.id("su")).getAttribute("value"));
		//获取百度一下按钮的value值
		System.out.println(driver.findElement(By.id("su")).getAttribute("value"));
		//断言是否和预期值一样
		assertEquals("百度一下", driver.findElement(By.id("su")).getAttribute("value"));
		assertTrue(driver.findElement(By.id("su")).getAttribute("value").contains("百度"));
		
		//获取输入框的class值
		System.out.println(driver.findElement(By.id("kw")).getAttribute("class"));
		//获取百度一下按钮的type值
		System.out.println(driver.findElement(By.id("su")).getAttribute("type"));
	}

}
