package priv.differencebrowsers;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/** 
* @author ���ߣ�BarryAllen
* @version ����ʱ�䣺2017��9��18�� ����11:00:19 
* �����׼������Ʋ���������ִ�к�������ִ��˳�� 
*/
@RunWith(Suite.class)
@SuiteClasses({ 
	ChromeDriverDemo.class, 
	FirefoxDriverDemo.class, 
	IEDriverServerDemo.class 
	
})
public class AllTests {

}
