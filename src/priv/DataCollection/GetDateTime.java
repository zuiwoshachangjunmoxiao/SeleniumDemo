package priv.DataCollection;
/** 
* @author ���ߣ�BarryAllen
* @version ����ʱ�䣺2017��9��26�� ����3:58:25 
* ��˵�� 
*/
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;  
  
public class GetDateTime { 
	
	public String getDataTime(){
        //����һ��data format����  
        DateFormat dateformat= new SimpleDateFormat("yyyyMMdd-HHmmss");  
                      
        //����Date()��ȡ��ǰʱ��  
        Date date = new Date();  
                      
        //��ʽ��ʱ��,����String����洢  
        String date1 = dateformat.format(date);  
                      
        //��ӡ��ʽ��ʱ�䵽����̨  
        System.out.println(date1); 
        
		return date1;
		
	}
  
    public static void main(String[] args) {  
    	GetDateTime tt = new GetDateTime();
    	tt.getDataTime();
    }  
  
}  