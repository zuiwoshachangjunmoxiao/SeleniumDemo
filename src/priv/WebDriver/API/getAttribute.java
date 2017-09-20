package priv.WebDriver.API;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author ���ߣ�BarryAllen
* @version ����ʱ�䣺2017��9��20�� ����4:20:18 
* getAttribute ��ȡ �ı��򡢰�ť��Ԫ�ص�����ֵ�����磺��ȡ valueֵ,����ֵ��һ���ַ�����
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
		driver.findElement(By.id("kw")).sendKeys("ʹ�� getAttribute ������ȥ�ı����valueֵ");
		//��ȡ������valueֵ
		System.out.println(driver.findElement(By.id("kw")).getAttribute("value"));
		assertEquals("ʹ�� getAttribute ������ȥ�ı����valueֵ", driver.findElement(By.id("su")).getAttribute("value"));
		//��ȡ�ٶ�һ�°�ť��valueֵ
		System.out.println(driver.findElement(By.id("su")).getAttribute("value"));
		//�����Ƿ��Ԥ��ֵһ��
		assertEquals("�ٶ�һ��", driver.findElement(By.id("su")).getAttribute("value"));
		assertTrue(driver.findElement(By.id("su")).getAttribute("value").contains("�ٶ�"));
		
		//��ȡ������classֵ
		System.out.println(driver.findElement(By.id("kw")).getAttribute("class"));
		//��ȡ�ٶ�һ�°�ť��typeֵ
		System.out.println(driver.findElement(By.id("su")).getAttribute("type"));
	}

}
