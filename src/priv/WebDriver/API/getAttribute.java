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
		driver.findElement(By.id("kw")).sendKeys("ʹ�� getAttribute ������ȥ�ı����valueֵ");
		//��ȡ������valueֵ
		System.out.println(driver.findElement(By.id("kw")).getAttribute("value"));
		//����������valueֵ
		assertEquals("ʹ�� getAttribute ������ȥ�ı����valueֵ", driver.findElement(By.id("kw")).getAttribute("value"));
		//��ȡ�ٶ�һ�°�ť��valueֵ
		System.out.println(driver.findElement(By.id("su")).getAttribute("value"));
		//���԰ٶ�һ�°�ť��valueֵ
		assertEquals("�ٶ�һ��", driver.findElement(By.id("su")).getAttribute("value"));
		assertTrue(driver.findElement(By.id("su")).getAttribute("value").contains("�ٶ�"));
		
		//��ȡ������classֵ
		System.out.println(driver.findElement(By.id("kw")).getAttribute("class"));
		//��ȡ�ٶ�һ�°�ť��typeֵ
		System.out.println(driver.findElement(By.id("su")).getAttribute("type"));
		
		//��ȡ�ٶ�һ��ͼƬ��src����
		System.out.println(driver.findElement(By.xpath(".//*[@id='lg']/img")).getAttribute("src"));
		//���԰ٶ�һ��ͼƬ��src���ԣ���ͼƬ�����Ƿ����bd
		assertTrue(driver.findElement(By.xpath(".//*[@id='lg']/img")).getAttribute("src").contains("bd"));
		
//		//���Ե�ѡ��ť���߸�ѡ��ѡ��
//		assertTrue(driver.findElement(By.xpath("XXXXX")).isSelected());
//		//���Ե�ѡ��ť���߸�ѡ��û�б�ѡ��
//		assertFalse(driver.findElement(By.xpath("XXXXX")).isSelected());
//		//����һ�鸴ѡ���ѡ��ť����һ����ѡ��ѡ�У��ڶ����͵�������ѡ��û�б�ѡ��
//		assertTrue(driver.findElements(By.name("XXXXX")).get(0).isSelected());
//		assertFalse(driver.findElements(By.name("XXXXX")).get(1).isSelected());
//		assertFalse(driver.findElements(By.name("XXXXX")).get(2).isSelected());
//		
//		//����һ�鸴ѡ���ѡ��ť����һ����ѡ�У��ڶ����������û�б�ѡ�У�����ʹ��forѭ�����Ż�����
//		for(int i=1;i<5;i++){
//			assertFalse(driver.findElements(By.name("XXXXX")).get(i).isSelected());
//		}
		
//		//����ĳһ�鵥ѡ��ť��ѡ��ĸ�����5��
//		assertEquals(5,driver.findElements(By.name("XXXXX")).size());
//		
//		//����һ��Ԫ���Ƿ����,���߶���ָ����Ԫ���Ƿ����
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
