package priv.DataCollection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import priv.DataCollection.GetDateTime;

/** 
* @author ���ߣ�BarryAllen
* @version ����ʱ�䣺2017��9��26�� ����3:41:03 
* ��˵�� 
*/
public class SinaStockColl {
	public WebDriver driver;
	public GetDateTime dataTime;
	String baseUrl = "http://blog.sina.com.cn/s/blog_4e3980540102xzck.html";
	
	//�������
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new FirefoxDriver();
	}
	
	//�رձ�ǩҳ
	public void QuitBrowser(){
		driver.quit();
	}
	
	public void test1(){
		driver.get(baseUrl);
		//��ȡ����
		String Title = driver.findElement(By.className("titName SG_txta")).getText();
		//��ȡ����
		String Author = driver.findElement(By.id("ownernick")).getText();
		//��ȡ����ʱ��
		String Time = driver.findElement(By.className("time SG_txtc")).getText();
		//��ȡȫ��
		String Article = driver.findElement(By.id("sina_keyword_ad_area2")).getText();
		//��ȡ��ǩblog_tag
		String Lable = driver.findElement(By.className("blog_tag")).getText();
		//��ȡ��ǰURL
		String CurrentPageUrl = driver.getCurrentUrl();
		//��ȡ��ǰʱ��
		String CurrentTime = dataTime.getDataTime();
		
		//��������ȡ������
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
