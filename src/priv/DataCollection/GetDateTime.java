package priv.DataCollection;
/** 
* @author 作者：BarryAllen
* @version 创建时间：2017年9月26日 下午3:58:25 
* 通过Date对象的date()方法获取系统当前时间 
*/
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;  
  
public class GetDateTime { 
	
	public String getDataTime(){
        //创建一个data format对象  
        DateFormat dateformat= new SimpleDateFormat("yyyyMMdd-HHmmss");  
                      
        //利用Date()获取当前时间  
        Date date = new Date();  
                      
        //格式化时间,并用String对象存储  
        String date1 = dateformat.format(date);  
                      
        //打印格式化时间到控制台  
        System.out.println(date1); 
        
		return date1;
		
	}
  
    public static void main(String[] args) {  
    	GetDateTime tt = new GetDateTime();
    	tt.getDataTime();
    }  
  
}  
