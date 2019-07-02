package runnabledemo;
class MyThread implements Runnable{
  private String name;
  public MyThread(String name){
    this.name = name;
  }
  public void run(){  // 复写Thread类中的run()方法
    for(int i=0;i<10;i++){
      System.out.println(name+"运行，i="+ i);
    }
  }
}
public class RunnableDemo01{
  public static void main(String args[]){
    MyThread my1 = new MyThread("线程A"); // 实例化Runnable子类对象
    MyThread my2 = new MyThread("线程B");
    Thread t1 = new Thread(my1); // 实例化Thread类对象
    Thread t2 = new Thread(my2);
    t1.start();
    t2.start();
  }
}