package priv.DataCollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import priv.DataCollection.GetDateTime;

/** 
* @author 作者：BarryAllen
* @version 创建时间：2017年9月26日 下午3:41:03 
* 类说明 
*/
public class SinaStockColl {
	public WebDriver driver;
	public GetDateTime dataTime;
	String baseUrl = "http://blog.sina.com.cn/s/blog_4e3980540102xzck.html";
	
	//打开浏览器
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new FirefoxDriver();
	}
	
	//关闭标签页
	public void QuitBrowser(){
		driver.quit();
	}
	
	public void test1(){
		driver.get(baseUrl);
		//获取题名
		String Title = driver.findElement(By.className("titName SG_txta")).getText();
		//获取作者
		String Author = driver.findElement(By.id("ownernick")).getText();
		//获取发布时间
		String Time = driver.findElement(By.className("time SG_txtc")).getText();
		//获取全文
		String Article = driver.findElement(By.id("sina_keyword_ad_area2")).getText();
		//获取标签blog_tag
		String Lable = driver.findElement(By.className("blog_tag")).getText();
		//获取当前URL
		String CurrentPageUrl = driver.getCurrentUrl();
		//获取当前时间
		String CurrentTime = dataTime.getDataTime();
		
		//输出上面获取的内容
		System.out.println(Title);
		System.out.println(Author);
		System.out.println(Time);
		System.out.println(Article);
		System.out.println(Lable);
		System.out.println(CurrentPageUrl);
		System.out.println(CurrentTime);
	} 
	

	public static void main(String[] args) {
		SinaStockColl sina = new SinaStockColl();
		sina.OpenBrowser();
		sina.test1();
		sina.QuitBrowser();

	}

}
