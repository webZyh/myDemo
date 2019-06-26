/* 
  使用调用方法的形式数组排序
*/
public class ArrayRef{
  public static void main(String args[]){
    int score[] = {67,89,87,69,90,100,75,94};
    int age[] = {29,38,21,10,5,99,30,6,64};
    sort(score);
    print(score);
    System.out.println("\n-------------------------------------");
    sort(age);
    print(age);
  }
  public static void sort(int temp[]){
    for(int i=1;i<temp.length;i++){
      for(int j=0;j<temp.length;j++){
        if(temp[i]<temp[j]){
          int x = temp[i];
          temp[i] = temp[j];
          temp[j] = x;
        }
      }
    }
  }
  public static void print(int temp[]){
    for(int i=0;i<temp.length;i++){
      System.out.print(temp[i]+"\t");
    }
  }
}