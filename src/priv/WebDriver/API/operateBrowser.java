package priv.WebDriver.API;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author 作者：BarryAllen
* @version 创建时间：2017年9月20日 下午3:33:34 
* 操作浏览器窗口 
*/
public class operateBrowser {
	WebDriver driver;
	String baseUrl = "http://roll.finance.sina.com.cn/blog/blogarticle/inde_1089.shtml";

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
		
		//声明一个 Point 对象，两个150表示浏览器的位置相对于屏幕的左上角（0，0）的横坐标距离和纵坐标距离。
		Point point = new Point(150,150);
		//声明 Dimension 对象，两个500表示浏览器窗口的长度和宽度
		Dimension dimension = new Dimension(500,500);
		
		//setPosition 方法表示设定浏览器在屏幕上的位置为 point 对象的坐标 (150,150),某些浏览器版本下次方法失效。
		driver.manage().window().setPosition(point);
		//setSize 方法表示设定浏览器窗口的大小为长的 500 个单位和宽为 500 个单位。
		driver.manage().window().setSize(dimension);
		
		//getPosition 方法表示获取当前浏览器在屏幕的位置，某些浏览器版本下次方法失效。
		System.out.println(driver.manage().window().getPosition());
		//getSize 方法表示获取当前浏览器窗口的大小。
		System.out.println(driver.manage().window().getSize());
		
		//maximize 方法表示将浏览器窗口最大化。
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		
		driver.get(baseUrl);
		Thread.sleep(5000);
		
	}

}
