package test;

/* 
  定义一个10个元素的数组，对其进行赋值，使每个元素的值等于其下标，然后将数组倒叙输出
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