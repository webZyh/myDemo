/* 
  ͳ���ַ��� "want you to know one thing"����ĸn��o���ֵĴ���
*/
public class Demo3{
  public static void main(String args[]){
    int nCount = 0;
    int oCount = 0;
    String str = "want you to know one thing";
    char a[] = str.toCharArray(); // ����String���еķ��������ַ���ת��������
    for(int i=0;i<a.length;i++){  // ѭ������Ƚ�
      if(a[i] == 'n'){
        nCount++;
      }
      if(a[i] == 'o'){
        oCount++;
      }
    }
    System.out.println("n���ֵĴ�����"+ nCount);
    System.out.println("o���ֵĴ�����"+ oCount);
  }
}