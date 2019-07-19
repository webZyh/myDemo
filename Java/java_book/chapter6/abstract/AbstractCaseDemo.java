abstract class Person{
  private String name;
  private int age;
  public Person(String name,int age){
    this.name = name;
    this.age = age;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public void say(){  // 说话是具体功能，要定义成普通方法
    System.out.println(this.getContent());
  }
  public abstract String getContent();  // 说话的内容由子类决定
}
class Student extends Person{
  private float score;
  public Student(String name,int age,float score){  // 子类构造方法
    super(name,age);  // 调用父类构造方法
    this.score = score;
  }
  public String getContent(){
    return "学生信息--> 姓名："+ super.getName() + "; 年龄："+ super.getAge()+"; 成绩："+ this.score;
  }
}
class Worker extends Person{
  private float salary;
  public Worker(String name,int age,float salary){
    super(name,age);
    this.salary = salary;
  }
  public String getContent(){
    return "工人信息--> 姓名："+ super.getName() + "; 年龄："+ super.getAge()+"; 工资："+ this.salary;
  }
}
public class AbstractCaseDemo{
  public static void main(String args[]){
    Person per1 = new Student("张三",10,99.0f); // 对象向上转型
    Person per2 = new Worker("王五",30,4000.0f);
    per1.say();
    per2.say();
  }
}