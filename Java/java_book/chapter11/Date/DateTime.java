package myutil;
import java.util.Date ;
import java.text.SimpleDateFormat ;
public class DateTime{
  private SimpleDateFormat sdf = null; // 声明SimpleDateFormat对象
  public String getDate(){
    this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); // 使用SimpleDateFormat类设置日期格式
    return this.sdf.format(new Date());
  }
  public String getDateComplete(){
    this.sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒SSS毫秒"); // 使用SimpleDateFormat类设置日期格式
    return this.sdf.format(new Date());
  }
}