class Array{
  private int temp[];
  private int foot;
  public Array(int len){
    if(len>0){
      this.temp = new int[len];
    }else{
      this.temp = new int[1];
    }
  }
  public boolean add(int i){
    if(this.foot<this.temp.length){
      this.temp[foot] = i;
      foot++;
      return true;
    }else{
      return false;
    }
  }
  public int[] getArray(){
    return this.temp;
  }
  public static void print(int i[]){
    for(int x=0;x<i.length;x++){
      System.out.print(i[x]+"��");
    }
  }
}
class ReverseArray extends Array{
  public ReverseArray(int len){
    super(len);
  }
  public int[] getArray(){  // ��д�õ�����ķ�������ת����
    int t[]= new int[super.getArray().length];
    int count = t.length-1;
    for(int x=0;x<t.length;x++){
      t[count]=super.getArray()[x];
      count--;
    }
    return t;
  }
}
class SortArray extends Array{
  public SortArray(int len){
    super(len);
  }
  public int[] getArray(){
    java.util.Arrays.sort(super.getArray());  // ��������
    return super.getArray();
  }
}
public class ArrayDemo{
  public static void main(String args[]) {
    // ���Է�ת��
    // ReverseArray a = new ReverseArray(5); // ��������ռ�
    // ����������
    SortArray a = new SortArray(5);
    System.out.print(a.add(12)+"\t");
    System.out.print(a.add(2)+"\t");
    System.out.print(a.add(30)+"\t");
    System.out.print(a.add(43)+"\t");
    System.out.print(a.add(23)+"\t");
    System.out.print(a.add(29)+"\t");
    a.print(a.getArray());
  }
}