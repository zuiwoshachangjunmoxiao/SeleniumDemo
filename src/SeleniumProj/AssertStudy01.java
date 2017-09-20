package SeleniumProj;

import static org.junit.Assert.*;

import java.awt.print.Printable;
import java.nio.channels.SeekableByteChannel;
import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author 作者：BarryAllen
* @version 创建时间：2017年9月19日 下午3:56:50 
* 断言网页标题等于预期值 
*/
public class AssertStudy01 {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		driver=new FirefoxDriver();
		baseUrl = "http://www.baidu.com";
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Ignore
	public void test() throws Exception {
		driver.get("http://www.baidu.com");
		//获取网页的标题
		String title1 = driver.getTitle();
		//打印title
		System.out.println(title1);
		//断言网页的标题
		assertEquals("百度一下，你就知道",title1);
		Thread.sleep(3000);
		
		//以上代码的简洁写法
		assertEquals("百度一下，你就知道", driver.getTitle());
		
		//String类的contains方法，返回一个布尔类型的值
		String a = "asdfgh";
		boolean b = a.contains("asd");
		System.out.println(b);
		
		//断言网页标题是否包含“百度”
		String title2 = driver.getTitle();
		boolean t2 = title2.contains("百度");
		assertTrue(t2);
		
		//上面三行代码的简洁写法
		assertTrue(driver.getTitle().contains("百度"));
	}
	
	@Test
	public void test1() throws Exception {
		driver.get(baseUrl);
		//浏览器最大化
		driver.manage().window().maximize();
		//获取标签的文本
		String s1 = driver.findElement(By.xpath(".//*[@id='setf']")).getText();
		System.out.println(s1);
		//断言标签文本是否和预期值一样
		assertEquals("把百度设为主页", s1);
		
		//以上代码的简洁写法
		//断言标签的文本和预期值是否一样
		assertEquals("把百度设为主页", driver.findElement(By.xpath(".//*[@id='setf']")).getText());
		
		//断言网页的纯文本或链接的文本内容包含预期值，预期值为：设为主页
		assertTrue(driver.findElement(By.xpath(".//*[@id='setf']")).getText().contains("设为主页"));
	}

}
