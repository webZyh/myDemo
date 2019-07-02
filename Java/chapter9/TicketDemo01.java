class MyThread implements Runnable{
  private int ticket = 20;
  public void run(){
    for(int i=0;i<100;i++){
      if(ticket>0){
        System.out.println("ÂòÆ±£ºticket="+ ticket--);
      }
    }
  }
}
public class TicketDemo01{
  public static void main(String args[]){
    MyThread my = new MyThread();
    new Thread(my).start();
    new Thread(my).start();
    new Thread(my).start();
  }
}