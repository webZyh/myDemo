interface ClassName{
  public void getClassName();
}
class Company implements ClassName{
  public void getClassName(){
    System.out.println("���������Ϊ��"+ this.getClass().getName());
  }
}
class Demo1{
  public static void main(String args[]){
    Company c = new Company();
    c.getClassName();
  }
}