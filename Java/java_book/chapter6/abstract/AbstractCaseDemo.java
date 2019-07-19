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
  public void say(){  // ˵���Ǿ��幦�ܣ�Ҫ�������ͨ����
    System.out.println(this.getContent());
  }
  public abstract String getContent();  // ˵�����������������
}
class Student extends Person{
  private float score;
  public Student(String name,int age,float score){  // ���๹�췽��
    super(name,age);  // ���ø��๹�췽��
    this.score = score;
  }
  public String getContent(){
    return "ѧ����Ϣ--> ������"+ super.getName() + "; ���䣺"+ super.getAge()+"; �ɼ���"+ this.score;
  }
}
class Worker extends Person{
  private float salary;
  public Worker(String name,int age,float salary){
    super(name,age);
    this.salary = salary;
  }
  public String getContent(){
    return "������Ϣ--> ������"+ super.getName() + "; ���䣺"+ super.getAge()+"; ���ʣ�"+ this.salary;
  }
}
public class AbstractCaseDemo{
  public static void main(String args[]){
    Person per1 = new Student("����",10,99.0f); // ��������ת��
    Person per2 = new Worker("����",30,4000.0f);
    per1.say();
    per2.say();
  }
}