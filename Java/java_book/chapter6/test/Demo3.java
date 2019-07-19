class Person{
  private String name;
  private String addr;
  private char sex;
  private int age;
  public Person(){} // 无参构造函数
  public Person(String name, int age){  // 两参构造函数
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
    return "姓名："+this.name+ ",地址："+this.addr+",性别："+this.sex+",年龄："+this.age;
  }
}
class Student extends Person{
  private float math;
  private float english;
  public Student(){} // 无参构造函数
  public Student(float math, float english){  // 两参构造函数
    this.math = math;
    this.english = english;
  }
  public Student(String name, String addr, char sex, int age,float math,float english){
    super(name,addr,sex,age);
    this.math = math;
    this.english = english;
  }
  public String getInfo(){
    return super.getInfo()+",数学成绩："+this.math+ ",英语成绩："+this.english;
  }
}
class Demo3{
  public static void main(String args[]){
    Student stu = new Student("张三","深圳南山",'男',20,90.0f,18.0f);
    System.out.println(stu.getInfo());
  }
}