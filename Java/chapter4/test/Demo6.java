package test;

/* 
  ����һ��10��Ԫ�ص����飬������и�ֵ��ʹÿ��Ԫ�ص�ֵ�������±꣬Ȼ�����鵹�����
*/
public class Demo6{
  public static void main(String args[]){
    int arr[] = new int[10];
    for(int i=0; i<arr.length; i++){
      arr[i] = i;
      System.out.print(arr[i]+"\t");
    }
    reverse(arr);
  }
  public static void reverse(int temp[]){
    for(int i=temp.length-1;i>=0;i--)
    System.out.print(temp[i]+"\t");
  }
}