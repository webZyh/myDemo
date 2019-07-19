class Person{
  private String name;
  private int age;
  private Book book;  // 定义一个人有一本书的一对一关系
  private Person child; // 定义一个人有一个小孩的一对一关系
  public Person(String name,int age){ // 通过构造函数设置值
    this.setName(name);
    this.setAge(age);
  }
  public String getName(){
    return this.name;
  }
  public void setName(String n){
    this.name = n;
  }
  public int getAge(){
    return this.age;
  }
  public void setAge(int a){
    this.age = a;
  }
  public Book getBook(){  // 得到本人的书
    return book;
  }
  public void setBook(Book b){  // 设置本人的书
    book = b;
  }
  public Person getChild(){ // 得到孩子
    return child;
  }
  public void setChild(Person c){ // 设置孩子
    this.child = c;
  }
}
class Book{
  private String title;
  private float price;
  private Person person;
  public Book(String title, float price){
    this.setTitle(title);
    this.setPrice(price);
  }
  public String getTitle(){
    return this.title;
  }
  public void setTitle(String t){
    this.title = t;
  }
  public float getPrice(){
    return this.price;
  }
  public void setPrice(float p){
    this.price = p;
  }
  public Person getPerson(){
    return person;
  }
  public void setPerson(Person p){
    this.person = p;
  }
}
public class RefDemo06{
  public static void main(String args[]){
    Person per = new Person("张三",30);
    Person cld = new Person("张三儿",10);
    Book bk = new Book("计算机网络",59.9f);
    Book cbk = new Book("java开发实战经典",79.8f);
    per.setChild(cld);  // 设置对象间的关系，一个人有一个孩子
    per.setBook(bk);  
    cld.setBook(cbk);
    bk.setPerson(per);
    cbk.setPerson(cld);
    System.out.println("从人找到书--> 姓名："+ per.getName()+";年龄："+per.getAge()+";书名："+per.getBook().getTitle()+";价格："+per.getBook().getPrice());

    System.out.println("从书找到人--> 书名："+ bk.getTitle()+";价格："+bk.getPrice()+";姓名："+bk.getPerson().getName()+";年龄："+bk.getPerson().getAge());

    System.out.println(per.getName()+"的孩子 --> 姓名："+ per.getChild().getName()+";年龄："+per.getChild().getAge()+";书名："+per.getChild().getBook().getTitle()+";价格："+per.getChild().getBook().getPrice());
  }
}