/* 
  ��һ������{1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}��ȥ���������е�0���γ�һ��������
*/
public class Demo3{
  public static void main(String args[]){
    int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
    int count = 0;
    for(int i=0;i<oldArr.length;i++){ // �˴�foreach�����������
      if(oldArr[i]==0){
        count++;
        System.out.println("0��λ��Ϊ��"+i+"\t");
      }
    }
    System.out.println("0�ĸ���Ϊ��"+count);
    int newArr[] = new int[oldArr.length-count];
    int j = 0;
    for(int i:oldArr){
      if(oldArr[i]!=0){
        newArr[j] = oldArr[i];
        j++;
      }
    }
    System.out.println("������Ϊ��");
    for(int k:newArr){
      System.out.print(k+"\t");
    }
  }
}