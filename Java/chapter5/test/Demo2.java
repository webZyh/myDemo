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
    System.out.println("增长额=工作年限*200");
    System.out.println("增长额为"+ this.time*200);
  }
  public void total(){
    System.out.println("工资总数=基本工资+增长额");
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