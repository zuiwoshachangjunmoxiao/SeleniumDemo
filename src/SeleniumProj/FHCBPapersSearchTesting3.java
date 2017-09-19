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
    //定位 用户名输入框
    WebElement loginId = driver.findElement(By.id("loginId"));
    //输入 用户名
    loginId.clear();
    loginId.sendKeys("wfdata");
    //定位 密码输入框
    WebElement password = driver.findElement(By.id("password"));
    //输入 密码
    password.clear();
    password.sendKeys("123456");
    //定位 登录按钮
    WebElement loginButton = driver.findElement(By.cssSelector("input.dlbtn"));
    //点击 登录按钮
    loginButton.click();
    //声明一个Action对象
    Actions action = new Actions(driver);
    //鼠标悬浮到 统计分析
    action.moveToElement(driver.findElement(By.id("changeMenuAnalyze"))).perform();
    //点击 统计分析-图书统计 
    driver.findElement(By.id("changeMenuBookAnalyze")).click();
    //鼠标悬浮到 统计分析
    action.moveToElement(driver.findElement(By.id("changeMenuAnalyze"))).perform();
    //点击 统计分析-期刊统计
    driver.findElement(By.id("changeMenuPeriodicalAnalyze")).click();
    //定位 图书选题策划
    WebElement changeMenuPlan = driver.findElement(By.id("changeMenuPlan"));
    //鼠标悬浮到 图书选题策划
    action.moveToElement(changeMenuPlan).perform();
    //定位 图书选题策划-大众图书策划
    WebElement changeMenuPublicPlan = driver.findElement(By.id("changeMenuPublicPlan"));
    //点击 图书选题策划-大众图书策划
    changeMenuPublicPlan.click();
    //定位 期刊选题策划
    WebElement changeMenuPeriodicalPlan = driver.findElement(By.id("changeMenuPeriodicalPlan"));
    //点击 期刊选题策划
    changeMenuPeriodicalPlan.click();
    //定位 定制报表
    WebElement changeMenuReport = driver.findElement(By.id("changeMenuReport"));
    //点击 定制报表
    changeMenuReport.click();
    //定位 智能检索
    WebElement changeMenuSearch = driver.findElement(By.id("changeMenuSearch"));
    //点击智能检索
    changeMenuSearch.click();   
    //定位 智能检索-论文检索输入框
    WebElement searchCondition = driver.findElement(By.id("searchCondition"));
    //输入 智能检索-论文检索输入框
    searchCondition.clear();
    searchCondition.sendKeys("北京雾霾");
    //定位 智能检索-搜索按钮
    WebElement searchBtn = driver.findElement(By.id("searchBtn")); 
    //点击 智能检索-搜索按钮
    searchBtn.click();
    //定位 下一页按钮
    WebElement nextButton = driver.findElement(By.id("dataTable_next"));
    //点击 下一页按钮
    nextButton.click();
    //定位 退出按钮
    WebElement dropOut = driver.findElement(By.linkText("退 出"));
    //点击 退出
    dropOut.click();
    //定位 退出-确认按钮
    WebElement dropOutSure = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
    //点击 退出-确认
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
