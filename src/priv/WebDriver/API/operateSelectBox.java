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
* @author ���ߣ�BarryAllen
* @version ����ʱ�䣺2017��9��18�� ����3:53:45 
* newһ���µ�test case 
*/
public class operateSelectBox {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		//�������
		driver = new FirefoxDriver();
	}

	@After
	public void tearDown() throws Exception {
		//�ر������
		driver.quit();
		
	}

	@Test
	public void test() throws Exception {
		//����������󣬴�һ����ҳ
		driver.get("http://www.baidu.com/");
		//�ȴ�3s=3000����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fail("Not yet implemented");
		
		//��λ������
		WebElement b = driver.findElement(By.id("brand"));
		//��װΪSelect����
		Select bs = new Select(b);
		//����һ��ͨ��ѡ���ı�ѡ��һ��������ѡ��
		bs.selectByVisibleText("����");
		Thread.sleep(3000);
		//��������ͨ��ѡ����ѡ��һ��������ѡ��
		bs.selectByIndex(2);
		Thread.sleep(3000);
		//��������ͨ��ѡ���ֵ��value���Ե�ֵ��ѡ��һ��������ѡ��
		bs.selectByValue("����");
		Thread.sleep(3000);
		
	}

}
