package test;

/* 
  ����һ����������ɵ����飬�������������ż������
*/
public class Demo2{
  public static void main(String args[]){
    int num[] = {3,4,5,6,7,8,9,10,11};
    int even = 0;
    int odd = 0;
    for(int x:num){
      if(x%2==0){
        even+=1;
      }else{
        odd+=1;
      }
    }
    System.out.println("��������Ϊ��"+odd);
    System.out.println("ż������Ϊ��"+even);
  }
}