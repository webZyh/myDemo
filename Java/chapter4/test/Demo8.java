/* 
  ��30��0~9֮������֣��ֱ�ͳ��0~9��10�����ֱַ�����˶��ٴ�
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
      System.out.println(i+"������"+num[i]+"��");
    }
  }
}