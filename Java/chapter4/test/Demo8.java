/* 
  有30个0~9之间的数字，分别统计0~9这10个数字分别出现了多少次
*/
public class Demo8{
  public static void main(String args[]){
    int arr[] = new int[30];
    int num[] = new int[10];
    for(int i=0; i<arr.length; i++){
      arr[i] = (int)(Math.random()*10);
      System.out.print(arr[i]+",");
    }
    for(int i=0;i<arr.length;i++){
      num[arr[i]]++;
    }
    for(int i=0;i<num.length;i++){
      System.out.println(i+"出现了"+num[i]+"次");
    }
  }
}