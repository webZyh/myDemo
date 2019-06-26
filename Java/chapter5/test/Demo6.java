public class Demo6{
  public static void main(String args[]){
    String str1 = "Java技术学习班20070326";
    String str2 = "MLDNJAVA";
    String str3 = "Java技术学习班20070326 MLDN 老师";
    String str4="450919199903050123";
    // 取出开班日期
    System.out.println(str1.substring(9,str1.length()));
    // 将JAVA替换成J2EE
    System.out.println(str2.replaceAll("JAVA","J2EE"));
    // 取出"Java技术学习班20070326"中的第8个字符
    System.out.println(str1.substring(7,8));
    // 清除"Java技术学习班20070326"中的所有的0
    System.out.println(str1.replaceAll("0",""));
    // 清除"Java技术学习班20070326 MLDN 老师"中的所有空格
    String ss[] = str3.split(" ");
    String s = "";
    for(int i=0;i<ss.length;i++){
      s+=ss[i];
    }
    System.out.println(s);
    // 从任意给定的身份证号码中提取此人的出生日期
    System.out.println(str4.substring(6,14));
  }
}