package myutil;
import java.util.Date ;
import java.text.SimpleDateFormat ;
public class DateTime{
  private SimpleDateFormat sdf = null; // ����SimpleDateFormat����
  public String getDate(){
    this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); // ʹ��SimpleDateFormat���������ڸ�ʽ
    return this.sdf.format(new Date());
  }
  public String getDateComplete(){
    this.sdf = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��SSS����"); // ʹ��SimpleDateFormat���������ڸ�ʽ
    return this.sdf.format(new Date());
  }
}