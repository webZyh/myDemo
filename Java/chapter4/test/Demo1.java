/* 
  ��ӡ1��+2��+3��+...+30���ĺͲ���ʾ
*/
public class Demo1{
  public static void main(String args[]){
    calc(30);
  }
  public static void calc(int x){
    long sum = 0;
    int a = 1;
    for(int i=1;i<=x;i++){
      a *=i;
      sum += a;
    }
    System.out.print(sum);
  }
}