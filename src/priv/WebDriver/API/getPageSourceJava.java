package priv.WebDriver.API;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/** 
* @author 作者：BarryAllen
* @version 创建时间：2017年9月20日 上午11:14:26 
* 用selenium的getPageSource方法获取页面的源码，在Java的main方法中实现。
*/
public class getPageSourceJava {
	

	public static void main(String[] args) {
		WebDriver driver;
		String baseUrl = "http://10.10.192.94:8082/fuhe24-collection";
		driver = new FirefoxDriver();
		//打开网页
		driver.get(baseUrl);
		//获取源码
		String pageSource1 = driver.getPageSource();
		System.out.println(pageSource1);
		

	}

}
