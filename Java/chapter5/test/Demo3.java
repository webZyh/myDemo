/* 
  统计字符串 "want you to know one thing"中字母n和o出现的次数
*/
public class Demo3{
  public static void main(String args[]){
    int nCount = 0;
    int oCount = 0;
    String str = "want you to know one thing";
    char a[] = str.toCharArray(); // 调用String类中的方法，将字符串转换成数组
    for(int i=0;i<a.length;i++){  // 循环数组比较
      if(a[i] == 'n'){
        nCount++;
      }
      if(a[i] == 'o'){
        oCount++;
      }
    }
    System.out.println("n出现的次数："+ nCount);
    System.out.println("o出现的次数："+ oCount);
  }
}