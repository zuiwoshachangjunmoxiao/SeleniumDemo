package priv.WebDriver.API;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author ���ߣ�BarryAllen
* @version ����ʱ�䣺2017��9��20�� ����11:14:26 
* ��selenium��getPageSource������ȡҳ���Դ�룬��Java��main������ʵ�֡�
*/
public class getPageSourceJava {
	

	public static void main(String[] args) {
		WebDriver driver;
		String baseUrl = "http://10.10.192.94:8082/fuhe24-collection";
		driver = new FirefoxDriver();
		//����ҳ
		driver.get(baseUrl);
		//��ȡԴ��
		String pageSource1 = driver.getPageSource();
		System.out.println(pageSource1);
		

	}

}
