class Employee{
  private String empno;
  private String name;
  private float salary;
  private int time;
  public Employee(String empno, String name, float salary, int time){
    this.empno = empno;
    this.name = name;
    this.salary = salary;
    this.time = time;
  }
  public void salaryGrow(){
    System.out.println("������=��������*200");
    System.out.println("������Ϊ"+ this.time*200);
  }
  public void total(){
    System.out.println("��������=��������+������");
    System.out.println( this.salary + time*200);
  }
}
public class Demo2{
  public static void main(String args[]){
    Employee emp = new Employee("110","zyh",1000f,12);
    emp.salaryGrow();
    emp.total();
  }
}