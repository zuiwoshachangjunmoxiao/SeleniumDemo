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
* @author ���ߣ�BarryAllen
* @version ����ʱ�䣺2017��9��19�� ����3:56:50 
* ������ҳ�������Ԥ��ֵ 
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
		/*
		 * ���Ա���title
		 */
		
		driver.get("http://www.baidu.com");
		//��ȡ��ҳ�ı���
		String title1 = driver.getTitle();
		//��ӡtitle
		System.out.println(title1);
		//������ҳ�ı���
		assertEquals("�ٶ�һ�£����֪��",title1);
		Thread.sleep(3000);
		
		//���ϴ���ļ��д��
		assertEquals("�ٶ�һ�£����֪��", driver.getTitle());
		
		//String���contains����������һ���������͵�ֵ
		String a = "asdfgh";
		boolean b = a.contains("asd");
		System.out.println(b);
		
		//������ҳ�����Ƿ�������ٶȡ�
		String title2 = driver.getTitle();
		boolean t2 = title2.contains("�ٶ�");
		assertTrue(t2);
		
		//�������д���ļ��д��
		assertTrue(driver.getTitle().contains("�ٶ�"));
	}
	
	@Ignore
	public void test1() throws Exception {
		/*
		 * ���Ա�ǩ���ı�
		 */
		
		driver.get(baseUrl);
		//��������
		driver.manage().window().maximize();
		//��ȡ��ǩ���ı�
		String s1 = driver.findElement(By.xpath(".//*[@id='setf']")).getText();
		System.out.println(s1);
		//���Ա�ǩ�ı��Ƿ��Ԥ��ֵһ��
		assertEquals("�Ѱٶ���Ϊ��ҳ", s1);
		
		//���ϴ���ļ��д��
		//���Ա�ǩ���ı���Ԥ��ֵ�Ƿ�һ��
		assertEquals("�Ѱٶ���Ϊ��ҳ", driver.findElement(By.xpath(".//*[@id='setf']")).getText());
		
		//������ҳ�Ĵ��ı������ӵ��ı����ݰ���Ԥ��ֵ��Ԥ��ֵΪ����Ϊ��ҳ
		assertTrue(driver.findElement(By.xpath(".//*[@id='setf']")).getText().contains("��Ϊ��ҳ"));
	}
	
	@Test
	public void test2() throws Exception {
		/*
		 * �����ı��򡢰�ť��valueֵ
		 */
		
		driver.get(baseUrl);
		
	}

}
