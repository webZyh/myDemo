package runnabledemo;
class MyThread implements Runnable{
  private String name;
  public MyThread(String name){
    this.name = name;
  }
  public void run(){  // ��дThread���е�run()����
    for(int i=0;i<10;i++){
      System.out.println(name+"���У�i="+ i);
    }
  }
}
public class RunnableDemo01{
  public static void main(String args[]){
    MyThread my1 = new MyThread("�߳�A"); // ʵ����Runnable�������
    MyThread my2 = new MyThread("�߳�B");
    Thread t1 = new Thread(my1); // ʵ����Thread�����
    Thread t2 = new Thread(my2);
    t1.start();
    t2.start();
  }
}