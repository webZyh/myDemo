class Person{
  private String name;
  private String addr;
  private char sex;
  private int age;
  public Person(){} // �޲ι��캯��
  public Person(String name, int age){  // ���ι��캯��
    this.name = name;
    this.age = age;
  }
  public Person(String name, String addr, char sex, int age){
    this.name = name;
    this.addr = addr;
    this.sex = sex;
    this.age = age;
  }
  public String getInfo(){
    return "������"+this.name+ ",��ַ��"+this.addr+",�Ա�"+this.sex+",���䣺"+this.age;
  }
}
class Student extends Person{
  private float math;
  private float english;
  public Student(){} // �޲ι��캯��
  public Student(float math, float english){  // ���ι��캯��
    this.math = math;
    this.english = english;
  }
  public Student(String name, String addr, char sex, int age,float math,float english){
    super(name,addr,sex,age);
    this.math = math;
    this.english = english;
  }
  public String getInfo(){
    return super.getInfo()+",��ѧ�ɼ���"+this.math+ ",Ӣ��ɼ���"+this.english;
  }
}
class Demo3{
  public static void main(String args[]){
    Student stu = new Student("����","������ɽ",'��',20,90.0f,18.0f);
    System.out.println(stu.getInfo());
  }
}