interface Pet{  // ����ӿ�
  public String getName();
  public String getColor();
  public int getAge();
}
class Cat implements Pet{
  private String name;
  private String color;
  private int age;
  public Cat(String name, String color, int age){
    this.setName(name);
    this.setColor(color);
    this.setAge(age);
  }
  public String getName(){
    return this.name;
  }
  public String getColor(){
    return this.color;
  }
  public int getAge(){
    return this.age;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setColor(String color){
    this.color = color;
  }
  public void setAge(int age){
    this.age = age;
  }
}
class Dog implements Pet{
  private String name;
  private String color;
  private int age;
  public Dog(String name, String color, int age){
    this.setName(name);
    this.setColor(color);
    this.setAge(age);
  }
  public String getName(){
    return this.name;
  }
  public String getColor(){
    return this.color;
  }
  public int getAge(){
    return this.age;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setColor(String color){
    this.color = color;
  }
  public void setAge(int age){
    this.age = age;
  }
}
class PetShop{
  private Pet[] pets; // ����������
  private int foot;
  public PetShop(int len){  // ���췽�����ٳ�������Ĵ�С
    if(len>0){
      this.pets = new Pet[len]; //���len����0��Ϊ�������鿪�ٿռ�
    }else{
      this.pets = new Pet[1]; // ���ٿ���һ���ռ�
    }
  }
  // ���ӳ���
  public boolean add(Pet pet){
    if(this.foot<this.pets.length){
      this.pets[this.foot] = pet;
      this.foot++;
      return true;
    }else{
      return false;
    }
  }
  // �ؼ��ֲ���
  public Pet[] search(String keyWord){
    Pet p[] = null;
    int count = 0;
    // ȷ�Ͽ��ٵĿռ��С�����ж��ٸ�������ϲ�ѯ����
    for(int i=0; i<this.pets.length;i++){
      if(this.pets[i]!=null){ // �ж϶�������������Ƿ�Ϊ��
        if(this.pets[i].getName().indexOf(keyWord)!= -1 ||this.pets[i].getColor().indexOf(keyWord)!= -1 ){
          count++; // ͳ�Ʒ��������ĳ������
        }
      }
    }
    p = new Pet[count]; // �����Ѿ�ȷ���ļ�¼�����ٶ�������
    int f = 0;  // �������ӵ�λ�ñ��
    for(int i=0;i<this.pets.length;i++){
      if(this.pets[i]!=null){
        if(this.pets[i].getName().indexOf(keyWord)!=-1 || this.pets[i].getColor().indexOf(keyWord)!= -1 ){
          p[f] = this.pets[i];  // �����ϲ�ѯ�����ĳ�����Ϣ����
          f++;
        }
      }
    }
    return p;
  }
}

public class PetShopDemo{
  public static void main(String args[]){
    PetShop ps = new PetShop(5);
    ps.add(new Cat("��è","��ɫ��",2));
    ps.add(new Cat("��è","��ɫ��",3));
    ps.add(new Cat("��è","��ɫ��",1));
    ps.add(new Cat("��������","��ɫ��",2));
    ps.add(new Cat("��ë","��ɫ��",4));
    ps.add(new Cat("�ƹ�","��ɫ��",3));
    print(ps.search("è"));
  }
  public static void print(Pet p[]){
    for(int i=0;i<p.length;i++){
      if(p[i]!=null){
        System.out.println(p[i].getName()+","+p[i].getColor()+","+p[i].getAge());
      }
    }
  }
}