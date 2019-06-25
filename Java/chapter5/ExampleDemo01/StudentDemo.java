class Student{
  private String stuno; // 学生编号
  private String name;
  private float math;
  private float english;
  private float computer;
  public Student(){ }  // 定义无参构造
  // 定义有五个参数的构造函数，为私有属性赋值
  public Student(String stuno, String name, float math, float english, float computer){
    this.setStuno(stuno);
    this.setName(name);
    this.setMath(math);
    this.setEnglish(english);
    this.setComputer(computer);
  }
  // 设置属性
  public void setStuno(String s){
    stuno = s;
  }
  public void setName(String n){
    name = n;
  }
  public void setMath(float m){
    math = m;
  }
  public void setEnglish(float e){
    english = e;
  }
  public void setComputer(float c){
    computer = c;
  }
  // 获取属性
  public String getStuno(){
    return this.stuno;
  }
  public String getName(){
    return this.name;
  }
  public float getMath(){
    return this.math;
  }
  public float getEnglish(){
    return this.english;
  }
  public float getComputer(){
    return this.computer;
  }
  // 计算总分
  public float sum(){
    return math + english + computer;
  }
  // 计算平均分
  public float avg(){
    return this.sum()/3;
  }
  // 计算最高分
  public float max(){
    float max = math;
    max = max > computer ? max : computer;
    max = max > english ? max : english;
    return max;
  }
  // 计算最低分
  public  float min(){
    float min = math;
    min = min < computer ? min : computer;
    min = min < english ? min : english;
    return min;
  }
}

public class StudentDemo{
  public static void main(String args[]){
    Student stu = null; // 声明对象
    stu = new Student("001","zyh",18.5f,8.0f,99.0f); // 通过构造函数给属性赋值
    System.out.println("学生编号：" + stu.getStuno());
    System.out.println("学生姓名：" + stu.getName());
    System.out.println("数学成绩：" + stu.getMath());
    System.out.println("英语成绩：" + stu.getEnglish());
    System.out.println("计算机成绩：" + stu.getComputer());
    System.out.println("总分" + stu.sum());
    System.out.println("平均分" + stu.avg());
    System.out.println("最高分" + stu.max());
    System.out.println("最低分：" + stu.min());
  }
}