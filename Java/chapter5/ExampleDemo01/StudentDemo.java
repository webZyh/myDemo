class Student{
  private String stuno; // ѧ�����
  private String name;
  private float math;
  private float english;
  private float computer;
  public Student(){ }  // �����޲ι���
  // ��������������Ĺ��캯����Ϊ˽�����Ը�ֵ
  public Student(String stuno, String name, float math, float english, float computer){
    this.setStuno(stuno);
    this.setName(name);
    this.setMath(math);
    this.setEnglish(english);
    this.setComputer(computer);
  }
  // ��������
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
  // ��ȡ����
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
  // �����ܷ�
  public float sum(){
    return math + english + computer;
  }
  // ����ƽ����
  public float avg(){
    return this.sum()/3;
  }
  // ������߷�
  public float max(){
    float max = math;
    max = max > computer ? max : computer;
    max = max > english ? max : english;
    return max;
  }
  // ������ͷ�
  public  float min(){
    float min = math;
    min = min < computer ? min : computer;
    min = min < english ? min : english;
    return min;
  }
}

public class StudentDemo{
  public static void main(String args[]){
    Student stu = null; // ��������
    stu = new Student("001","zyh",18.5f,8.0f,99.0f); // ͨ�����캯�������Ը�ֵ
    System.out.println("ѧ����ţ�" + stu.getStuno());
    System.out.println("ѧ��������" + stu.getName());
    System.out.println("��ѧ�ɼ���" + stu.getMath());
    System.out.println("Ӣ��ɼ���" + stu.getEnglish());
    System.out.println("������ɼ���" + stu.getComputer());
    System.out.println("�ܷ�" + stu.sum());
    System.out.println("ƽ����" + stu.avg());
    System.out.println("��߷�" + stu.max());
    System.out.println("��ͷ֣�" + stu.min());
  }
}