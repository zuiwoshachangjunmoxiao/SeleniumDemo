package priv.differencebrowsers;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/** 
* @author 作者：BarryAllen
* @version 创建时间：2017年9月18日 上午11:00:19 
* 测试套件，控制测试用例的执行和用例的执行顺序 
*/
@RunWith(Suite.class)
@SuiteClasses({ 
	ChromeDriverDemo.class, 
	FirefoxDriverDemo.class, 
	IEDriverServerDemo.class 
	
})
public class AllTests {

}
