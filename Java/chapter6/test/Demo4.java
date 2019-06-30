class Staff{
  private String name;
  private int age;
  private char sex;
  public Staff(String name, int age, char sex){
    this.setName(name);
    this.setAge(age);
    this.setSex(sex); 
  }
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public char getSex(){
    return this.sex;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setSex(char s){
    this.sex = s;
  }
  public String print(){
    return "������"+this.getName()+",����:"+this.getAge()+",�Ա�"+this.getSex();
  }
}
class Manage extends Staff{
  private String post;
  private float ySalary;
  public Manage(String name, int age, char sex, String post, float ySalary){
    super(name, age, sex);
    this.post = post;
    this.ySalary = ySalary;
  }
  public String print(){
    return super.print()+",ְλ��"+this.post+",��н:"+this.ySalary;
  }
}
class Worker extends Staff{
  private String department;
  private float mSalary;
  public Worker(String name, int age, char sex, String department, float mSalary){
    super(name, age, sex);
    this.department = department;
    this.mSalary = mSalary;
  }
  public String print(){
    return super.print()+",���ţ�"+this.department+",��н:"+this.mSalary;
  }
}
class Demo4{
  public static void main(String args[]){
    Manage m = new Manage("����",40,'��',"����",1000000.0f);
    Worker w1 = new Worker("����",30,'��',"�����",10000.0f);
    Worker w2 = new Worker("����",25,'Ů',"��Ϣ����",6000.0f);
    System.out.println(m.print());
    System.out.println(w1.print());
    System.out.println(w2.print());
  }
}