class Info{
  private String name;
  private String content;
  public String getName(){
    return name;
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
        this.info.setName("zyh");
        try{
          Thread.sleep(90);
        }catch(InterruptedException e){
          e.printStackTrace();
        }
        this.info.setContent("是个帅哥");
        flag = false;
      }else{
        this.info.setName("陈雪娜");
        try{
          Thread.sleep(90);
        }catch(InterruptedException e){
          e.printStackTrace();
        }
        this.info.setContent("是个傻逼");
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
      System.out.println(this.info.getName()+ "--->" + this.info.getContent());
    }
  }
}
public class ThreadCaseDemo01{
  public static void main(String args[]){
    Info i = new Info();
    Producer pro = new Producer(i);
    Consumer con = new Consumer(i);
    new Thread(pro).start();
    new Thread(con).start();
  }
}