/* 
  有一个数组{1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}，去掉其中所有的0，形成一个新数组
*/
public class Demo3{
  public static void main(String args[]){
    int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
    int count = 0;
    for(int i=0;i<oldArr.length;i++){ // 此处foreach方法结果错误？
      if(oldArr[i]==0){
        count++;
        System.out.println("0的位置为："+i+"\t");
      }
    }
    System.out.println("0的个数为："+count);
    int newArr[] = new int[oldArr.length-count];
    int j = 0;
    for(int i:oldArr){
      if(oldArr[i]!=0){
        newArr[j] = oldArr[i];
        j++;
      }
    }
    System.out.println("新数组为：");
    for(int k:newArr){
      System.out.print(k+"\t");
    }
  }
}