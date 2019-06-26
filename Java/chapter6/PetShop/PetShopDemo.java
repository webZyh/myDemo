interface Pet{  // 宠物接口
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
  private Pet[] pets; // 保存多个属性
  private int foot;
  public PetShop(int len){  // 构造方法开辟宠物数组的大小
    if(len>0){
      this.pets = new Pet[len]; //如果len大于0，为对象数组开辟空间
    }else{
      this.pets = new Pet[1]; // 至少开辟一个空间
    }
  }
  // 增加宠物
  public boolean add(Pet pet){
    if(this.foot<this.pets.length){
      this.pets[this.foot] = pet;
      this.foot++;
      return true;
    }else{
      return false;
    }
  }
  // 关键字查找
  public Pet[] search(String keyWord){
    Pet p[] = null;
    int count = 0;
    // 确认开辟的空间大小，看有多少个宠物符合查询条件
    for(int i=0; i<this.pets.length;i++){
      if(this.pets[i]!=null){ // 判断对象数组的内容是否为空
        if(this.pets[i].getName().indexOf(keyWord)!= -1 ||this.pets[i].getColor().indexOf(keyWord)!= -1 ){
          count++; // 统计符合条件的宠物个数
        }
      }
    }
    p = new Pet[count]; // 根据已经确定的记录数开辟对象数组
    int f = 0;  // 设置增加的位置标记
    for(int i=0;i<this.pets.length;i++){
      if(this.pets[i]!=null){
        if(this.pets[i].getName().indexOf(keyWord)!=-1 || this.pets[i].getColor().indexOf(keyWord)!= -1 ){
          p[f] = this.pets[i];  // 将符合查询条件的宠物信息保存
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
    ps.add(new Cat("白猫","白色的",2));
    ps.add(new Cat("黑猫","黑色的",3));
    ps.add(new Cat("花猫","花色的",1));
    ps.add(new Cat("拉布拉多","黄色的",2));
    ps.add(new Cat("金毛","金色的",4));
    ps.add(new Cat("黄狗","黄色的",3));
    print(ps.search("猫"));
  }
  public static void print(Pet p[]){
    for(int i=0;i<p.length;i++){
      if(p[i]!=null){
        System.out.println(p[i].getName()+","+p[i].getColor()+","+p[i].getAge());
      }
    }
  }
}