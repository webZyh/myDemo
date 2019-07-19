interface A{
  public abstract void print();
};
class B implements A{
  public void print(){
    System.out.println("hello world");
  }
};
public class interfaceCaseDemo01{
  public static void main(String args[]) {
    A a = new B();
    a.print()
    /* B b = new B();
    b.print(); */
  }
}
