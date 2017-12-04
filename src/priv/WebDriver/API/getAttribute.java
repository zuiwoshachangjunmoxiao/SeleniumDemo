package priv.WebDriver.API;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author 作者：BarryAllen
* @version 创建时间：2017年9月20日 下午4:20:18 
* getAttribute 获取 文本框、按钮等元素的属性值，例如：获取 value值,返回值是一个字符串
*/
public class getAttribute {
	WebDriver driver;
	String baseUrl = "https://www.baidu.com/";

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("https://www.baidu.com/");
		driver.findElement(By.id("kw")).clear();
		driver.findElement(By.id("kw")).sendKeys("使用 getAttribute 方法回去文本框的value值");
		//获取输入框的value值
		System.out.println(driver.findElement(By.id("kw")).getAttribute("value"));
		//断言输入框的value值
		assertEquals("使用 getAttribute 方法回去文本框的value值", driver.findElement(By.id("kw")).getAttribute("value"));
		//获取百度一下按钮的value值
		System.out.println(driver.findElement(By.id("su")).getAttribute("value"));
		//断言百度一下按钮的value值
		assertEquals("百度一下", driver.findElement(By.id("su")).getAttribute("value"));
		assertTrue(driver.findElement(By.id("su")).getAttribute("value").contains("百度"));
		
		//获取输入框的class值
		System.out.println(driver.findElement(By.id("kw")).getAttribute("class"));
		//获取百度一下按钮的type值
		System.out.println(driver.findElement(By.id("su")).getAttribute("type"));
		
		//获取百度一下图片的src属性
		System.out.println(driver.findElement(By.xpath(".//*[@id='lg']/img")).getAttribute("src"));
		//断言百度一下图片的src属性，即图片名称是否包含bd
		assertTrue(driver.findElement(By.xpath(".//*[@id='lg']/img")).getAttribute("src").contains("bd"));
		
//		//断言单选按钮或者复选框被选中
//		assertTrue(driver.findElement(By.xpath("XXXXX")).isSelected());
//		//断言单选按钮或者复选框没有被选中
//		assertFalse(driver.findElement(By.xpath("XXXXX")).isSelected());
//		//断言一组复选框或单选按钮，第一个复选框被选中，第二个和第三个复选框没有被选中
//		assertTrue(driver.findElements(By.name("XXXXX")).get(0).isSelected());
//		assertFalse(driver.findElements(By.name("XXXXX")).get(1).isSelected());
//		assertFalse(driver.findElements(By.name("XXXXX")).get(2).isSelected());
//		
//		//断言一组复选框或单选按钮，第一个被选中，第二个到第五个没有被选中，可以使用for循环来优化代码
//		for(int i=1;i<5;i++){
//			assertFalse(driver.findElements(By.name("XXXXX")).get(i).isSelected());
//		}
		
//		//断言某一组单选按钮或复选框的个数是5个
//		assertEquals(5,driver.findElements(By.name("XXXXX")).size());
//		
//		//断言一个元素是否存在,或者断言指定的元素是否出现
//		assertTrue(isElementPresent(By.xpath("XXXXX")));
//	}
//	
//	
//	private boolean isElementPresent(By by) {
//		try {
//			driver.findElement(by);
//			return true;
//		} catch (NoSuchElementException e) {
//			return false;
//		}
	}

}
