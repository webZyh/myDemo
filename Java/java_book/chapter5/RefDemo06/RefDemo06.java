class Person{
  private String name;
  private int age;
  private Book book;  // ����һ������һ�����һ��һ��ϵ
  private Person child; // ����һ������һ��С����һ��һ��ϵ
  public Person(String name,int age){ // ͨ�����캯������ֵ
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
  public Book getBook(){  // �õ����˵���
    return book;
  }
  public void setBook(Book b){  // ���ñ��˵���
    book = b;
  }
  public Person getChild(){ // �õ�����
    return child;
  }
  public void setChild(Person c){ // ���ú���
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
    Person per = new Person("����",30);
    Person cld = new Person("������",10);
    Book bk = new Book("���������",59.9f);
    Book cbk = new Book("java����ʵս����",79.8f);
    per.setChild(cld);  // ���ö����Ĺ�ϵ��һ������һ������
    per.setBook(bk);  
    cld.setBook(cbk);
    bk.setPerson(per);
    cbk.setPerson(cld);
    System.out.println("�����ҵ���--> ������"+ per.getName()+";���䣺"+per.getAge()+";������"+per.getBook().getTitle()+";�۸�"+per.getBook().getPrice());

    System.out.println("�����ҵ���--> ������"+ bk.getTitle()+";�۸�"+bk.getPrice()+";������"+bk.getPerson().getName()+";���䣺"+bk.getPerson().getAge());

    System.out.println(per.getName()+"�ĺ��� --> ������"+ per.getChild().getName()+";���䣺"+per.getChild().getAge()+";������"+per.getChild().getBook().getTitle()+";�۸�"+per.getChild().getBook().getPrice());
  }
}