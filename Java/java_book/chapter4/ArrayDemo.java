/* 
  冒泡排序
*/
public class ArrayDemo{
  public static void main(String args[]){
    int score[] = {88,76,56,100,99,35,43,93,10};
    for(int i=1; i<score.length; i++){
      for(int j=0; j<score.length; j++){
        if(score[i]<score[j]){
          int temp = score[i];
          score[i] = score[j];
          score[j] = temp;
        }
      }
    }
    for(int i=0;i<score.length;i++){
      System.out.print(score[i]+"\t");
    }
  }  
}