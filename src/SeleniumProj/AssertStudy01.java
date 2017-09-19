package SeleniumProj;

import static org.junit.Assert.*;

import java.sql.Driver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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

	@Test
	public void test() throws Exception {
		driver.get("http://www.baidu.com");
		//获取网页的标题
		String title1 = driver.getTitle();
		//打印title
		System.out.println(title1);
		//断言网页的标题
		assertEquals("百度一下，你就知道",title1);
		Thread.sleep(3000);
	}

}
