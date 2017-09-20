package priv.WebDriver.API;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


/** 
* @author 作者：BarryAllen
* @version 创建时间：2017年9月18日 下午3:53:45 
* new一个新的test case 
*/
public class operateSelectBox {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		//打开浏览器
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		//关闭浏览器
		driver.quit();
		
	}

	@Test
	public void test() throws Exception {
		//启动浏览器后，打开一个网页
		driver.get("http://www.baidu.com/");
		//等待3s=3000毫秒
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fail("Not yet implemented");
		
		//定位下拉框
		WebElement b = driver.findElement(By.id("brand"));
		//封装为Select对象
		Select bs = new Select(b);
		//方法一：通过选项文本选择一个下拉框选项
		bs.selectByVisibleText("联想");
		Thread.sleep(3000);
		//方法二：通过选项编号选择一个下拉框选项
		bs.selectByIndex(2);
		Thread.sleep(3000);
		//方法三：通过选项的值（value属性的值）选择一个下拉框选项
		bs.selectByValue("联想");
		Thread.sleep(3000);
		
	}

}
