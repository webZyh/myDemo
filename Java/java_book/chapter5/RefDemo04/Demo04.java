class Demo{
  private int temp = 30;
  public void fun(Demo d2){
    d2.temp = 40;
  }
  public int getTemp(){
    return this.temp;
  }
  public void setTemp(int t){
    temp = t;
  }
}
public class Demo04{
  public static void main(String args[]) {
    Demo d1 = new Demo();
    d1.setTemp(50);
    d1.fun(d1);
    System.out.println("temp = "+ d1.getTemp());
  }
}
