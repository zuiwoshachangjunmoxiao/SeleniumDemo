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
* @author ���ߣ�BarryAllen
* @version ����ʱ�䣺2017��9��20�� ����3:33:34 
* ������������� 
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
		
		//����һ�� Point ��������150��ʾ�������λ���������Ļ�����Ͻǣ�0��0���ĺ�����������������롣
		Point point = new Point(150,150);
		//���� Dimension ��������500��ʾ��������ڵĳ��ȺͿ��
		Dimension dimension = new Dimension(500,500);
		
		//setPosition ������ʾ�趨���������Ļ�ϵ�λ��Ϊ point ��������� (150,150),ĳЩ������汾�´η���ʧЧ��
		driver.manage().window().setPosition(point);
		//setSize ������ʾ�趨��������ڵĴ�СΪ���� 500 ����λ�Ϳ�Ϊ 500 ����λ��
		driver.manage().window().setSize(dimension);
		
		//getPosition ������ʾ��ȡ��ǰ���������Ļ��λ�ã�ĳЩ������汾�´η���ʧЧ��
		System.out.println(driver.manage().window().getPosition());
		//getSize ������ʾ��ȡ��ǰ��������ڵĴ�С��
		System.out.println(driver.manage().window().getSize());
		
		//maximize ������ʾ�������������󻯡�
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getSize());
		
		driver.get(baseUrl);
		Thread.sleep(5000);
		
	}

}
