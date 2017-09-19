package SeleniumProj;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class FHCBPapersSearchTesting3 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://10.10.192.92:8080/";
    System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/fuhe24-portal/userlogin/userLogin/userLoginDetail.action");
    //��λ �û��������
    WebElement loginId = driver.findElement(By.id("loginId"));
    //���� �û���
    loginId.clear();
    loginId.sendKeys("wfdata");
    //��λ ���������
    WebElement password = driver.findElement(By.id("password"));
    //���� ����
    password.clear();
    password.sendKeys("123456");
    //��λ ��¼��ť
    WebElement loginButton = driver.findElement(By.cssSelector("input.dlbtn"));
    //��� ��¼��ť
    loginButton.click();
    //����һ��Action����
    Actions action = new Actions(driver);
    //��������� ͳ�Ʒ���
    action.moveToElement(driver.findElement(By.id("changeMenuAnalyze"))).perform();
    //��� ͳ�Ʒ���-ͼ��ͳ�� 
    driver.findElement(By.id("changeMenuBookAnalyze")).click();
    //��������� ͳ�Ʒ���
    action.moveToElement(driver.findElement(By.id("changeMenuAnalyze"))).perform();
    //��� ͳ�Ʒ���-�ڿ�ͳ��
    driver.findElement(By.id("changeMenuPeriodicalAnalyze")).click();
    //��λ ͼ��ѡ��߻�
    WebElement changeMenuPlan = driver.findElement(By.id("changeMenuPlan"));
    //��������� ͼ��ѡ��߻�
    action.moveToElement(changeMenuPlan).perform();
    //��λ ͼ��ѡ��߻�-����ͼ��߻�
    WebElement changeMenuPublicPlan = driver.findElement(By.id("changeMenuPublicPlan"));
    //��� ͼ��ѡ��߻�-����ͼ��߻�
    changeMenuPublicPlan.click();
    //��λ �ڿ�ѡ��߻�
    WebElement changeMenuPeriodicalPlan = driver.findElement(By.id("changeMenuPeriodicalPlan"));
    //��� �ڿ�ѡ��߻�
    changeMenuPeriodicalPlan.click();
    //��λ ���Ʊ���
    WebElement changeMenuReport = driver.findElement(By.id("changeMenuReport"));
    //��� ���Ʊ���
    changeMenuReport.click();
    //��λ ���ܼ���
    WebElement changeMenuSearch = driver.findElement(By.id("changeMenuSearch"));
    //������ܼ���
    changeMenuSearch.click();   
    //��λ ���ܼ���-���ļ��������
    WebElement searchCondition = driver.findElement(By.id("searchCondition"));
    //���� ���ܼ���-���ļ��������
    searchCondition.clear();
    searchCondition.sendKeys("��������");
    //��λ ���ܼ���-������ť
    WebElement searchBtn = driver.findElement(By.id("searchBtn")); 
    //��� ���ܼ���-������ť
    searchBtn.click();
    //��λ ��һҳ��ť
    WebElement nextButton = driver.findElement(By.id("dataTable_next"));
    //��� ��һҳ��ť
    nextButton.click();
    //��λ �˳���ť
    WebElement dropOut = driver.findElement(By.linkText("�� ��"));
    //��� �˳�
    dropOut.click();
    //��λ �˳�-ȷ�ϰ�ť
    WebElement dropOutSure = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
    //��� �˳�-ȷ��
    dropOutSure.click();
    
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
