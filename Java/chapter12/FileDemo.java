/* 
  给定一个文件，如果此文件存在，则删除，如果文件不存在，则创建一个新文件
*/
import java.io.File;
import java.io.IOException;
public class FileDemo{
  public static void main(String args[]){
    File f = new File("D:"+File.separator+"test.txt");  // File.separator：静态常亮，分割符
    if(f.exists()){ // 文件存在，删除
      f.delete(); // 删除
    }else{
      try{
        f.createNewFile();
      }catch(IOException e){
        e.printStackTrace();
      }
    }
  }
}