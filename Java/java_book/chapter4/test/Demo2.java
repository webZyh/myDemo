package test;

/* 
  定义一个由整数组成的数组，求出奇数个数和偶数个数
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
    System.out.println("奇数个数为："+odd);
    System.out.println("偶数个数为："+even);
  }
}