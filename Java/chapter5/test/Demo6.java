public class Demo6{
  public static void main(String args[]){
    String str1 = "Java����ѧϰ��20070326";
    String str2 = "MLDNJAVA";
    String str3 = "Java����ѧϰ��20070326 MLDN ��ʦ";
    String str4="450919199903050123";
    // ȡ����������
    System.out.println(str1.substring(9,str1.length()));
    // ��JAVA�滻��J2EE
    System.out.println(str2.replaceAll("JAVA","J2EE"));
    // ȡ��"Java����ѧϰ��20070326"�еĵ�8���ַ�
    System.out.println(str1.substring(7,8));
    // ���"Java����ѧϰ��20070326"�е����е�0
    System.out.println(str1.replaceAll("0",""));
    // ���"Java����ѧϰ��20070326 MLDN ��ʦ"�е����пո�
    String ss[] = str3.split(" ");
    String s = "";
    for(int i=0;i<ss.length;i++){
      s+=ss[i];
    }
    System.out.println(s);
    // ��������������֤��������ȡ���˵ĳ�������
    System.out.println(str4.substring(6,14));
  }
}