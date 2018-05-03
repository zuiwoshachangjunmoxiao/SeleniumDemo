package cn.gloryroad;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstWebDriverDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String baseUrl;
		
		//设定Firefox浏览器的安装路径
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "D:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		baseUrl = "http://www.sogou.com/";
		//打开搜狗首页
		driver.get(baseUrl + "/");
		//在搜索输入框中输入“光荣之路自动化测试”
		driver.findElement(By.id("query")).sendKeys("光荣之路自动化测试");
		//单击“搜索”按钮
		driver.findElement(By.id("stb")).click();
		

	}

}
