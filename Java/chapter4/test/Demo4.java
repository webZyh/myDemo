/* 
  ����һ���������飬������ĺͣ�����������Сֵ
*/
public class Demo4{
  public static void main(String args[]){
    int arr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
    sum(arr);
    max(arr);
    min(arr);
  }
  public static void sum(int temp[]){
    int sum = 0;
    for(int i:temp){
      sum+=temp[i];
    }
    System.out.println("����ĺ�Ϊ��"+sum);
  }
  public static void max(int temp[]){
    int max = temp[0];
    for(int i:temp){
      if(max<temp[i]){
        max = temp[i];
      } 
    }
    System.out.println("���ֵΪ��"+max);
  }
  public static void min(int temp[]){
    int min = temp[0];
    for(int i:temp){
      if(min>temp[i]){
        min = temp[i];
      }
    }
    System.out.println("��СֵΪ��"+min);
  }
}