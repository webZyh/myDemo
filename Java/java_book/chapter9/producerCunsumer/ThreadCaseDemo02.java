class Info{
  private String name;
  private String content;
  public String getName(){
    return name;
  }
  public synchronized void set(String name, String content){
    this.setName(name);
    try{
      Thread.sleep(300);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    this.setContent(content);
  }
  public synchronized void get(){
    try{
      Thread.sleep(300);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    System.out.println(this.getName()+"--->"+this.getContent());
  }
  public void setName(String n){
    this.name = n;
  }
  public String getContent(){
    return content;
  }
  public void setContent(String c){
    this.content = c;
  }
}
class Producer implements Runnable{
  private Info info = null; // 保存info引用
  public Producer(Info info){
    this.info = info;
  }
  public void run(){
    boolean flag = false;
    for(int i=0;i<10;i++){
      if(flag){
        this.info.set("zyh","是个帅哥");
        flag = false;
      }else{
        this.info.set("陈雪娜","是个傻逼");
        flag = true;
      }
    }
  }
}
// 消费者
class Consumer implements Runnable{
  private Info info = null;
  public Consumer(Info info){
    this.info = info;
  }
  public void run(){
    for(int i=0;i<10;i++){
      try{
        Thread.sleep(90);
      }catch(InterruptedException e){
        e.printStackTrace();
      }
      this.info.get();
    }
  }
}
public class ThreadCaseDemo02{
  public static void main(String args[]){
    Info i = new Info();
    Producer pro = new Producer(i);
    Consumer con = new Consumer(i);
    new Thread(pro).start();
    new Thread(con).start();
  }
}