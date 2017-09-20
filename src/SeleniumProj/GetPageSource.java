package SeleniumProj;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author ���ߣ�BarryAllen
* @version ����ʱ�䣺2017��9��20�� ����11:07:53 
* ��˵�� 
*/
public class GetPageSource {
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
