package SeleniumProj;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstWebDriverDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String baseUrl;
		
		//�趨Firefox������İ�װ·��
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		driver = new FirefoxDriver();
		baseUrl = "http://www.baidu.com/";
		//���ѹ���ҳ
		driver.get(baseUrl + "/");
		//����������������롰����֮·�Զ������ԡ�
		driver.findElement(By.id("kw")).sendKeys("����֮·�Զ�������");
		//��������������ť
		driver.findElement(By.id("su")).click();
		

	}

}
